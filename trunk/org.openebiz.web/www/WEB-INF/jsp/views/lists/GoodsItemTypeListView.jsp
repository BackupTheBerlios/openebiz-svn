<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend>Goods Item List</legend>
		<table class="form_tbody">
		<!-- element view start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>Sequence Number ID</th>
		<th>Hazardous Risk Indicator</th>
		<th>Declared Customs Value Amount</th>
		<th>Declared For Carriage Value Amount</th>
		<th>Declared Statistics Value Amount</th>
		<th>Free On Board Value Amount</th>
		<th>Insurance Value Amount</th>
		<th>Value Amount</th>
		<th>Gross Weight Measure</th>
		<th>Net Weight Measure</th>
		<th>Net Net Weight Measure</th>
		<th>Chargeable Weight Measure</th>
		<th>Gross Volume Measure</th>
		<th>Net Volume Measure</th>
		<th>Quantity Numeric</th>
		<th>Preference Criterion Code</th>
		<th>Required Customs ID</th>
		<th>Customs Status Code</th>
		<th>Customs Tariff Quantity</th>
		<th>Address</th>
		</tr>
		<c:if test="${not empty goodsItemList}">
			<c:forEach items="${goodsItemList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.ID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.sequenceNumberID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.hazardousRiskIndicator.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.declaredCustomsValueAmount.value}" />
				<c:out value="${item.declaredCustomsValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.declaredForCarriageValueAmount.value}" />
				<c:out value="${item.declaredForCarriageValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.declaredStatisticsValueAmount.value}" />
				<c:out value="${item.declaredStatisticsValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.freeOnBoardValueAmount.value}" />
				<c:out value="${item.freeOnBoardValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.insuranceValueAmount.value}" />
				<c:out value="${item.insuranceValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.valueAmount.value}" />
				<c:out value="${item.valueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.grossWeightMeasure.value}" />
				<c:out value="${item.grossWeightMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.netWeightMeasure.value}" />
				<c:out value="${item.netWeightMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.netNetWeightMeasure.value}" />
				<c:out value="${item.netNetWeightMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.chargeableWeightMeasure.value}" />
				<c:out value="${item.chargeableWeightMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.grossVolumeMeasure.value}" />
				<c:out value="${item.grossVolumeMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.netVolumeMeasure.value}" />
				<c:out value="${item.netVolumeMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.quantityNumeric.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.preferenceCriterionCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.requiredCustomsID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.customsStatusCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.customsTariffQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.originAddress.shortDisplay}" /></td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
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