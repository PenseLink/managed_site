<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>::: Login - Managed Site :::</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1"
	user-scalable="no">
<script type="text/javascript"
	src="<c:url value="/resources/js/jquery-2.1.4.min.js"/>"></script>
<link type="text/css" rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css"/>" />
<script type="text/javascript"
	src="<c:url value="/resources/js/bootstrap.js"/>"></script>
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap-theme.min.css"/>" />
<script>
	
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="col-md-12">
					<div id="loginbox" style="margin-top: 50px;"
						class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
						<div class="panel panel-info">
							<div class="panel-heading">
								<div class="panel-title">Login</div>
								<div
									style="float: right; font-size: 80%; position: relative; top: -10px">
									<a href="#">Esqueceu sua senha?</a>
								</div>
							</div>

							<div style="padding-top: 30px" class="panel-body">

								<div style="display: none" id="login-alert"
									class="alert alert-danger col-sm-12"></div>

								<form id="loginform" class="form-horizontal" role="form" action="verificaLogin" method="post">
									<div style="margin-bottom: 25px" class="input-group">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-user"></i></span> <input
											id="login-username" type="text" class="form-control"
											name="username" value="" placeholder="nome de usuário ou e-mail">
									</div>

									<div style="margin-bottom: 25px" class="input-group">
										<span class="input-group-addon"><i
											class="glyphicon glyphicon-lock"></i></span> <input
											id="login-password" type="password" class="form-control"
											name="password" placeholder="*******">
									</div>



									<div class="input-group">
										<div class="checkbox">
											<label> <input id="login-remember" type="checkbox"
												name="remember" value="1"> Lembrar
											</label>
										</div>
									</div>


									<div style="margin-top: 10px" class="form-group">
										<!-- Button -->

										<div class="col-sm-12 controls">
											<a id="btn-login" href="#" class="btn btn-success">Entrar
											</a> <a id="btn-fblogin" href="#" class="btn btn-primary">Entrar
												com o Facebook</a>

										</div>
									</div>


									<div class="form-group">
										<div class="col-md-12 control">
											<div
												style="border-top: 1px solid #888; padding-top: 15px; font-size: 85%">
												Não tem uma conta?! <a href="#">
													Cadastre-se! </a>
											</div>
										</div>
									</div>
								</form>



							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>