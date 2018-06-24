<%-- 
    Document   : index
    Created on : Jun 24, 2018, 6:22:05 PM
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
    </head>
    <body>
        <h1>Cadastro de Notas</h1>
        
        <form action ="CadastraNotasServlet" method ="POST">
            Nome: <input type ="text" name="Nome"><br>
            Nota 1: <input type ="text" name="Nota 1"><br>
            Trabalho: <input type ="text" name="Trabalho"><br>
            Frequencia: <input type ="text" name="Frequencia"><br>
            Projeto: <input type ="text" name="Projeto"><br>
            PF: <input type ="text" name="Prova Final"><br>
            
            <button type ="submit"> Enviar </button>
        </form>
    </body>
</html>
