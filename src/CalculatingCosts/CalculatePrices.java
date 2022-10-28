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
public class CalculatePrices extends CalculateCost {
    
//    CalculateCost cc = new CalculatePrices();
//    NumberFormat nf = NumberFormat.getCurrencyInstance();
    
    private static double subtotal; 
    //private static double total;

    public static double getSubTotal() {
        return CalculatePrices.subtotal;
    }
    
    public static void setSubTotal(double aSubtotal) {
        subtotal = aSubtotal;
    }
    
    public double printInfo() {
        CalculateCost cc = new CalculatePrices();
        setSubTotal(cc.calcPrice());
        
        return getSubTotal();
        
    }
 

   @Override
   public double calcPrice() {
        double sp; 
        sp = CalculateCakeSize.getPriceForSize() + CalculateCakeShape.getPriceForShape()
                + CalculateCakeFlavour.getPriceForFlavour();
        
       
                return this.price = sp * OrderingView.orderingQuantity;
    }
   
   
   // new class
   class CalculateTotal extends CalculateCost {

        @Override
        public double calcPrice() {
            
            return 0;
            
        }
       
   }
    
}
