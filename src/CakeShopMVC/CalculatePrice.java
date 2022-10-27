/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import CakeShopChoices.CakeSizes;
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

    /**
     * @return the priceForSize
     */
    public static double getPriceForSize() {
        return priceForSize;
    }

    /**
     * @param aPriceForSize the priceForSize to set
     */
    public static void setPriceForSize(double aPriceForSize) {
        priceForSize = aPriceForSize;
    }
  
    static double subTotal = 0.0;
    static double total = 0.0;
    private static double priceForSize;
    
    public CalculatePrice() {
        
    }
    
    public static double getSubTotalPrice(Double price) {
        
        //System.out.println(((Double[])orderingSizesComboBox.getSelectedItem())[1]);
        
        String str = (String) orderingSizesComboBox.getSelectedItem();

        
        if (str.equals(CakeSizes.FOURINCH.getSizeName())) {
            setPriceForSize(CakeSizes.FOURINCH.getSizeCost());
            
        }
        
        subTotal += (double) orderingSizesComboBox.getSelectedItem() + 
                (double) orderingShapesComboBox.getSelectedItem() +
                (double) orderingFlavoursComboBox.getSelectedItem();
        
        return subTotal * orderingQuantity;
    }
    
    static double getTotalPrice() {
         //System.out.println(((Double[])orderingSizesComboBox.getSelectedItem())[1]);
        total += (double) detailsDelOrPicComboBox.getSelectedItem() + subTotal;
        
        return total;
        
    }
    
}
