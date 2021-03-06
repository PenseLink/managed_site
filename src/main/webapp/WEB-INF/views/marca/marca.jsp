<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<jsp:include page="../cabecalho.jsp"></jsp:include>         
<script type="text/javascript">
	//Carrega a tela de edi��o
	$(document).on('click','.editar',function(e){
		e.preventDefault();
	   	var href = $(this).attr('href');
	    $("#mod").load(href);
	});
	
	//Carrega a tela de cadastro
    $(document).on('click','.cadastrar',function(e){
    	e.preventDefault();
       	var href = $(this).attr('href');
        $("#mod").load(href);
    });
	
  	//Carrega a tela de cadastro
    $(document).on('click','.excluir',function(e){
    	e.preventDefault();
       	var href = $(this).attr('href');
        $("#mod").load(href);
    });
  	
  	//Formata a tabela
    $(document).ready(function(){ 
	    $('#tabela-marca').DataTable();
	});
	
	
</script>

<div id="conteudo">
	<div class="col-md-3"></div>
	<div class="col-md-9">
		<div class="col-md-12">		
			<a href="/managed_site/marca/cadastrar" class="btn btn-success cadastrar">Novo</a>
		</div>	
	</div>
	<br/><br/><br/>
    <div class="col-md-3"></div>
    <div class="tabela col-md-6 text-center">
        <table datatable="" class="table table-striped table-bordered table-compact" id="tabela-marca">
            <thead>
                <th>N�mero</th>
                <th>Nome </th>
                <th>A��es</th>
            </thead>
            <tbody>            
            		<c:forEach var="marca" items="${marcas}">
		                <tr id="${marca.id}">
		                    <td>${marca.id}</td>
		                    <td id="marca-nome-${marca.id}">${marca.nome}</td>
		                    <td><a id="editar-${marca.id}" href="/managed_site/marca/editar/${marca.id}" class="btn btn-info editar glyphicon glyphicon-edit"></a>&nbsp&nbsp&nbsp<a id="remover-${marca.id}" href="/managed_site/marca/remover/${marca.id}"  class="btn btn-warning excluir glyphicon glyphicon-trash"></a>
		                    </td>
		                </tr>
		            </c:forEach>            	
            	                        
            </tbody>
        </table>
    </div>    
</div>
<div id="mod">
                    
</div>
<div id="mod-msg">

</div>


<jsp:include page="../rodape.jsp"></jsp:include>