/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CakeShopMVC.OrderingView;

/**
 *
 * @author maxin
 */
public class CalculateTotal extends CalculateCost {
    
    private static double total;

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
    
    public double settingTotal() {
        CalculateCost ccTotal = new CalculateTotal();
        setTotal(ccTotal.calcPrice());
        
        return getTotal();
    }
    
    @Override
    public double calcPrice() {
        return this.price = CalculateSubTotal.getSubtotal() + OrderingView.orderingQuantity;
       
    }
    
}
