<%-- 
    Document   : tabela
    Created on : Jun 24, 2018, 9:21:27 PM
    Author     : daniel
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="javax.servlet.*" %>
<%@page import="prova.trabpsw.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style> 
            table{border-collapse: collapse;}
            table,td,th{border:1px solid black;padding:0px;font-family:verdana;font-size:14px;}
        </style>
    </head>
    <body>
        <table>
            <th>Nome</th>
            <th>Nota1</th>
            <th>Projeto</th>
            <th>Trabalhos</th>
            <th>Frequencia</th>
            <th>ProvaFinal</th>
            <th>Situacao</th>
            <c:forEach items="${Aluno}" var="a">
                <tr>
                    <td>${a.nome}</td>
                    <td>${a.nota1}</td>
                    <td>${a.projeto}</td>
                    <td>${a.trabalho}</td>
                    <td>${a.frequencia}</td>
                    <td>${a.provaFinal}</td>
                    <td>${a.situacao}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
