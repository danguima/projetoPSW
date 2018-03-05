/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetopsw2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class AlunoTest {
    
    /**
     *
     */
    public AlunoTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of situacao method, of class Aluno.
     */
    
    /**
     * Teste para caso o aluno tenha menos de 75% de presença, sendo assim reprovado
     */
    @Test
    public void testSituacaoReprovadoPorFalta() {
        System.out.println("situacao");
        int frequencia = 74;
        float prova = 10.0F;
        float trabalho = 10.0F;
        float projetos = 3.0F;
        float provaFinal = 0.0F;
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.situacao(frequencia, prova, trabalho, projetos, provaFinal);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste para caso o aluno seja aprovado direto, com a media maior ou igual a 7
     */
    @Test
    public void testSituacaoMediaMaiorQue7() {
        System.out.println("situacao");
        int frequencia = 75;
        float prova = 7.0F;
        float trabalho = 7.0F;
        float projetos = 7.0F;
        float provaFinal = 0.0F;
        Aluno instance = new Aluno();
        boolean expResult = true;
        boolean result = instance.situacao(frequencia, prova, trabalho, projetos, provaFinal);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste para caso o aluno seja reprovado direto, com a media menor que 3
     */
    @Test
    public void testSituacaoMediaMenorQue3() {
        System.out.println("situacao");
        int frequencia = 75;
        float prova = 4.0F;
        float trabalho = 4.0F;
        float projetos = 0.0F;
        float provaFinal = 0.0F;
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.situacao(frequencia, prova, trabalho, projetos, provaFinal);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste para caso o aluno fique com a media entre 6,9 e 3 e fique com media final igual ou maior que 5
     */
    @Test
    public void testSituacaoAprovadoProvaFinal() {
        System.out.println("situacao");
        int frequencia = 75;
        float prova = 4.3F;
        float trabalho = 4.3F;
        float projetos = 0.0F;
        float provaFinal = 10.0F;
        Aluno instance = new Aluno();
        boolean expResult = true;
        boolean result = instance.situacao(frequencia, prova, trabalho, projetos, provaFinal);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste para caso a aluno fique com a media final entre 6,9 e 3 e fique com media final menor que 5
     */
    @Test
    public void testSituacaoReprovadoProvaFinal() {
        System.out.println("situacao");
        int frequencia = 75;
        float prova = 7.0F;
        float trabalho = 7.0F;
        float projetos = 0.0F;
        float provaFinal = 4.0F;
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.situacao(frequencia, prova, trabalho, projetos, provaFinal);
        assertEquals(expResult, result);
    }
    
}
