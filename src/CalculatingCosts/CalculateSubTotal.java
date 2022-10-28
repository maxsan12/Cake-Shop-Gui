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
public class CalculateSubTotal extends CalculateCost {

    private static double subtotal; 
   
    /**
     * @return the subtotal
     */
    public static double getSubtotal() {
        return subtotal;
    }

    /**
     * @param aSubtotal the subtotal to set
     */
    public static void setSubtotal(double aSubtotal) {
        subtotal = aSubtotal;
    }

    public double settingSubPrice() {
        CalculateCost cc = new CalculateSubTotal();
        setSubtotal(cc.calcPrice());
        
        return getSubtotal();
    }
    
    @Override
    public double calcPrice() {
     
        double calcSub;
        
        calcSub = CalculateCakeSize.getPriceForSize() + CalculateCakeShape.getPriceForShape()
                 + CalculateCakeFlavour.getPriceForFlavour();
        
        return this.price = calcSub * OrderingView.orderingQuantity;
    }

    
}  