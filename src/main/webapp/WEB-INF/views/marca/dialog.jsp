<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<div class="modal fade" id="modalDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h1 class="modal-title" id="myModalLabel"><i class="glyphicon glyphicon-warning-sign"></i> Cuidado!</h1>
	      </div>	      
		    <div class="modal-body">
		      <div class="form-group">
		         Tem certeza de que deseja excluir a marca ${marca.nome} ?
		      </div>
		    </div>
		    <div class="modal-footer">
		      <a href="/managed_site/marca/"><input id="" type="button" class="btn btn-primary" value="Não" data-dismiss="modal"/></a>
		      <a href="/managed_site/marca/"><input id="" type="button" class="btn btn-primary" value="Sim" data-dismiss="modal"/></a>
		    </div>	      
	    </div>
	  </div>
	</div>
	<script>
	$(document).ready(function(){
		$('#modalDialog').modal('show');
	});
	
	</script>