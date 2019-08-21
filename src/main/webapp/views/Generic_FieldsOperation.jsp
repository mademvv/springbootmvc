<%@ include file="header.jsp"%>
<div class="container">

	<table class="table table-hover">
		<thead>
			<tr class="table-primary">
				<th scope="col">Doc ID</th>
				<th scope="col">Correlation ID</th>
				<th scope="col">Communication Type</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><c:out value="${generic_fieldsData.docId}" /></td>
				<td><c:out value="${generic_fieldsData.correlation_ID}" /></td>
				<td><c:out value="${generic_fieldsData.communication_Type}" /></td>
			</tr>
		</tbody>

	</table>
	<br />

	<form method="post" action="updateGeneric_Fields">
		<input type="hidden" name="docId" value="${generic_fieldsData.docId}" /> <input
			type="submit" value="Update Generic Fields" class="btn btn-primary" />
	</form>

	<br />

	<form action="deleteGeneric_Fields">
		<input type="hidden" name="docId" value="${generic_fieldsData.docId}" /> <input
			type="submit" value="Delete Generic Fields" class="btn btn-primary" />
	</form>

</div>

<%@ include file="footer.jsp"%>