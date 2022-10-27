/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import CakeShopChoices.CakeSizes;
import static CakeShopMVC.CalculatePrice.setPriceForSize;
import static CakeShopMVC.OrderingView.orderingFlavoursComboBox;
import static CakeShopMVC.OrderingView.orderingShapesComboBox;
import static CakeShopMVC.OrderingView.orderingSizesComboBox;

/**
 *
 * @author Maxinne Sanitco 19084694
 * COMP603/50 - Group 27
 */
public class PriceForCustomer extends CalculateCost {
    
    private static double priceForSize; 

   

    /**
     * @return the priceForSize
     */
    public static double getPriceForSize() {
        return priceForSize;
    }

    
    public static void setPriceForSize(double aPriceForSize) {
        priceForSize = aPriceForSize;
    }

    @Override
    public double calcSubPrice(CakeSizes cakes) {
        
       // int num = orderingSizesComboBox.getSelectedIndex();
        
       switch (orderingSizesComboBox.getSelectedIndex()) {
           case 0 -> {
               setPriceForSize(CakeSizes.FOURINCH.getSizeCost());
               break;
           }
               
       }
           
       
       //if (orderingSizesComboBox.getSelectedIndex()) {
          // setPriceForSize(CakeSizes.FOURINCH.getSizeCost());
       //}
       
       return getPriceForSize();
    }


    
    
    
}
