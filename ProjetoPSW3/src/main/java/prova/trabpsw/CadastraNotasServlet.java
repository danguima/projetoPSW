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


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = (String) request.getParameter("Nome");
        double nota1 = Double.parseDouble((String) request.getParameter("Nota 1"));
        double trabalho = Double.parseDouble((String) request.getParameter("Trabalho"));
        double frequencia = Double.parseDouble((String) request.getParameter("Frequencia"));
        double projeto = Double.parseDouble((String) request.getParameter("Projeto"));
        double pf = Double.parseDouble((String) request.getParameter("Prova Final"));
        
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
        
        Aluno a = new Aluno(nome, nota1, trabalho, projeto, frequencia, pf, situacao);
        listaAluno.add(a);
        request.getServletContext().setAttribute("Aluno", listaAluno);
        
        response.getWriter().print("<html>");
        response.getWriter().print("<head>");
        response.getWriter().print("<style> table{border-collapse: collapse;}table,td,th{border:1px solid black;padding:0px;font-family:verdana;font-size:14px;}</style>");
        response.getWriter().print("<body>");
        response.getWriter().print("<table>");
        response.getWriter().print("<th>Nome</th>");
        response.getWriter().print("<th>Prova</th>");
        response.getWriter().print("<th>Projeto</th>");
        response.getWriter().print("<th>Trabalhos</th>");
        response.getWriter().print("<th>Frequencia</th>");
        response.getWriter().print("<th>ProvaFinal</th>");
        response.getWriter().print("<th>Situação</th>");
        
        for(Aluno aluno:listaAluno){
            response.getWriter().print("<tr>");   
            response.getWriter().print("<td>"+aluno.getNome()+"</td>");
            response.getWriter().print("<td>"+aluno.getNota1()+"</td>");
            response.getWriter().print("<td>"+aluno.getProjeto()+"</td>");
            response.getWriter().print("<td>"+aluno.getTrabalho()+"</td>");
            response.getWriter().print("<td>"+aluno.getFrequencia()+"</td>");
            response.getWriter().print("<td>"+aluno.getProvaFinal()+"</td>");
            response.getWriter().print("<td>"+aluno.getSituacao()+"</td>");
            response.getWriter().print("</tr>");
        }
        
        response.getWriter().print("</table>");
        response.getWriter().print("</body>");
        response.getWriter().print("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
        
        
    }

}
