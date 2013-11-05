<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<script type="text/javascript">
    $(document).ready(function() {
        $("#loginForm").validationEngine('attach', {
            autoHidePrompt : true,
            autoHideDelay : 3000
        });

        $("#forgetPassword").click(function() {
            if ($("#userid").val().length > 0) {
                $.get("<c:url value='/forgetPassword/'/>" + $("#userid").val(), function(data) {
                    WSC_ShowMessage(data.content);
                });
            }
        });
    });
</script>
<div class="holder">
	<div class="login-form">
		<div class="holder">
			<div class="frame">
				<h2 id="page-title">
					<spring:message code="text_login_title" />
				</h2>
				<form class="login" method="post" name="loginForm" id="loginForm" action='<c:url value="/j_spring_security_check"/>'>
					<div class="form-item form-item-text">
						<label><spring:message code="title_username" /></label> <input type="text" form-item form-item-text" value='${userName}' />
					</div>
					<div class="form-item form-item-text">
						<label><spring:message code="title_password" /></label> <input type="password" type="password" name="j_password"
							form-item form-item-text" />
						<c:if test="${hasError}">
							<c:choose>
								<c:when test="${isLocked }">
									<span class="login-prompting"><spring:message code="user_logout" /></span>
								</c:when>
								<c:otherwise>
									<span class="login-prompting"><spring:message code="error_invalid_username_passwd" /></span>
									<c:if test="${wrongUserName}">
										<c:if test="${counter==0}">
											<span class="login-prompting"><spring:message code="login_failed" /></span>
										</c:if>

										<c:if test="${counter!=0}">
											<span class="login-prompting"> <spring:message code="login_failed_times" arguments="${counter}" /></span>
										</c:if>
									</c:if>
								</c:otherwise>
							</c:choose>
						</c:if>
					</div>

					<div class="form-item form-item-checkbox" id="keepMeSignedIn">
						<input type="checkbox" name="_spring_security_remember_me" class="form-checkbox" /> <label><spring:message
								code="text_keep_log_in" arguments="Me" /></label>
					</div>

					<div class="form-item form-item-submit">
						<input type="submit" value="<spring:message code="text_login_button"/>" class="form-submit button" id="login"
							style="min-width: 40px \9;" /> <input type="button" value="<spring:message code="text_forgot_passwd"/>"
							class="form-submit button" id="forgetPassword" />
					</div>
				</form>
			</div>
		</div>
	</div>
</div>