<link rel="stylesheet" href="styles/bootstrap.min.css">
<%@ include file="header.jsp" %>
  


<div class="container">
<form:form action="addGeneric_FieldsDetails" method="post" modelAttribute="generic_fields" >

<fieldset>

<div class="form-group row">
  <label class="col-sm-2 col-form-label" for="correlation_ID">Correlation ID:</label>
   <div class="col-sm-10">
   	<form:input path="correlation_ID" class="form-control" id="correlation_ID" placeholder="Correlation ID" aria-describedby="correlation_IDHelpBlock" minlength="0" maxlength="10"/>	
	<small id="correlation_IDHelpBlock" class="form-text text-muted">
  Your correlation id will have max 10 characters long, contain letters and numbers, and must not contain spaces, special characters.
</small>
<small id="correlation_IDHelpBlock" class="form-text text-muted">
  This field is Unique and used to Identify Customer Information.
</small>
<br/>
	</div>
	
	 
   <div class="col">
   	<form:input path="correlation_ID" class="form-control" id="correlation_ID" placeholder="Correlation ID Comments" aria-describedby="correlation_IDHelpBlock" minlength="0" maxlength="500"/>	

<br/>
	</div>	
	
</div>

<div class="form-group row">
  <label class="col-sm-2 col-form-label" for="communication_Type">Communication Type:</label>
  <div class="col-sm-10">
 		<form:input path="communication_Type" class="form-control" id="communication_Type" placeholder="Communication Type" aria-describedby="communication_TypeHelpBlock" required="true"  maxlength="10"/>
		<small id="communication_TypeHelpBlock" class="form-text text-muted">
  Your Communication Type must be min 1 and max 10 characters long, contain letters and numbers, and must not contain spaces, special characters.
</small>
<small id="communication_TypeHelpBlock" class="form-text text-muted">
  This field is used to define the communication type
</small>
<br/>
		</div>
		 <div class="col">
   	<form:input path="communication_Type" class="form-control" id="communication_Type" placeholder="Communication Type Comments" aria-describedby="communication_TypeHelpBlock" minlength="0" maxlength="500"/>	

<br/>
	</div>
</div>

</fieldset>


<input type="submit" value="Add Generic Fields" class="btn btn-primary"/>

</form:form>
</div>
<%@ include file="footer.jsp" %>