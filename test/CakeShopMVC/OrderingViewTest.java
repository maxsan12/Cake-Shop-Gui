/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package CakeShopMVC;

import java.awt.event.ActionListener;
import java.util.Observable;
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
public class OrderingViewTest {
    
    public OrderingViewTest() {
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
     * Test of initMainComponents method, of class OrderingView.
     */
    @Test
    public void testInitMainComponents() {
        System.out.println("initMainComponents");
        OrderingView instance = new OrderingView();
        instance.initMainComponents();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of initLoginComponents method, of class OrderingView.
     */
    @Test
    public void testInitLoginComponents() {
        System.out.println("initHomeComponents");
        OrderingView instance = new OrderingView();
        instance.initLoginComponents();
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of initOrderingComponents method, of class OrderingView.
     */
    @Test
    public void testInitOrderingComponents() {
        System.out.println("initOrderingComponents");
        OrderingView instance = new OrderingView();
        instance.initOrderingComponents();
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of initLoginComponents method, of class OrderingView.
     */
    @Test
    public void testInitDetailsComponents() {
        System.out.println("initDetailsComponents");
        OrderingView instance = new OrderingView();
        instance.initDetailsComponents();
        // TODO review the generated test code and remove the default call to fail.
    }
}
