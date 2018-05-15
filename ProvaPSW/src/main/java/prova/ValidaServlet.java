package prova;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daniel
 */
@WebServlet(name = "ValidaServlet", urlPatterns = {"/ValidaServlet"})
public class ValidaServlet extends HttpServlet {
    ArrayList<ContaOrcamento> listaOrc = new ArrayList<ContaOrcamento>();    
    
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8"); // pra n bugar os caracteres especiais
        response.setCharacterEncoding("UTF-8"); // pra n bugar os caracteres especiais
        
        // criando as contas e setando seus valores
        ContaOrcamento c10 = new ContaOrcamento("Despesas Gerais", "1");
            c10.setValorOrcado(20000F);
            //c10.setValorRealizado(5000F);
            c10.setValorComprometido(3000F);
        ContaOrcamento c20 = new ContaOrcamento("Folha de Pagamento", "2");
        ContaOrcamento c21 = new ContaOrcamento("Administrativos", "2.1");
            c21.setValorOrcado(20000F);
            //c21.setValorRealizado(10000F);
            c21.setValorComprometido(10000F);        
        ContaOrcamento c22 = new ContaOrcamento("Vendedores", "2.2");
            c22.setValorOrcado(80000F);
            //c22.setValorRealizado(60000F);
            c22.setValorComprometido(20000F);    
        ContaOrcamento c30 = new ContaOrcamento("Investimentos", "3");
        ContaOrcamento c31 = new ContaOrcamento("Obras e Reformas", "3.1");
        ContaOrcamento c311 = new ContaOrcamento("Escritório", "3.1.1");
            c311.setValorOrcado(5000F);
            //c311.setValorRealizado(2000F);
        ContaOrcamento c312 = new ContaOrcamento("Ponto de Venda", "3.1.2");
            c312.setValorOrcado(15000F);
            //c312.setValorRealizado(15000F);
            
        // colocando as subcontas dentro das contas
        c20.conta.add(c21);
        c20.conta.add(c22);
        c30.conta.add(c31);
        c31.conta.add(c311);
        c31.conta.add(c312);
        
        // colocando as contas dentro da lista de contas
        listaOrc.add(c10);
        listaOrc.add(c20);
        listaOrc.add(c30);
        
        request.getServletContext().setAttribute("ContaOrcamento", listaOrc);
        request.getRequestDispatcher("tabela.jsp").forward(request, response);
        
    }    
}

