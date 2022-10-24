/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;
import static CakeShopMVC.OrderingView.orderingSizesComboBox;
import static CakeShopMVC.OrderingView.orderingShapesComboBox;
import static CakeShopMVC.OrderingView.detailsDelOrPicComboBox;
import static CakeShopMVC.OrderingView.orderingFlavoursComboBox;
import static CakeShopMVC.OrderingView.orderingQuantity;


/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2 
 * 
 * class to calculate price based on what user selects from combobox's in OrderingView class. 
 */
public class CalculatePrice {
    
    double subTotal = 0;
    double total = 0;
    
    private double getSubTotalPrice() {
        //System.out.println(((Double[])orderingSizesComboBox.getSelectedItem())[1]);
        subTotal += (double) orderingSizesComboBox.getSelectedItem() + 
                (double) orderingShapesComboBox.getSelectedItem() +
                (double) orderingFlavoursComboBox.getSelectedItem();
        
        return subTotal * orderingQuantity;
        
    }
    
    private double getTotalPrice() {
         //System.out.println(((Double[])orderingSizesComboBox.getSelectedItem())[1]);
        total += (double) detailsDelOrPicComboBox.getSelectedItem() + subTotal;
        
        return total;
        
    }
    
}
