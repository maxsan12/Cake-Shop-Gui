/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CakeShopChoices.CakeFlavours;
import static CakeShopMVC.OrderingView.orderingFlavoursComboBox;


/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 * 
 * Class to calculate cake flavour, it will extend CalculateCost
 * which holds the abstract method to calculate the price.
 */
public class CalculateCakeFlavour extends CalculateCost {
    
    private static double priceForFlavour; 

    // Encapsulating field
    public static double getPriceForFlavour() {
        return priceForFlavour;
    }
    
    public static void setPriceForFlavour(double aPriceForFlavour) {
        priceForFlavour = aPriceForFlavour;
    }
    
    /** 
     * 
     * Method to place switch case to check what user selects from
     * orderingFlavoursComboBox and set price from enum class 
     * 
     * @return getPriceForFlavours()
     */
    public double cakeFlavourPrice() {
        
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

    // Abstract method to save priceForFlavour
    @Override
    public double calcPrice() {
        return this.price += getPriceForFlavour(); 
    }

}
