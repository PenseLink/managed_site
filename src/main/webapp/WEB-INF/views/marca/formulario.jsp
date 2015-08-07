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
			$('#myModal').modal('show');
		});
	
		/* CODIGO FUNCIONANDO NÃO RECARREGA A PÁGINA */
		$(document).ready(function(){
			$("#btn-submit").click(function(){
				$.post('marca/efetivarCadastro',$("#formulario").serialize());
				$("#mod-msg").load("sucesso");
				return true;
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
	<script>
		$(document).ready(function(){
			$('#myModal').modal('show');
		});
		$(document).ready(function(){
			$("#btn-submit").click(function(){
				$.post('marca/efetivarEdicao',$("#formulario").serialize());
				$("#mod-msg").load("sucesso");
				return true;
			});
		});
	</script>
	</c:otherwise>
</c:choose>