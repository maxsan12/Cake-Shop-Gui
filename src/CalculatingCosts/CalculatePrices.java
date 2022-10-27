/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CakeShopMVC.OrderingView;
import java.text.NumberFormat;

/**
 *
 * @author maxin
 */
public class CalculatePrices extends CalculateCost {
    
    CalculateCost cc = new CalculatePrices();
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
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
    
    public CalculatePrices() {
        setSubTotal(cc.calcSubPrice());
        setTotal(cc.calcTotalPrice());
       
   }
    
//    public void printTotalPrice() {
//        
//    }
    @Override
    public double calcSubPrice() {

        double sp; 
        sp = CalculateCakeSize.getPriceForSize() + CalculateCakeShape.getPriceForShape()
                + CalculateCakeFlavour.getPriceForFlavour();
        
        
        
        return this.subPrice = sp * OrderingView.orderingQuantity;
    }

    @Override
    public double calcTotalPrice() {
        return this.totalPrice += this.subPrice + CalculateDelOrPic.getPriceForDelOrPic();
        
    }
    
}
