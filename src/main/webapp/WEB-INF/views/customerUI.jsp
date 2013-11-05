<!-- <link rel="stylesheet" href="resources/js/jquery/themes/base/jquery.ui.all.css">
    <script src="resources/js/jquery/jquery-1.9.1.js"></script>
    <script src="resources/js/jquery/ui/jquery.ui.core.js"></script>
    <script src="resources/js/jquery/ui/jquery-ui.js"></script>
    <script src="resources/js/simplemodal/simplemodal.js"></script> -->
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
    
<script>

    $(document).ready(function(){
        $('.datepicker').pickadate({
            format : 'mm/dd/yyyy',
            formatSubmit : 'mm/dd/yyyy'
        });
        
        if(navigator.userAgent.indexOf('Chrome/3') != -1){
            $('input[type=date]').on('click', function(event) {
                alert("test");
                event.preventDefault();
            });
        }
        
    });

</script>


	<div class="container" id="popup">
    <div class="titlebar">
        add my goal
    </div>
    <div class="formcontainer">
        <form id="addMyGoalForm" name="addMyGoalForm" method="post" action="<c:url value='/createMyGoal'/>">
            <p>
                <label for="name">name</label> <input type="text" name="name"
                    id="name" displayName="goal" isEdit=false functionName="checkGoalNameExist" />
            </p>
            <p>
                <label for="description">description</label>
                <textarea name="description" id="description" cols="45" rows="5"></textarea>
            </p>
            <p>
                <label for="date">date</label> <span class="displayib"><input
                    type="text" class="datepicker" name="dueDate" id="dueDate" /></span>
            </p>

           <p class="savetext">
                <a href="####" id="saveandexitforcreate" class="first">save</a>
                <a href="####" id="saveandaddanother">save and add</a><br />
            </p>
        </form>
    </div>
</div>
<script>
    
</script>