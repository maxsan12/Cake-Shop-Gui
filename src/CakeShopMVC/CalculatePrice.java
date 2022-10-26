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
public class CalculatePrice extends CalculateCost {
 
    @Override
    public double calcSubPrice() {
        subTotal += (double) orderingSizesComboBox.getSelectedItem() + 
                (double) orderingShapesComboBox.getSelectedItem() +
                (double) orderingFlavoursComboBox.getSelectedItem();
        
        return subTotal * orderingQuantity;
    }

    @Override
    public double calcTotalPrice() {
        total += (double) detailsDelOrPicComboBox.getSelectedItem() + subTotal;
        
        return total;
    }
}
