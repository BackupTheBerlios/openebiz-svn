<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend>Address Line List</legend>
		<table class="form_tbody">
		<!-- element view start -->
		<tr class="form_thead">
		<th>Line</th>
		</tr>
		<c:if test="${not empty addressLineList}">
			<c:forEach items="${addressLineList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.line.languageID}" />:
				<c:out value="${item.line.value}" />
				</td>
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