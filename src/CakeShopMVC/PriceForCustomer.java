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

    @Override
    public double calcSubPrice() {
        
        double sp = 0.0; 
        double s = (double) orderingSizesComboBox.getSelectedItem();
        double str1 = (double) orderingShapesComboBox.getSelectedItem();
        String str2 = (String) orderingFlavoursComboBox.getSelectedItem();
        
        
        if (str.equals(CakeSizes.FOURINCH.getSizeName())) {
            setPriceForSize(CakeSizes.FOURINCH.getSizeCost());
            
        }
        
        sp = s + str1;
        
        return sp;
    }


    
    
    
}
