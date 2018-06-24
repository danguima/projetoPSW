/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.trabpsw;

/**
 *
 * @author daniel
 */
public class Aluno {
    
    private String nome;
    private double nota1;
    private double trabalho;
    private double projeto;
    private double frequencia;
    private double provaFinal;
    private String situacao;
    
    public Aluno(String nome, double nota1, double trabalho, double projeto, double frequencia, double provaFinal, String situacao) {
        this.nome = nome;
        this.nota1 = nota1;
        this.trabalho = trabalho;
        this.projeto = projeto;
        this.frequencia = frequencia;
        this.provaFinal = provaFinal;
        this.situacao = situacao;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nota1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * @param nota1 the nota1 to set
     */
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    /**
     * @return the trabalho
     */
    public double getTrabalho() {
        return trabalho;
    }

    /**
     * @param trabalho the trabalho to set
     */
    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }

    /**
     * @return the projeto
     */
    public double getProjeto() {
        return projeto;
    }

    /**
     * @param projeto the projeto to set
     */
    public void setProjeto(double projeto) {
        this.projeto = projeto;
    }

    /**
     * @return the frequencia
     */
    public double getFrequencia() {
        return frequencia;
    }

    /**
     * @param frequencia the frequencia to set
     */
    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    /**
     * @return the prova_final
     */
    public double getProvaFinal() {
        return provaFinal;
    }

    /**
     * @param prova_final the prova_final to set
     */
    public void setProvaFinal(double prova_final) {
        this.provaFinal = prova_final;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
}
