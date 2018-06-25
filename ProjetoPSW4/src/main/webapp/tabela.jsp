<%-- 
    Document   : tabela
    Created on : Jun 24, 2018, 9:21:27 PM
    Author     : daniel
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
            <%
                List<Aluno> a = (ArrayList<Aluno>) request.getServletContext().getAttribute("Aluno");
                for(Aluno b:a){
            %>
            <tr>
                <td><%=b.getNome()%></td>
                <td><%=b.getNota1()%></td>
                <td><%=b.getProjeto()%></td>
                <td><%=b.getTrabalho()%></td>
                <td><%=b.getFrequencia()%></td>
                <td><%=b.getProvaFinal()%></td>
                <td><%=b.getSituacao()%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
