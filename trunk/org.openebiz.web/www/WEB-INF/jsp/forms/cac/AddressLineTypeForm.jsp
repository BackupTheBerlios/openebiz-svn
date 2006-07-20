<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.addressline.details" /></legend>
		<spring:hasBindErrors name="addressLine">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="addressLine">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.addressline.line.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${addressLine.line.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.addressline.line.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLine" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
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