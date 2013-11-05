<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

    <link rel="stylesheet" href="resources/js/jquery/themes/base/jquery.ui.all.css">
    <script src="resources/js/jquery/jquery-1.9.1.js"></script>
    <script src="resources/js/jquery/ui/jquery.ui.core.js"></script>
    <script src="resources/js/jquery/ui/jquery-ui.js"></script>
    
    <link rel="stylesheet" type="text/css" href="resources/js/flexigrid/css/flexigrid.css">
    <script type="text/javascript" src="resources/js/flexigrid/js/flexigrid.js"></script>
    

<script>

$(document).ready(function(){
/*     $.get("pieData", function(data) {
        $.each(data,function(InfoIndex,Info){
        });
    }); */
    
    $("#flex1").flexigrid({
    	url: 'pieData',
    	dataType: 'json',
    	colModel : [
    		{display: 'id', name : 'id', width : 40, sortable : true, align: 'center'},
    		{display: 'name', name : 'name', width : 180, sortable : true, align: 'center'},
    		{display: 'data1', name : 'data1', width : 120, sortable : true, align: 'center'}
    		],
    	buttons : [
    		{name: 'Add', bclass: 'add', onpress : test},
    		{name: 'Delete', bclass: 'delete', onpress : test},
    		{separator: true}
    		],
    	searchitems : [
    		{display: 'id', name : 'id'},
    		{display: 'name', name : 'name', isdefault: true}
    		],
    	sortname: "name",
    	sortorder: "asc",
    	usepager: true,
    	title: 'test',
    	useRp: true,
    	rp: 15,
    	showTableToggleBtn: true,
    	width: 700,
    	height: 200
    }); 
    function test(com, grid) {
        if (com == 'Delete') {
            confirm('Delete ' + $('.trSelected', grid).length + ' items?')
        } else if (com == 'Add') {
            alert('Add New Item');
        }
    }
    
});
</script>



<body>

<table id="flex1" style="display:none"></table>
</body>
</html>



