/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

/**
 *
 * @author maxin
 */
public class CalculateCakeFlavour extends CalculateCost {
    
    private static double priceForFlavour; 

    /**
     * @return the priceForFlavour
     */
    public static double getPriceForFlavour() {
        return priceForFlavour;
    }

    /**
     * @param aPriceForFlavour the priceForFlavour to set
     */
    public static void setPriceForFlavour(double aPriceForFlavour) {
        priceForFlavour = aPriceForFlavour;
    }
    
    public static double cakeFlavourPrice() {
        
        setPriceForFlavour(2.0); // all cake flavours are 2.0
        
        return getPriceForFlavour();
    }

    @Override
    public double calcPrice() {
        return this.price += getPriceForFlavour();
    }
    
    
    
}
