package com.ap.promotions.jalo;

import de.hybris.platform.core.CoreAlgorithms;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.promotions.jalo.AbstractPromotionRestriction;
import de.hybris.platform.promotions.jalo.PromotionProductRestriction;
import de.hybris.platform.promotions.jalo.PromotionResult;
import de.hybris.platform.promotions.jalo.PromotionsManager;
import de.hybris.platform.promotions.result.PromotionEvaluationContext;
import de.hybris.platform.promotions.util.Helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;


public class AsianPaintsOrderThresholdDiscountPromotion extends GeneratedAsianPaintsOrderThresholdDiscountPromotion
{
	@SuppressWarnings("unused")
	private final static Logger LOG = Logger.getLogger(AsianPaintsOrderThresholdDiscountPromotion.class.getName());

	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes)
			throws JaloBusinessException
	{
		// business code placed here will be executed before the item is created
		// then create the item
		final Item item = super.createItem(ctx, type, allAttributes);
		// business code placed here will be executed after the item was created
		// and return the item
		return item;
	}

	@Override
	public List<PromotionResult> evaluate(final SessionContext ctx, final PromotionEvaluationContext promoContext)
	{
		final List promotionResults = new ArrayList();

		if (checkRestrictions(ctx, promoContext))
		{
			final Double threshold = getPriceForOrder(ctx, getThresholdTotals(ctx), promoContext.getOrder(), "thresholdTotals");
			if (threshold != null)
			{
				final Double discountPriceValue = getPriceForOrder(ctx, getDiscountPrices(ctx), promoContext.getOrder(),
						"discountPrices");
				if (discountPriceValue != null)
				{
					final AbstractOrder order = promoContext.getOrder();
					//final double orderSubtotalAfterDiscounts = getOrderSubtotalAfterDiscounts(ctx, order);
					final double orderSubtotalAfterDiscounts = getOrderSubtotalWithoutDiscountedProducts(ctx, order);

					if (orderSubtotalAfterDiscounts >= threshold.doubleValue())
					{
						if (LOG.isDebugEnabled())
						{
							LOG.debug("(" + getPK() + ") evaluate: Subtotal " + orderSubtotalAfterDiscounts + ">" + threshold
									+ ".  Creating a discount action for value:" + discountPriceValue + ".");
						}
						final PromotionResult result = PromotionsManager.getInstance().createPromotionResult(ctx, this,
								promoContext.getOrder(), 1.0F);


						double realDiscountPriceValue = discountPriceValue.doubleValue();
						if (realDiscountPriceValue > orderSubtotalAfterDiscounts)
						{
							realDiscountPriceValue = orderSubtotalAfterDiscounts;
						}
						result.addAction(ctx,
								PromotionsManager.getInstance().createPromotionOrderAdjustTotalAction(ctx, -realDiscountPriceValue));

						promotionResults.add(result);

					}
					else
					{
						if (LOG.isDebugEnabled())
						{
							LOG.debug("(" + getPK() + ") evaluate: Subtotal " + orderSubtotalAfterDiscounts + "<" + threshold
									+ ".  Skipping discount action.");
						}
						final float certainty = (float) (orderSubtotalAfterDiscounts / threshold.doubleValue());
						final PromotionResult result = PromotionsManager.getInstance().createPromotionResult(ctx, this,
								promoContext.getOrder(), certainty);
						promotionResults.add(result);
					}
				}
			}
		}

		return promotionResults;
	}

	@Override
	public String getResultDescription(final SessionContext ctx, final PromotionResult result, final Locale locale)
	{
		final AbstractOrder order = result.getOrder(ctx);
		if (order != null)
		{
			final Currency orderCurrency = order.getCurrency(ctx);

			final Double threshold = getPriceForOrder(ctx, getThresholdTotals(ctx), order, "thresholdTotals");
			if (threshold != null)

			{
				final Double discountPriceValue = getPriceForOrder(ctx, getDiscountPrices(ctx), order, "discountPrices");
				if (discountPriceValue != null)
				{
					if (result.getFired(ctx))

					{
						final Object[] args =
						{ threshold, Helper.formatCurrencyAmount(ctx, locale, orderCurrency, threshold.doubleValue()),
								discountPriceValue,
								Helper.formatCurrencyAmount(ctx, locale, orderCurrency, discountPriceValue.doubleValue()) };
						return formatMessage(getMessageFired(ctx), args, locale);
					}
					if (result.getCouldFire(ctx))
					{
						//final double orderSubtotalAfterDiscounts = getOrderSubtotalAfterDiscounts(ctx, order);
						final double orderSubtotalAfterDiscounts = getOrderSubtotalWithoutDiscountedProducts(ctx, order);
						final double amountRequired = threshold.doubleValue() - orderSubtotalAfterDiscounts;


						final Object[] args =
						{ threshold, Helper.formatCurrencyAmount(ctx, locale, orderCurrency, threshold.doubleValue()),
								discountPriceValue,
								Helper.formatCurrencyAmount(ctx, locale, orderCurrency, discountPriceValue.doubleValue()),
								Double.valueOf(amountRequired), Helper.formatCurrencyAmount(ctx, locale, orderCurrency, amountRequired) };
						return formatMessage(getMessageCouldHaveFired(ctx), args, locale);
					}
				}
			}
		}

		return "";
	}

	protected double getOrderSubtotalWithoutDiscountedProducts(final SessionContext ctx, final AbstractOrder order)
	{
		double subTotal = 0.00D;
		final Collection<Product> restrictedProducts = getRestrictedProduct(ctx);
		final List<AbstractOrderEntry> entries = order.getAllEntries();

		for (final AbstractOrderEntry entry : entries)
		{
			// Restricted products: products are excluded from promotion by creating product restriction.
			if ((!isRestrictedProduct(restrictedProducts, entry.getProduct())))
			{
				subTotal += entry.getTotalPrice();
			}
		}

		final double globalDiscount = getOrderPromotionDiscount(order);

		if (globalDiscount > 0)
		{
			subTotal -= globalDiscount;
		}

		if (subTotal < 0.00)
		{
			// Due to rounding issue sometimes value is less than zero. The LOG message below will help us figure out if there is bug or not.
			LOG.error(this.getPromotionType() + " : orderSubtotalWithoutDiscountProducts < 0 for order[" + order
					+ "]. orderSubtotalWithoutDiscountProducts :" + subTotal + " . Please verify if it is rounding issue or bug.....");

			subTotal = 0.00D;
		}

		return CoreAlgorithms.round(subTotal, 2);
	}

	private Collection<Product> getRestrictedProduct(final SessionContext ctx)
	{
		final Collection<Product> restrictedProductsCollection = new ArrayList<Product>();
		final Collection<AbstractPromotionRestriction> restrictions = this.getRestrictions();

		for (final AbstractPromotionRestriction restriction : restrictions)
		{
			if (restriction instanceof PromotionProductRestriction)
			{
				restrictedProductsCollection.addAll(((PromotionProductRestriction) restriction).getProducts(ctx));
			}
		}

		return CollectionUtils.isEmpty(restrictedProductsCollection) ? null : restrictedProductsCollection;
	}

	private boolean isRestrictedProduct(final Collection<Product> restrictedProducts, final Product testProduct)
	{
		if (CollectionUtils.isEmpty(restrictedProducts))
		{
			return false;
		}

		boolean result = restrictedProducts.contains(testProduct);

		if (!result)
		{
			final List<Product> baseProducts = Helper.getBaseProducts(getSession().getSessionContext(), testProduct);
			for (final Product baseProduct : baseProducts)
			{
				if (restrictedProducts.contains(baseProduct))
				{
					result = true;
					break;
				}
			}
		}
		return result;
	}

	protected double getOrderPromotionDiscount(final AbstractOrder order)
	{
		return order.getTotalDiscounts().doubleValue();
	}

}
