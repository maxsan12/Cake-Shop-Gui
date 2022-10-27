/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import static CakeShopMVC.OrderingView.orderingQuantity;

/**
 *
 * @author maxin
 */
public class CalculatePrices extends CalculateCost {
    
    private static double subtotal; 
    private static double total;

    /**
     * @return the subtotal
     */
    public static double getSubTotal() {
        return subtotal;
    }

    /**
     * @param aSubtotal the subtotal to set
     */
    public static void setSubTotal(double aSubtotal) {
        subtotal = aSubtotal;
    }

    /**
     * @return the total
     */
    public static double getTotal() {
        return total;
    }

    /**
     * @param aTotal the total to set
     */
    public static void setTotal(double aTotal) {
        total = aTotal;
    }
    
    @Override
    public double calcSubPrice() {

        
        setSubTotal(CalculateCakeSize.getPriceForSize() + CalculateCakeShape.getPriceForShape()
                + CalculateCakeFlavour.getPriceForFlavour());
        
        return this.subPrice = getSubTotal() * orderingQuantity;
    }

    @Override
    public double calcTotalPrice() {
        return this.totalPrice += this.subPrice + CalculateDelOrPic.getPriceForDelOrPic();
        
    }
    
}
