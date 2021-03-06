<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.partylegalentity.details" /></legend>
		<spring:hasBindErrors name="partyLegalEntity">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="partyLegalEntity">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.partylegalentity.registrationname.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${partyLegalEntity.registrationName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.partylegalentity.registrationname.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRegistrationName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.partylegalentity.companyidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${partyLegalEntity.companyID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.partylegalentity.companyidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCompanyID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.partylegalentity.registrationaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="${partyLegalEntity.registrationAddress.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.partylegalentity.registrationaddress.address" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRegistrationAddress" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.partylegalentity.corporateregistrationscheme" />:</td>
			<td class="form_tdispcol">
			<c:out value="${partyLegalEntity.corporateRegistrationScheme.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.partylegalentity.corporateregistrationscheme" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCorporateRegistrationScheme" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
		<!-- form element end -->
		</table>
		</spring:nestedPath>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>