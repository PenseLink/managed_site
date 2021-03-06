<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<c:choose>
	<c:when test="${marca eq null}">
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">Cadastrar</h4>
	      </div>
	      <form method="post" action="" id="formulario">
		      <div class="modal-body">
		      <div class="form-group">
		        <label for="nome">Nome:</label>
		        <input id="nome" name="nome" class="form-control" type="text"/>
		      </div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
		        <input id="btn-submit" type="submit" class="btn btn-primary" value="Salvar" data-dismiss="modal"/>
		      </div> 
	      </form>
	    </div>
	  </div>
	</div>
	<script>
		$(document).ready(function(){
			//Abre a modal de cadastro
			$('#myModal').modal('show');
						
			//Funtion que efetiva o cadastro e insere os dados na view
			$("#btn-submit").on('click',function(){
				//dados do formulario
				var dados = $("#formulario").serialize();
				//get na tabela de Marcas
				var tabela = $('#tabela-marca').DataTable();
				$.ajax({
					type: "post",
					url: "/managed_site/marca/efetivarCadastro",
					cache: false,
					data: dados,
					success: function(response){
						var tr = '<tr id="'+response.id+'">'+'<td>'
						+response.id+'</td><td id="marca-nome-'+response.id+'">'
						+response.nome+'</td><td>'+'<a href="/managed_site/marca/editar/'
						+response.id+'" id="editar-'+response.id+'" class="btn btn-info editar glyphicon glyphicon-edit"></a>&nbsp&nbsp&nbsp<a href="/managed_site/marca/remover/'
						+response.id+'" id="remover-'+response.id+'" class="btn btn-warning excluir glyphicon glyphicon-trash"></a>'+'</td></tr>'

						tabela.row.add($(tr)).draw();						
						$("#mod-msg").load("/managed_site/sucesso");
						return true;
					},
					error: function(){
						alert("Algo muito ruim aconteceu!");
					}
				});
			});
		});
	</script>
	</c:when>
	<c:otherwise>
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">Editar</h4>
	      </div>
	      <form method="post" action="" id="formulario">
		      <div class="modal-body">
		      <div class="form-group">
		      	<input type="hidden" value="${marca.id}" name="id" id="id"/>
		        <label for="nome">Nome:</label>
		        <input id="nome" name="nome" class="form-control" type="text" value="${marca.nome}"/>
		      </div>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
		        <input id="btn-submit" type="submit" class="btn btn-primary" value="Salvar" data-dismiss="modal"/>
		      </div> 
	      </form>
	    </div>
	  </div>
	</div>
	<div id="meuTeste">
	</div>
	
	<script>
		/*
		$(document).ready(function(){
			$("#btn-submit").click(function(){
				$.post('marca/efetivarEdicao',$("#formulario").serialize());
				$("#mod-msg").load("sucesso");
				return true;
			});
		});
		*/
		
		
		$(document).ready(function(){
			
			//Abre a modal de edicao
			$('#myModal').modal('show');
			
			//Funtion que efetiva a edicao e altera os dados na view
			$("#btn-submit").click(function(e){
				var dados = $("#formulario").serialize();
				$.ajax({
					type: "post",
					url: "/managed_site/marca/efetivarEdicao",
					cache: false,
					data: dados,
					success: function(response){						
						$("#marca-nome-"+response.id).html(response.nome);
						$("editar-"+response.id).attr("href" , "/managed_site/marca/editar/"+response.id);
						$("remover-"+response.id).attr("href" , "/managed_site/marca/remover/"+response.id);
						$("#mod-msg").load("/managed_site/sucesso");
						return true;
					},
					error: function(){
						alert("Algo muito ruim aconteceu!");
					}
				});
			});
		});
	</script>
	</c:otherwise>
</c:choose>