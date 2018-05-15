package prova;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class ImprimeContaTag extends SimpleTagSupport{
    
    private ContaOrcamento cont;
    private ArrayList<ContaOrcamento> c = new ArrayList<ContaOrcamento>();
    
    public void setCont(ContaOrcamento cont) {
        this.cont = (ContaOrcamento) cont;
    }
    
    public ContaOrcamento getCont() {
        return cont;
    }

    public void imprimeConta(ContaOrcamento cont) throws IOException {

        for (ContaOrcamento c : cont.getConta()) {
            String selectHtml
                    = "<tr>"
                    + "<td>" + cont.getCodigo() + " " + cont.getNome() + "</td>"
                    + "<td>" + c.getValorOrcado() + "</td>"
                    + "<td>" + c.getValorRealizado() + "</td>"
                    + "<td>" + c.getValorComprometido() + "</td>"
                    + "<td>" + c.getValorDisponivel() + "</td>"
                    + "</tr>";
            getJspContext().getOut().print(selectHtml);
            imprimeConta(c);
        }
    }
    
    @Override
    public void doTag() throws JspException, IOException{
        String selectHtml
                = "<tr>"
                + "<td>" + cont.getCodigo() + " " + cont.getNome() + "</td>"
                + "<td>" + cont.getValorOrcado() + "</td>"
                + "<td>" + cont.getValorRealizado() + "</td>"
                + "<td>" + cont.getValorComprometido() + "</td>"
                + "<td>" + cont.getValorDisponivel() + "</td>"
                + "</tr>";
        getJspContext().getOut().print(selectHtml);
        imprimeConta(cont);
        cont.getValorComprometido();
        cont.getValorDisponivel();
        cont.getValorOrcado();
        cont.getValorRealizado();

    }
}
