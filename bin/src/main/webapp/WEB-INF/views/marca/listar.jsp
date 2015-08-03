<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<div id="conteudo">
    <div class="col-md-3"></div>
    <div class="tabela col-md-6">
        <table class="table table-bordered table-responsive text-center">
            <tr>
                <th>Número</th>
                <th>Nome </th>
                <th>Ações</th>
            </tr>
            <c:forEach var="marca" items="${marcas}">
                <tr>
                    <td>${marca.id}</td>
                    <td>${marca.nome}</td>
                    <td><a href="/managed_site/marca/editar/${marca.id}" class="editar">Editar</a>
                        &nbsp &nbsp &nbsp 
                        <a href="/managed_site/marca/excluir/${marca.id}"  class="excluir">Excluir</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
