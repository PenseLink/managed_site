<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
         
         
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h1 class="modal-title" id="myModalLabel"><i class="glyphicon glyphicon-warning-sign"></i> Cuidado!</h1>
	      </div>	      
	      <form method="post">
	      <input type="hidden" value="/managed_site/marca/remove/${marca.id}" id="action">
	      <input type="hidden" value="remover-${marca.id}" id="id">
		    <div class="modal-body">
		      <div class="form-group">
		         Tem certeza de que deseja excluir a marca ${marca.nome} ?
		      </div>
		    </div>
		    <div class="modal-footer">
		      	<button type="button" class="btn btn-default" data-dismiss="modal">Não</button>
		        <input id="btn-submit" type="submit" class="btn btn-primary" value="Sim" data-dismiss="modal"/>
		    </div>
		  </form>	      
	    </div>
	  </div>
	</div>
	<script>
	$(document).ready(function(){
		$("#myModal").modal('show');
		$("#btn-submit").on('click',function(){
			var action = $('#action').val();
			var idRemover = $('#id').val();
			$.ajax({
				type: "post",
				url: action,
				cache: false,
				success: function(response){
					$("#"+idRemover).closest('tr').remove().draw(); 
					$("#mod-msg").load("sucesso");
					return true;
				},
				error: function(){
					alert("Algo muito ruim aconteceu!");
				}
			});
		});
	});	
	</script>