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
import static CakeShopMVC.OrderingView.orderingSizesComboBox;
import static CakeShopMVC.PriceForCustomer.setPriceForSize;


/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2 
 * 
 * class to calculate price based on what user selects from combobox's in OrderingView class. 
 */
public class CalculatePrice {

    private static double priceForSize;
    
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
  
    static double price() {
        
        
        switch (orderingSizesComboBox.getSelectedIndex()) {
           case 0 -> {
               setPriceForSize(CakeSizes.FOURINCH.getSizeCost());
               break;
           }
               
       }
        return getPriceForSize();
    }
    
}
