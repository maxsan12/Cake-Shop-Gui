/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CakeShopMVC.OrderingView;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 * 
 * Class to calculate subtotal 
 * Should add together size + shape + flavour prices and multiply
 * by quantity in Ordering View class
 * 
 */
public class CalculateSubTotal extends CalculateCost {

    private static double subtotal; 

    // Encapsulating field
    public static double getSubtotal() {
        return subtotal;
    }

    public static void setSubtotal(double aSubtotal) {
        subtotal = aSubtotal;
    }

    // Method to set sub price
    public double settingSubPrice() {
        CalculateCost cc = new CalculateSubTotal();
        setSubtotal(cc.calcPrice()); // setting sub total price using the abstract method
        
        return getSubtotal();
    }
    
    // Abstract method to save sub price
    @Override
    public double calcPrice() {
     
        double calcSub;
        
        calcSub = CalculateCakeSize.getPriceForSize() + CalculateCakeShape.getPriceForShape()
                 + CalculateCakeFlavour.getPriceForFlavour();
        
        return this.price = calcSub * OrderingView.orderingQuantity;
    }
}  