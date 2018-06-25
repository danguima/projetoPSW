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
            
            Nome: <input type="text" name="nome"> ${msgErroNome} <br>
            Nota 1:<input type="text" name ="nota1"> ${msgErroNota} <br>
            Trabalho: <input type="text" name ="trabalho"> ${msgErroTrabalho} <br>
            Frequencia: <input type="text" name ="frequencia"> ${msgErroFrequencia} <br>
            Projeto: <input type="text" name ="projeto"> ${msgErroProjeto} <br>         
            PF: <input type="text" name ="pf"> ${msgErroPf} <br><br>
            
            <button type="submit"> Enviar </button>
        </form>
    </body>
</html>
