/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daniel
 */
public class ContaOrcamentoTest {
    
    public ContaOrcamentoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValorOrcado method, of class ContaOrcamento.
     * Teste caso a conta não possua sub-conta
     */
    @Test
    public void testGetValorOrcadoNaoTemSubConta() {
        System.out.println("getValorOrcado");
        ContaOrcamento instance = new ContaOrcamento("nome", "id");
        float expResult = 0.0F;
        float result = instance.getValorOrcado();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Teste caso a conta possua sub-contas
     */
    @Test
    public void tesGetValorOrcadoTemSubconta(){
        System.out.println("getValorOrcado");
        ContaOrcamento instance1 = new ContaOrcamento("nome", "id");
        ContaOrcamento instance2 = new ContaOrcamento("nome2", "id2");
        
        instance1.setValorOrcado(10);
        instance2.setValorOrcado(40);
        
        instance2.conta.add(instance1);
        float expResult = 50.0F;
        float result = instance2.getValorOrcado();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of getValorRealizado method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorRealizado() {
        System.out.println("getValorRealizado");
        ContaOrcamento instance = new ContaOrcamento("nome", "id");
        float expResult = 0.0F;
        float result = instance.getValorRealizado();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Teste caso a conta possua sub-contas
     */
    @Test
    public void tesGetValorRealizadoTemSubconta(){
        System.out.println("getValorRealizado");
        ContaOrcamento instance1 = new ContaOrcamento("nome", "id");
        ContaOrcamento instance2 = new ContaOrcamento("nome2", "id2");
        
        instance1.setValorRealizado(10);
        instance2.setValorRealizado(40);
        
        instance2.conta.add(instance1);
        float expResult = 50.0F;
        float result = instance2.getValorRealizado();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getValorComprometido method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorComprometido() {
        System.out.println("getValorComprometido");
        ContaOrcamento instance = new ContaOrcamento("nome", "id");
        float expResult = 0.0F;
        float result = instance.getValorComprometido();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Teste caso a conta possua sub-contas
     */
    @Test
    public void tesGetValorComprometidoTemSubconta(){
        System.out.println("getValorComprometido");
        ContaOrcamento instance1 = new ContaOrcamento("nome", "id");
        ContaOrcamento instance2 = new ContaOrcamento("nome2", "id2");
        
        instance1.setValorComprometido(10);
        instance2.setValorComprometido(40);
        
        instance2.conta.add(instance1);
        float expResult = 50.0F;
        float result = instance2.getValorComprometido();
        assertEquals(expResult, result, 0.0);
    }


    /**
     * Test of getValorDisponivel method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorDisponivel() {
        System.out.println("getValorDisponivel");
        float valorOrcado = 0.0F;
        ContaOrcamento instance = new ContaOrcamento("nome", "id");
        
        instance.setValorComprometido(10);
        instance.setValorOrcado(50);
        instance.setValorRealizado(30);
        
        float expResult = 10.0F;
        float result = instance.getValorDisponivel();
        assertEquals(expResult, result, 0.0);
    }
    
}
