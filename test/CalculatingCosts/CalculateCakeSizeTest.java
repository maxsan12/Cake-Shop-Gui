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
 * COMP603/50 - Group 27
 * Assignment 2
 * 
 * Test class for Cake Size test
 */
public class CalculateCakeSizeTest {
    
    public CalculateCakeSizeTest() {
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
     * Test of getPriceForSize method, of class CalculateCakeSize.
     */
    @Test
    public void testGetPriceForSize() {
        System.out.println("getPriceForSize");
        double expResult = 0.0;
        double result = CalculateCakeSize.getPriceForSize();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setPriceForSize method, of class CalculateCakeSize.
     */
    @Test
    public void testSetPriceForSize() {
        System.out.println("setPriceForSize");
        double aPriceForSize = 0.0;
        CalculateCakeSize.setPriceForSize(aPriceForSize);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of cakeSizePrice method, of class CalculateCakeSize.
     */
    @Test
    public void testCakeSizePrice() {
        System.out.println("cakeSizePrice");
        CalculateCakeSize instance = new CalculateCakeSize();
        double expResult = 0.0;
        double result = instance.cakeSizePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of calcPrice method, of class CalculateCakeSize.
     */
    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        CalculateCakeSize instance = new CalculateCakeSize();
        double expResult = 0.0;
        double result = instance.calcPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
