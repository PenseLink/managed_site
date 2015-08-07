<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<div class="modal fade" id="modalSucesso" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">Mensagem:</h4>
	      </div>	      
		    <div class="modal-body">
		      <div class="form-group">
		        <h1 class="text-center"><span class="glyphicon glyphicon-ok-sign"></span> Sucesso!</h1>
		      </div>
		    </div>
		    <div class="modal-footer">
		      <a href="/managed_site/marca/"><input id="" type="button" class="btn btn-primary" value="Ok" data-dismiss="modal"/></a>
		    </div>	      
	    </div>
	  </div>
	</div>
	<script>
	$(document).ready(function(){
		$('#modalSucesso').modal('show');
	});
	
	</script>