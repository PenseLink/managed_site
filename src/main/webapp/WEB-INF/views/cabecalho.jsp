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
		<link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
        <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js"/>"></script>         
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-theme.min.css"/>"/>
        <script type="text/javascript" src="<c:url value="/resources/js/jquery.DataTables.min.js"/>"></script>
        <link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/jquery.DataTables.min.css"/>"/>
        <noscript>Para continuar habilite o JavaScript</noscript>
        
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/r/dt-1.10.10/jqc-1.11.3,dt-1.10.10,b-1.1.0,se-1.1.0/datatables.min.css"/>
		<script type="text/javascript" src="https://cdn.datatables.net/r/dt-1.10.10/jqc-1.11.3,dt-1.10.10,b-1.1.0,se-1.1.0/datatables.min.js"></script>
        
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.1.0/js/dataTables.buttons.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/select/1.1.0/js/dataTables.select.min.js"></script>
        <script type="text/javascript" src="https://editor.datatables.net/extensions/Editor/js/dataTables.editor.min.js"></script>
        
        <script type="text/javascript">
        /*$(document).ready(function() {
                $("a").click(function(e) {
                    e.preventDefault();
                    var href = $(this).attr('href');
                    $("#conteudo").load(href);
                });
            });
            $(document).ready(function() {
                $(".btn-menu").click(function() {
                    $(".btn-menu").attr('class', 'btn btn-default btn-menu');
                    $(this).attr('class', 'btn btn-primary btn-menu');
                });
            });
            */
            
        </script>
        
    </head>
    <body>
        <div class="container" >
            <div class="row">                
                <div class="jumbotron col-md-12 barra-superior">
                    <div class="col-md-4">
                        <a href=""><button id="listar" class="btn btn-default btn-menu"><strong>Marca</strong></button></a>
                    </div>
                </div>
            </div>
            <div class="row">
            <div id="conteudo" class="col-md-12">