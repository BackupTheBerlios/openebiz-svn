<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Other Communication List</legend>
		<spring:hasBindErrors name="otherCommunicationList">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr class="form_thead">
		<th>Channel Code</th>
		<th>Value</th>
		</tr>
		<c:if test="${not empty otherCommunicationList}">
			<c:forEach items="${otherCommunicationList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.channelCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.value.languageID}" />:
				<c:out value="${item.value.value}" />
				</td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
		<!-- form element end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_addOtherCommunication" value="<fmt:message key="ui.button.add" />" />
			<input type="submit" class="button" name="_eventId_clearOtherCommunication" value="<fmt:message key="ui.button.clear" />" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>