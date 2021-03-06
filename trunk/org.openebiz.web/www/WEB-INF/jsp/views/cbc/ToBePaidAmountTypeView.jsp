<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<fieldset>
		<legend>To Be Paid Amount</legend>
		<div class="form_wrapper">
		<div class="form_content">
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol">To Be Paid Amount:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${toBePaidAmount.value}" />
			<c:out value="${toBePaidAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="AmountType" /></td>
		</tr>		
		<!-- element view end -->
		</table>	
		</div>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
			<input type="submit" class="button" name="_eventId_end" value="Return">
		</div>
	</div>
	</fieldset>
</form>
<%@ include file="/WEB-INF/jsp/views/viewFooter.jsp" %>