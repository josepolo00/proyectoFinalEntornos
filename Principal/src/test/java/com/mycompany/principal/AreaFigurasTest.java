/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.principal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrador
 */
public class AreaFigurasTest {
    
    public AreaFigurasTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of areaCuadrado method, of class AreaFiguras.
     */
    @Test
    public void testAreaCuadrado() {
        System.out.println("areaCuadrado");
        double lado = 1;
        AreaFiguras instance = new AreaFiguras();
        double expResult = 1;
        double result = instance.areaCuadrado(lado);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of areaRectangulo method, of class AreaFiguras.
     */
    @Test
    public void testAreaRectangulo() {
        System.out.println("areaRectangulo");
        double base = 1;
        double altura = 1;
        AreaFiguras instance = new AreaFiguras();
        double expResult = 1;
        double result = instance.areaRectangulo(base, altura);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of areaTriangulo method, of class AreaFiguras.
     */
    @Test
    public void testAreaTriangulo() {
        System.out.println("areaTriangulo");
        double base = 1;
        double altura = 1;
        AreaFiguras instance = new AreaFiguras();
        double expResult = 0.5;
        double result = instance.areaTriangulo(base, altura);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of areaCirculo method, of class AreaFiguras.
     */
    @Test
    public void testAreaCirculo() {
        System.out.println("areaCirculo");
        double radio = 1;
        AreaFiguras instance = new AreaFiguras();
        double expResult = 3.141592653589793;
        double result = instance.areaCirculo(radio);
        assertEquals(expResult, result, 0.0);

    }
    
}
