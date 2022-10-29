/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CakeShopChoices.DeliveryOrPickup;
import static CakeShopMVC.OrderingView.detailsDelOrPicComboBox;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 */
public class CalculateDelOrPic extends CalculateCost {
    
    private static double priceForDelOrPic;
    
    
    public static double getPriceForDelOrPic() {
        return priceForDelOrPic;
    }

    
    public static void setPriceForDelOrPic(double aPriceForDelOrPic) {
        priceForDelOrPic = aPriceForDelOrPic;
    }
    
    
    public double delOrPicPrice() {
        
        switch(detailsDelOrPicComboBox.getSelectedIndex()) {
            case 0 -> {
                setPriceForDelOrPic(DeliveryOrPickup.DELIVERY.getDelOrPicPrice());
                break;
            }
            case 1 -> {
                setPriceForDelOrPic(DeliveryOrPickup.PICKUP.getDelOrPicPrice());
                break;
            }
        }
        return getPriceForDelOrPic();
    }

    @Override
    public double calcPrice() {
        return this.price += getPriceForDelOrPic();
    }
}
