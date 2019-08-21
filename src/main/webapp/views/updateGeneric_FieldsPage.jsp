<%@ include file="header.jsp" %>
<div class="container">

<h2>To Update Generic Fields</h2>

<form:form action="updateGeneric_FieldsDetails" method="post" modelAttribute="generic_fieldsDetails">
<fieldset>

<form:input type="hidden" path="docId" value="${generic_fieldsDetails.docId}"/>

<%-- Employee Name: <form:input path="empName" value="${employeeDetails.empName}"/>
				<form:errors path="empName"/><br/>
Employee Department : <form:input path="deptName" value="${employeeDetails.deptName}"/>
					<form:errors path="deptName"/><br/> --%>
					
<div class="form-group">
  <label class="col-form-label" for="correlation_ID">Correlation ID:</label>
   	<form:input path="correlation_ID" value="${generic_fieldsDetails.correlation_ID}" class="form-control"/>
	<form:errors path="correlation_ID" class="form-control"/><br/>
</div>

<div class="form-group">
  <label class="col-form-label" for="communication_Type">Communication Type:</label>
 	<form:input path="communication_Type" value="${generic_fieldsDetails.communication_Type}" class="form-control"/>
	<form:errors path="communication_Type" class="form-control"/>
</div>

</fieldset>
<input type="submit" value="update Generic Fields" class="btn btn-primary"/>

</form:form>

</div>
<%@ include file="footer.jsp" %>