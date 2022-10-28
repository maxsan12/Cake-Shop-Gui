/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CakeShopChoices.CakeFlavours;
import static CakeShopMVC.OrderingView.orderingFlavoursComboBox;


/**
 *
 * @author maxin
 */
public class CalculateCakeFlavour extends CalculateCost {
    
    private static double priceForFlavour; 

    public static double getPriceForFlavour() {
        return priceForFlavour;
    }
    
    public static void setPriceForFlavour(double aPriceForFlavour) {
        priceForFlavour = aPriceForFlavour;
    }
    
    public static double cakeFlavourPrice() {
        
        switch(orderingFlavoursComboBox.getSelectedIndex()) {
            case 0 -> {
                setPriceForFlavour(CakeFlavours.CHOCOLATE.getFlavourCost());
                break;
            }
            case 1 -> {
                setPriceForFlavour(CakeFlavours.STRAWBERRY.getFlavourCost());
                break;
            }
            case 2 -> {
                setPriceForFlavour(CakeFlavours.VANILLA.getFlavourCost());
                break;
            }
            case 3 -> {
                setPriceForFlavour(CakeFlavours.BANANA.getFlavourCost());
                break;
            }
            case 4 -> {
                setPriceForFlavour(CakeFlavours.CARROT.getFlavourCost());
                break;
            }
            case 5 -> {
                setPriceForFlavour(CakeFlavours.TIRAMISU.getFlavourCost());
                break;
            }
            case 6 -> {
                setPriceForFlavour(CakeFlavours.MANGO.getFlavourCost());
                break;
            }
            case 7 -> {
                setPriceForFlavour(CakeFlavours.MATCHA.getFlavourCost());
                break;
            }
        }
        
        return getPriceForFlavour();
    }

    @Override
    public double calcPrice() {
        return this.price += getPriceForFlavour();
    }

}
