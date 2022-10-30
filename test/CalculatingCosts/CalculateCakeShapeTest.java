/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package CalculatingCosts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group
 */
public class CalculateCakeShapeTest {
    
    public CalculateCakeShapeTest() {
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
     * Test of getPriceForShape method, of class CalculateCakeShape.
     */
    @Test
    public void testGetPriceForShape() {
        System.out.println("getPriceForShape");
        double expResult = 0.0;
        double result = CalculateCakeShape.getPriceForShape();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceForShape method, of class CalculateCakeShape.
     */
    @Test
    public void testSetPriceForShape() {
        System.out.println("setPriceForShape");
        double aPriceForShape = 0.0;
        CalculateCakeShape.setPriceForShape(aPriceForShape);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cakeShapePrice method, of class CalculateCakeShape.
     */
    @Test
    public void testCakeShapePrice() {
        System.out.println("cakeShapePrice");
        CalculateCakeShape instance = new CalculateCakeShape();
        double expResult = 0.0;
        double result = instance.cakeShapePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcPrice method, of class CalculateCakeShape.
     */
    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        CalculateCakeShape instance = new CalculateCakeShape();
        double expResult = 0.0;
        double result = instance.calcPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
