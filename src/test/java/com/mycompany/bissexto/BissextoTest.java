/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bissexto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eliez
 */
public class BissextoTest {
    
    public BissextoTest() {
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
     * Test of bissexto method, of class Bissexto.
     */
    @Test
    public void testBissexto() {
        System.out.println("TESTE 1");
        int numero = 2015;
        Bissexto instance = new Bissexto();
        instance.bissexto(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBissexto2() {
        System.out.println("TESTE 2");
        int numero = 2016;
        Bissexto instance = new Bissexto();
        instance.bissexto(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBissexto3() {
        System.out.println("TESTE 3");
        int numero = 2800;
        Bissexto instance = new Bissexto();
        instance.bissexto(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBissexto4() {
        System.out.println("TESTE 4");
        int numero = 1600;
        Bissexto instance = new Bissexto();
        instance.bissexto(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBissexto5() {
        System.out.println("TESTE 5");
        int numero = 2006;
        Bissexto instance = new Bissexto();
        instance.bissexto(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBissexto6() {
        System.out.println("TESTE 6");
        int numero = 1996;
        Bissexto instance = new Bissexto();
        instance.bissexto(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBissexto7() {
        System.out.println("TESTE 7");
        int numero = 2010;
        Bissexto instance = new Bissexto();
        instance.bissexto(numero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }  
}
