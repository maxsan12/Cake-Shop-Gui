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
 * @author maxin
 */
public class CalculateCakeFlavourTest {
    
    public CalculateCakeFlavourTest() {
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
     * Test of getPriceForFlavour method, of class CalculateCakeFlavour.
     */
    @Test
    public void testGetPriceForFlavour() {
        System.out.println("getPriceForFlavour");
        double expResult = 0.0;
        double result = CalculateCakeFlavour.getPriceForFlavour();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPriceForFlavour method, of class CalculateCakeFlavour.
     */
    @Test
    public void testSetPriceForFlavour() {
        System.out.println("setPriceForFlavour");
        double aPriceForFlavour = 0.0;
        CalculateCakeFlavour.setPriceForFlavour(aPriceForFlavour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cakeFlavourPrice method, of class CalculateCakeFlavour.
     */
    @Test
    public void testCakeFlavourPrice() {
        System.out.println("cakeFlavourPrice");
        CalculateCakeFlavour instance = new CalculateCakeFlavour();
        double expResult = 0.0;
        double result = instance.cakeFlavourPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcPrice method, of class CalculateCakeFlavour.
     */
    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        CalculateCakeFlavour instance = new CalculateCakeFlavour();
        double expResult = 0.0;
        double result = instance.calcPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
