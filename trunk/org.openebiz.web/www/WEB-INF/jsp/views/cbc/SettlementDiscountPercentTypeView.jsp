<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<fieldset>
		<legend>Settlement Discount Percent</legend>
		<div class="form_wrapper">
		<div class="form_content">
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol">Settlement Discount Percent:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber type="percent" value="${settlementDiscountPercent.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="PercentType" /></td>
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