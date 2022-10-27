/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CakeShopChoices.DeliveryOrPickup;
import static CakeShopMVC.OrderingView.detailsDelOrPicComboBox;

/**
 *
 * @author maxin
 */
public class CalculateDelOrPic {
    
    private static double priceForDelOrPic;
    
    /**
     * @return the priceForDelOrPic
     */
    public static double getPriceForDelOrPic() {
        return priceForDelOrPic;
    }

    /**
     * @param aPriceForDelOrPic the priceForDelOrPic to set
     */
    public static void setPriceForDelOrPic(double aPriceForDelOrPic) {
        priceForDelOrPic = aPriceForDelOrPic;
    }
    
    
    public static double delOrPicPrice() {
        
        switch(detailsDelOrPicComboBox.getSelectedIndex()) {
            case 0 -> {
                setPriceForDelOrPic(DeliveryOrPickup.DELIVERY.getDelOrPicPrice());
            }
            case 1 -> {
                setPriceForDelOrPic(DeliveryOrPickup.PICKUP.getDelOrPicPrice());
            }
        }
        return getPriceForDelOrPic();
    }
}
