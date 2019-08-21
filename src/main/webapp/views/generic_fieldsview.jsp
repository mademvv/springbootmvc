<%@ include file="header.jsp" %>

<div class="container">
<table class="table table-hover">
<thead>
<tr class="table-primary"><th scope="col">Doc ID</th><th scope="col">Correlation ID</th><th scope="col">Communication Type</th></tr>
</thead>

<c:forEach items="${generic_fieldsList}" var="generic_fields">
<tbody>
    <tr>
        <td> <c:out value="${generic_fields.docId}"/></td>
        <td> <c:out value="${generic_fields.correlation_ID}"/></td>  
        <td> <c:out value="${generic_fields.communication_Type}"/> </td>
    </tr>
</tbody>

</c:forEach>
</table>

<br/>

<a href="addNewGeneric_Fields" type="button" class="btn btn-primary" >Add New Generic Fields</a>

<br/>


<form action="generic_fields">


<div class="form-group">
<label for="docId">Enter Doc Id :</label> 
<input class="form-control" id="docId" type="text" name="docId"/>
</div>


<input type="submit" value="Find Generic Fields By Id" class="btn btn-primary"/>
</form>

</div>

<br/>
<hr/>
<br/>

<%@ include file="footer.jsp" %>