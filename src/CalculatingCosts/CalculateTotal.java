/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;


/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2 
 * 
 * Class to add total price together. Should add sub total price from
 * CalculateSubTotal class with getPriceForDelOrPic from 
 * CalculateDelOrPic class
 * 
 */
public class CalculateTotal extends CalculateCost {
    
    private static double total;

    // Encapsulating total variable
    public static double getTotal() {
        return total;
    }

    public static void setTotal(double aTotal) {
        total = aTotal;
    }
    
    // Method to set total price
    public double settingTotal() {
        CalculateCost ccTotal = new CalculateTotal();
        setTotal(ccTotal.calcPrice());
        
        return getTotal();
    }
    
    
    // Abstract method to save price for total
    @Override
    public double calcPrice() {
        // Add subtotal and delivery or pick up option user chooses to get total
        return this.price = CalculateSubTotal.getSubtotal() + 
                CalculateDelOrPic.getPriceForDelOrPic();
       
    }
    
}
