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
        <!-- <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js"/>"></script> -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
             
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-theme.min.css"/>"/>
        <script type="text/javascript" src="<c:url value="/resources/js/jquery.DataTables.min.js"/>"></script>
        <link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/jquery.DataTables.min.css"/>"/>

        
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