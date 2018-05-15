<%-- 
    Document   : tabela
    Created on : Apr 16, 2018, 7:29:57 PM
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Orçamentos</title>
    </head>
    <body>
        <h2 align="center">Orçamento da Empresa: Icatu</h2>
        <table border= "1px solid black" align="center">
            <tr>
                <th>Orçamento de 2016</th>
                <th>Orçado</th>
                <th>Realizado</th>
                <th>Comprometido</th>
                <th>Disponivel</th>
            </tr>
            
            <c:forEach var="conta" items="${ContaOrcamento}">
                <selects:ImprimeContaTag cont="${conta}"/>
            </c:forEach>
            <%--
            <c:forEach items="${ContaOrcamento}" var="c" varStatus="status">
                <tr>
                    <td>${c.getCodigo()} ${c.getNome()}</td>
                    <td>R$ ${c.getValorOrcado()}</td>
                    <td>R$ ${c.getValorRealizado()}</td>
                    <td>R$ ${c.getValorComprometido()}</td>
                    <td>R$ ${c.getValorDisponivel()}</td>
                </tr> 
            </c:forEach> --%>
        </table>
        <br><br>
        <tr>
        <br><br>
        <h2 align="center">Adicionando Gastos (Realizado)</h2>
        <form action="RealizacaoServlet" method="POST">
            <div align="center">
                <div>
                    Código: 
                    <select name="cod">
                        <option value='1'>1.0</option>
                        <option value='21'>2.1</option>
                        <option value='22'>2.2</option>
                        <option value='311'>3.1.1</option>
                        <option value='312'>3.1.2</option>
                    </select> 
                </div>
                <br>
                <div>
                    Valor: 
                    <input name="valor">
                </div>
                <br>
                <button type="submit"> Adicionar </button>
            </div>
        </form>
        
    </body>
</html>
