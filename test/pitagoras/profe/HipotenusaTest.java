/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras.profe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andres Orrego-PO
 */
public class HipotenusaTest {
    
    public HipotenusaTest() {
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
     * Test of hipotenusa method, of class Hipotenusa.
     */
    @Test
    public void testHipotenusa() {
        System.out.println("hipotenusa");
        double lado_a = 1;
        double lado_b = 1;
        double expResult = 1.4142135623730951;
        double result = Hipotenusa.hipotenusa(lado_a, lado_b);
        assertEquals(expResult, result, 0.0);
    }
    
}
