/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Albert
 */
public class FuncionesTest {
    
 
    @Test
    public void testDividir() {
       
        assertEquals("1.0", Funciones.dividir(1, 1));
        assertEquals("Error", Funciones.dividir(0, 0));
        assertEquals("Error", Funciones.dividir(1, 0));
        assertEquals("Error", Funciones.dividir(1, 0));
        // TODO review the generated test code and remove the default call to fail.
    
    }
    
}
