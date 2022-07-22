/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario iTC
 */
public class EstudiantePresencialTest {
    
    private EstudiantePresencial instance;
    
    public EstudiantePresencialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new EstudiantePresencial();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerNumeroCreditos() throws IllegalArgumentException, 
            IllegalAccessException, NoSuchFieldException {
        System.out.println("establecerNumeroCreditos");
        int numero = 20;
        instance.establecerNumeroCreditos(numero);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 20);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of establecerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerCostoCredito() throws IllegalArgumentException, 
            IllegalAccessException, NoSuchFieldException {
        System.out.println("establecerCostoCredito");
        double valor = 55.1;
        instance.establecerCostoCredito(valor);
        
        Field field = instance.getClass().getDeclaredField("costoCredito");
        field.setAccessible(true);
        assertEquals(field.get(instance), 55.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testCalcularMatriculaPresencial() throws IllegalArgumentException, 
            IllegalAccessException, NoSuchFieldException{
        System.out.println("calcularMatriculaPresencial");
        instance.establecerCostoCredito(55.1);
        instance.establecerNumeroCreditos(20);
        instance.calcularMatriculaPresencial();
        Field field = instance.getClass().getDeclaredField("matriculaPresencial");
        field.setAccessible(true);
        assertEquals(field.get(instance), 1102.0);
    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");
        int expResult = 20;
        instance.establecerNumeroCreditos(20);
        int result = instance.obtenerNumeroCreditos();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");
        double expResult = 55.1;
        instance.establecerCostoCredito(55.1);
        double result = instance.obtenerCostoCredito();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of obtenerMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaPresencial");
        instance.establecerCostoCredito(55.1);
        instance.establecerNumeroCreditos(20);
        instance.calcularMatriculaPresencial();
        double expResult = 1102;
        double result = instance.obtenerMatriculaPresencial();
        assertEquals(expResult, result, 1102);
    }
    
}
