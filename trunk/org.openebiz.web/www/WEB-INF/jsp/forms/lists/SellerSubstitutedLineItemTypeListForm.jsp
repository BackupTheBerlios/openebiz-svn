<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Seller Substituted Line Item List</legend>
		<spring:hasBindErrors name="sellerSubstitutedLineItemList">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>Sales Order ID</th>
		<th>Globally Unique GUID</th>
		<th>Note</th>
		<th>Line Status Code</th>
		<th>Quantity</th>
		<th>Line Extension Amount</th>
		<th>Total Tax Amount</th>
		<th>Minimum Quantity</th>
		<th>Maximum Quantity</th>
		<th>Minimum Backorder Quantity</th>
		<th>Maximum Backorder Quantity</th>
		<th>Inspection Method Code</th>
		<th>Partial Delivery Indicator</th>
		<th>Back Order Allowed Indicator</th>
		<th>Accounting Cost Code</th>
		<th>Delivery Terms</th>
		<th>Party</th>
		<th>Base Price</th>
		<th>Item</th>
		</tr>
		<c:if test="${not empty sellerSubstitutedLineItemList}">
			<c:forEach items="${sellerSubstitutedLineItemList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.ID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.salesOrderID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.globallyUniqueGUID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.note.languageID}" />:
				<c:out value="${item.note.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.lineStatusCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.quantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.lineExtensionAmount.value}" />
				<c:out value="${item.lineExtensionAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.totalTaxAmount.value}" />
				<c:out value="${item.totalTaxAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.minimumQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.maximumQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.minimumBackorderQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.maximumBackorderQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.inspectionMethodCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.partialDeliveryIndicator.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.backOrderAllowedIndicator.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.accountingCostCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.deliveryTerms.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.destinationParty.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.basePrice.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.item.shortDisplay}" /></td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
		<!-- form element end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_addSellerSubstitutedLineItem" value="<fmt:message key="ui.button.add" />" />
			<input type="submit" class="button" name="_eventId_clearSellerSubstitutedLineItem" value="<fmt:message key="ui.button.clear" />" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>