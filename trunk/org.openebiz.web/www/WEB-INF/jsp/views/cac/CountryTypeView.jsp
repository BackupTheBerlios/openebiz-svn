<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.country.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.country.identification.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${country.identificationCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.country.identification.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.country.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${country.name.languageID}" />:
			<c:out value="${country.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.country.name" />" /></td>
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