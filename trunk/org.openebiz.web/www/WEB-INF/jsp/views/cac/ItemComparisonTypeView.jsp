<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.itemcomparison.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemcomparison.price.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${itemComparison.priceAmount.value}" />
			<c:out value="${itemComparison.priceAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemcomparison.price.amount" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemcomparison.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemComparison.quantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemcomparison.quantity" />" /></td>
		</tr>				
	
		<!-- element view end -->
		</table>	
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
			<input type="submit" class="button" name="_eventId_end" value="Return">
		</div>
	</fieldset>
	</div>
</form>
<%@ include file="/WEB-INF/jsp/views/viewFooter.jsp" %>