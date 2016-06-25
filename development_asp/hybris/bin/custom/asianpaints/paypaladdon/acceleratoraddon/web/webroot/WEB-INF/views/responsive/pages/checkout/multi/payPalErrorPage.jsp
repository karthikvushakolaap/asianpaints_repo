<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/responsive/common" %>

<c:url value="${redirectUrl}" var="continueUrl"/>
<template:page pageTitle="${pageTitle}" hideHeaderLinks="true">

	<div id="globalMessages">
    		<common:globalMessages/>
    	</div>

    	<cms:pageSlot position="SideContent" var="feature" element="div" class="span-4 side-content-slot cms_disp-img_slot">
    		<cms:component component="${feature}"/>
    	</cms:pageSlot>

    	<div class="span-20 last">
    		<div class="span-20 last">
    			<div class="item_container_holder">
    				<div class="title_holder">
    					<h2><spring:theme code="checkout.multi.hostedOrderPageError.header"/></h2>
    				</div>
    				<div class="item_container">
                        <div id="errorDetailsSection">
                            <c:if test="${not empty errorsDetails}">
                                <c:forEach items="${reasonCodes}" var="reasonCode">
                                    <span class=" form_field_error">
                                        <p id="errorDetailsText">
                                            <%--<spring:theme code="checkout.multi.hostedOrderPageError.${decision}.${reasonCode}"/>--%>
                                            ${reasonCode}: ${errorsDetails[reasonCode]}
                                        </p>
                                    </span>
                                </c:forEach>
                            </c:if>
                            <a id="continueButton" href="${continueUrl}" class="positive right"><spring:theme code="checkout.multi.hostedOrderPageError.continue"/></a>
                        </div>
    				</div>
    			</div>
    		</div>
    	</div>



	<cms:pageSlot position="SideContent" var="feature" element="div" class="side-content-slot cms_disp-img_slot">
		<cms:component component="${feature}"/>
	</cms:pageSlot>
</template:page>
