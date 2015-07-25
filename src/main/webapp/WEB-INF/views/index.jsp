<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>::: My egs :::</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1"	user-scalable="no">
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-2.1.1.js"/>">
	</script>
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
	
	<script type="text/javascript">
		$(document).ready(function(){
			$("a").click(function(e){
				e.preventDefault();
				var href = $(this).attr('href');
				$("#conteudo").load(href+"#conteudo");
				alert(href);
			});
		});
		
	
	</script>
	
</head>
<body>
	<div class="container" >
		<div class="row">
			<div class="col-md-3"></div>
			<div class="jumbotron col-md-6 barra-superior" >
				<div class="col-md-4">
					<a href="/managed_site/index"><button id="inicio" class="btn btn-default" >Inicio</button></a>
				</div>
				<div class="col-md-4">
					<a href="/managed_site/testa"><button id="cadastrar" class="btn btn-default">Cadastrar</button></a>
				</div>
				<div class="col-md-4">
					<a href="/managed_site/listar"><button id="listar" class="btn btn-default">Listar</button></a>
				</div>		
			</div>
			<div class="col-md-3"></div>
		</div>
		<div class="row">
			<div id="conteudo">
			
			</div>
		</div>		
	</div>
</body>
</html>