/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CakeShopChoices;

/**
 *
 * @author maxin
 */
public enum DeliveryOrPickup {
    
    DELIVERY("Delivery", 8.0),
    PICKUP("Pick Up", 4.0);
    
    private final String delOrPicChoice;
    private final double delOrPicPrice;
    
    DeliveryOrPickup(String delOrPicChoice, double delOrPicPrice) {
        this.delOrPicChoice = delOrPicChoice;
        this.delOrPicPrice = delOrPicPrice;
    }
    
     public String getDelOrPicChoice() {
        return this.delOrPicChoice;
    }
    
    public double getDelOrPicPrice() {
        return this.delOrPicPrice;
    }
    
    @Override
    public String toString() {
        return delOrPicChoice + " = $" + String.format("%.2f", delOrPicPrice);
    }
}
