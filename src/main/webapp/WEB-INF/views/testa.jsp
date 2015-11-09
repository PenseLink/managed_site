<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<jsp:include page="cabecalho.jsp"></jsp:include>         
<script type="text/javascript">
	//Carrega a tela de edição
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

  	var editor;
  	//Formata a tabela
    $(document).ready(function(){
        editor = new $.fn.dataTable.Editor({});
		$.ajax({
			url: '/managed_site/marca/webServiceListar',
			method: 'post',
			dataType: 'json',
			success: function(data){
				$('#tabelaNomes').dataTable({
					data: data,
					columns:[
						{ "data": "id" },
						{ "data": "nome" }
					],
					select: true
				});
			}
		});
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
        <table id="tabelaNomes">
			<thead>
				
				<th>Id</th>
				<th>Nome</th>
			</thead>
			<tbody>
				
			</tbody>
		</table>
    </div>    
</div>
<div id="mod">
                    
</div>
<div id="mod-msg">

</div>


<jsp:include page="rodape.jsp"></jsp:include>