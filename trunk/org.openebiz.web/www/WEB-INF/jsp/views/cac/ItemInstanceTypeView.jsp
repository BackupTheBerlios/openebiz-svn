<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.iteminstance.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.iteminstance.producttraceidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${itemInstance.productTraceID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.iteminstance.producttraceidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.iteminstance.manufacturedatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty itemInstance.manufactureDateTime.value}">
			<fmt:formatDate value="${itemInstance.manufactureDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>	
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.iteminstance.manufacturedatetime.datetime" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.iteminstance.registrationdatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty itemInstance.registrationDateTime.value}">
			<fmt:formatDate value="${itemInstance.registrationDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>	
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.iteminstance.registrationdatetime.datetime" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.iteminstance.registrationidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${itemInstance.registrationID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.iteminstance.registrationidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.iteminstance.serialidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${itemInstance.serialID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.iteminstance.serialidentifier.identifier" />" /></td>
		</tr>							
	
<!-- AdditionalItemProperty list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.iteminstance.additionalitemproperty.itemproperty" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalItemProperty List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.iteminstance.additionalitemproperty.itemproperty" />" /></td>
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