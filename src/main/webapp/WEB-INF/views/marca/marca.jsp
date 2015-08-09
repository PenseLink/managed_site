<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<jsp:include page="../cabecalho.jsp"></jsp:include>         
<script type="text/javascript">
    $(document).ready(function(){
	    $(".editar").click(function(e){
	    	e.preventDefault();
	       	var href = $(this).attr('href');
	        $("#mod").load(href);
	    });
	    $(".cadastrar").click(function(e){
	    	e.preventDefault();
	       	var href = $(this).attr('href');
	        $("#mod").load(href);
	    });
	    
	    $('#tabela-marca').DataTable();
	});
</script>

<div id="conteudo">
	<div class="col-md-3"></div>
	<div class="col-md-6">
		<div class="col-md-12">
			<a href="/managed_site/marca/cadastrar" class="btn btn-success cadastrar">Cadastrar</a>
		</div>	
	</div>
    <div class="col-md-3"></div>
    
    <div class="col-md-3"></div>    
    <div class="tabela col-md-6 text-center">
        <table datatable="" class="table table-striped table-bordered table-compact" id="tabela-marca">
            <thead>
                <th>Número</th>
                <th>Nome </th>
                <th>Ações</th>
            </thead>
            <tbody>
            <c:forEach var="marca" items="${marcas}">
                <tr id="${marca.id}">
                    <td>${marca.id}</td>
                    <td id="marca-nome-${marca.id}">${marca.nome}</td>
                    <td><a id="editar-${marca.id}" href="/managed_site/marca/editar/${marca.id}" class="btn btn-info editar glyphicon glyphicon-edit"></a>
                        &nbsp &nbsp &nbsp 
                        <a id="remover-${marca.id}" href="/managed_site/marca/remover/${marca.id}"  class="btn btn-warning excluir glyphicon glyphicon-trash"></a>
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