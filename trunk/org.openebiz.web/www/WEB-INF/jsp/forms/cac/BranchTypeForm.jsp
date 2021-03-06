<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.branch.details" /></legend>
		<spring:hasBindErrors name="branch">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="branch">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.branch.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${branch.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.branch.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.branch.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${branch.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.branch.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.branch.financialinstitution" />:</td>
			<td class="form_tdispcol">
			<c:out value="${branch.financialInstitution.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.branch.financialinstitution" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFinancialInstitution" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.branch.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="${branch.address.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.branch.address" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAddress" value="<fmt:message key="ui.button.edit" />" /></td>
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