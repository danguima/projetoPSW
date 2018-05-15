<%-- 
    Document   : index
    Created on : Apr 16, 2018, 7:11:35 PM
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <title>Solicitação de Orçamento</title>
    </head>
    <body>
        <form action="ValidaServlet" method="POST">
            <h2>Solicitação de Orçamento</h2>
            <div>
                Empresa:
                <select name="nomeEmpresa">
                    <option value='Icatu'>Icatu</option>
                </select>
                <br><br>
            </div>
                
            <div>
                Ano:
                <select name="anoOrcamento">
                    <option value='2016'>2016</option>
                </select> 
                <br><br>
            </div>
            <button type="submit">Solicitar</button>
        </form>
    </body>
</html>
