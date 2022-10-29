/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package CakeShopChoices;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 * 
 * Enum class to hold delivery or pick up prices
 * will be used in its assigned jcombobox in OrderingView class
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
