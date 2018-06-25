/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.trabpsw;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daniel
 */
@WebServlet(name = "CadastraNotasServlet", urlPatterns = {"/CadastraNotasServlet"})
public class CadastraNotasServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        request.getServletContext().setAttribute("msgErroNome", null);
        request.getServletContext().setAttribute("msgErroNota", null);
        request.getServletContext().setAttribute("msgErroTrabalho", null);
        request.getServletContext().setAttribute("msgErroFrequencia", null);
        request.getServletContext().setAttribute("msgErroProjeto", null);
        request.getServletContext().setAttribute("Pf", null);
        
        String nome = (String) request.getParameter("nome");
        double nota1 = Double.parseDouble((String) request.getParameter("nota1"));
        double trabalho = Double.parseDouble((String) request.getParameter("trabalho"));
        double frequencia = Double.parseDouble((String) request.getParameter("frequencia"));
        double projeto = Double.parseDouble((String) request.getParameter("projeto"));
        double pf = Double.parseDouble((String) request.getParameter("pf"));
        
        boolean validacao = true;
        String situacao;
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        double media = (0.7 * ((nota1 + trabalho) / 2)) + (projeto * 0.3);
        
        if (frequencia >= 75) {
                if (media >= 7) {
                    situacao = "Aprovado";
                } else if (media < 3) {
                    situacao = "Reprovado";
                } else {
                    if (((pf + media) / 2) >= 5) {
                        situacao = "Aprovado";
                    } else {
                        situacao = "Reprovado";
                    }
                }
            } else {
                situacao = "Reprovado";
            }
        
        if(nome == null || nome.equals("")){
            request.getServletContext().setAttribute("msgErroNome", "O nome deve ser preenchido");
            validacao = false;
        }else{
            request.setAttribute("nome", nome);
        }
        
        if(nota1>10.0 || nota1 < 0){
            request.getServletContext().setAttribute("msgErroNota", "A nota deve estar entre 0 e 10");
            validacao = false;
        }else{
            request.setAttribute("nota1", nota1);
        }
        
        if(projeto>10.0 || projeto < 0){
            request.getServletContext().setAttribute("msgErroProjeto", "A nota deve estar entre 0 e 10");
            validacao = false;
        }else{
            request.setAttribute("projeto", projeto);
        }

        if(trabalho>10.0 || trabalho < 0){
            request.getServletContext().setAttribute("msgErroTrabalho", "A nota deve estar entre 0 e 10");
            validacao = false;
        }else{
            request.setAttribute("trabalho", trabalho);
        }

        if(frequencia>100.0 || frequencia < 0){
            request.getServletContext().setAttribute("msgErroFrequencia", "A frequencia deve estar entre 0 e 100");
            validacao = false;
        }else{
            request.setAttribute("frequencia", frequencia);
        }

        if(pf>10.0 || pf < 0){
            request.getServletContext().setAttribute("msgErroPf", "A nota deve estar entre 0 e 10");
            validacao = false;
        }else{
            request.setAttribute("pf", pf);
        }
        
        if(validacao){
            Aluno a = new Aluno(nome, nota1, trabalho, projeto, frequencia, pf, situacao);
            listaAluno.add(a);
            request.getServletContext().setAttribute("Aluno", listaAluno);
            request.getRequestDispatcher("tabela.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
        
    }

}
