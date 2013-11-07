<link rel="stylesheet" href="resources/js/jquery/themes/base/jquery.ui.all.css">
    <script src="resources/js/jquery/jquery-1.9.1.js"></script>
    <script src="resources/js/jquery/ui/jquery.ui.core.js"></script>
    <script src="resources/js/jquery/ui/jquery-ui.js"></script>
    <script src="resources/js/simplemodal/simplemodal.js"></script>
<script src="resources/js/validationEngine/jquery.validationEngine.js"></script>
<script src="resources/js/validationEngine/jquery.talangaValidation.js"></script>
<link rel="stylesheet" href="resources/css/validationEngine.jquery.css">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<link rel="stylesheet" href="<c:url value='/resources/css/classic.css'/>">
<link rel="stylesheet" href="<c:url value='/resources/css/classic.date.css'/>">

<script type="text/javascript" src="resources/js/picker.js"></script>
<script type="text/javascript" src="resources/js/picker.date.js"></script>

<script type="text/javascript" src="resources/js/mask.js"></script>

<script>

$(document).ready(function(){
   $('.date').mask('#,#,a', {reverse: true, maxlength: false});
});

</script>
<body>
<label>Date</label><input type="text"  class="date"/>
</body>