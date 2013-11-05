<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <script src="resources/js/extjs/ext-all.js"></script>
<link rel="stylesheet" href="resources/js/extjs/resources/css/ext-all.css"> -->

    <link rel="stylesheet" href="resources/js/jquery/themes/base/jquery.ui.all.css">
    <script src="resources/js/jquery/jquery-1.9.1.js"></script>
    <script src="resources/js/jquery/ui/jquery.ui.core.js"></script>
    <script src="resources/js/jquery/ui/jquery-ui.js"></script>
    
    <link rel="stylesheet" type="text/css" href="resources/js/flexigrid/css/flexigrid.css">
    <script type="text/javascript" src="resources/js/flexigrid/js/flexigrid.js"></script>
    
    <script type="text/javascript" src="resources/js/jquery.simplemodal.1.4.4.min.js"></script>
    <link rel="stylesheet" type="text/css" href="resources/css/simplemodal.css">
    
    <link rel="stylesheet" href="<c:url value='/resources/css/classic.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/classic.date.css'/>">

<script type="text/javascript" src="resources/js/picker.js"></script>
<script type="text/javascript" src="resources/js/picker.date.js"></script>
    
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>

<script type="text/javascript">
$(document).ready(function(){
    
    $('.datepicker').pickadate({
        format : 'mm/dd/yyyy',
        formatSubmit : 'mm/dd/yyyy'
    });
	
	$("#showform").click(function(){
	    $.get("customerUI",function(data){
	        $.modal(data);
		});
	    
	});
});
</script>

</head>

<body>
<p>
                <label for="date">date</label> <span class="displayib"><input
                    type="text" class="datepicker" name="dueDate" id="dueDate" /></span>
            </p>

<input type="button" value="show form" id="showform"></input>

<div id= "formdiv">
</div>

</body>
</html>