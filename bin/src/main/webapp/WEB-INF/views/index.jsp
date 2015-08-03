<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>::: Managed Site :::</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1"	user-scalable="no">
        <script type="text/javascript" src="<c:url value="/resources/js/jquery-2.1.4.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-theme.min.css"/>"/>
        <script type="text/javascript">
            $(document).ready(function() {
                $("a").click(function(e) {
                    e.preventDefault();
                    var href = $(this).attr('href');
                    $("#conteudo").load(href + " #conteudo");
                });
            });
            $(document).ready(function() {
                $("button").click(function() {
                    $("button").attr('class', 'btn btn-default');
                    $(this).attr('class', 'btn btn-primary');
                });
            });
            $(document).ready(function(){
                $("a.editar").click(function(e){
                    e.preventDefault();
                    var href = $(this).attr('href');
                    $("#modal").load(href + " #myModal");
                    $("#myModal").modal('show');
                });
            });
            
        </script>
    </head>
    <body>
        <div class="container" >
            <div class="row">                
                <div class="jumbotron col-md-12 barra-superior" >
                    <div class="col-md-4">
                        <a href="/managed_site/"><button id="inicio" class="btn btn-primary" ><strong>Inicio</strong></button></a>
                    </div>
                    <div class="col-md-4">
                        <a href="/managed_site/testa"><button id="cadastrar" class="btn btn-default"><strong>Cadastrar</strong></button></a>
                    </div>
                    <div class="col-md-4">
                        <a href="/managed_site/marca/listar"><button id="listar" class="btn btn-default"><strong>Listar</strong></button></a>
                    </div>		
                </div>
            </div>
            <div class="row">
                <div id="conteudo" class="col-md-12">
                    Esse é o início
                </div>
                <div id="modal">
                    
                </div>
            </div>		
        </div>
    </body>
</html>