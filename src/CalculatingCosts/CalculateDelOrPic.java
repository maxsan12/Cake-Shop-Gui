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
 * 
 * Class to calculate whether user picks delivery or pick up
 * in the combobox in OrderingView class
 */
public class CalculateDelOrPic extends CalculateCost {
    
    private static double priceForDelOrPic;
    
    // Encapsulating field
    public static double getPriceForDelOrPic() {
        return priceForDelOrPic;
    }
    
    public static void setPriceForDelOrPic(double aPriceForDelOrPic) {
        priceForDelOrPic = aPriceForDelOrPic;
    }
    
    /**
     * Method to set price for size depending on what user selects in combobbox
     * using get SelectedIndex, which will help locate what user selected
     * and where we can set the price depending on their selection
     * @return getPriceForDelOrPic()
     */
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

    // Abstract method - saving priceForDelOrPic
    @Override
    public double calcPrice() {
        return this.price += getPriceForDelOrPic();
    }
}
