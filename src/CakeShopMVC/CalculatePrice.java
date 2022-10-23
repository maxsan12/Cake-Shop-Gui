/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;
import static CakeShopMVC.OrderingView.orderingSizesComboBox;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2 
 * 
 * class to calculate price based on what user selects from combobox's in OrderingView class. 
 */
public class CalculatePrice {
    
    private double getSubTotalPrice() {
        double subTotal = 0;
        
        //System.out.println(((Double[])orderingSizesComboBox.getSelectedItem())[1]);
        subTotal = (double) orderingSizesComboBox.getSelectedItem();
        
        return 0;
        
    }
    
    private double getTotalPrice() {
        double total = 0;
        
        
         //System.out.println(((Double[])orderingSizesComboBox.getSelectedItem())[1]);
        total = (double) orderingSizesComboBox.getSelectedItem();
        return 0;
        
    }
    
}
