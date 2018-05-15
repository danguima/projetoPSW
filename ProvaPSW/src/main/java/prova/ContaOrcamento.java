package prova;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class ContaOrcamento extends Conta{
    private float valorOrcado;
    private float valorRealizado;
    private float valorComprometido;
    private float valorDisponivel;
    public ArrayList<ContaOrcamento> conta = new ArrayList<ContaOrcamento>();
    
    public ContaOrcamento(){
        
    }
    
    public ContaOrcamento(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public ArrayList<ContaOrcamento> getConta() {
        return conta;
    }

    public void setValorOrcado(float valorOrcado) {
        this.valorOrcado = valorOrcado;
    }

    public void setValorRealizado(float valorRealizado) {
        this.valorRealizado = valorRealizado;
    }

    public void setValorComprometido(float valorComprometido) {
        this.valorComprometido = valorComprometido;
    }

    public float getValorOrcado() {
        for (ContaOrcamento c : conta) {
            this.valorOrcado += c.getValorOrcado();
        }
        return valorOrcado;
    }

    public float getValorRealizado() {
        for (ContaOrcamento c : conta) {
            this.valorRealizado += c.getValorRealizado();
        }
        return valorRealizado;
    }

    public float getValorComprometido() {
        for (ContaOrcamento c : conta) {
            this.valorComprometido += c.getValorComprometido();
        }
        return valorComprometido;
    }

    public float getValorDisponivel(){
        for (ContaOrcamento c : conta) {
            this.valorOrcado += c.getValorOrcado();
            
        }
        for (ContaOrcamento c : conta) {
            this.valorRealizado += c.getValorRealizado();
        }
        for (ContaOrcamento c : conta) {
            this.valorComprometido += c.getValorComprometido();
        }
        valorDisponivel = valorOrcado - (valorRealizado + valorComprometido);
        return valorDisponivel;
    }
   
}
