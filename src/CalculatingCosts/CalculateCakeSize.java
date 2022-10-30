/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CakeShopChoices.CakeSizes;
import static CakeShopMVC.OrderingView.orderingSizesComboBox;


/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2 
 * 
 * class to calculate cake size price based on what user selects from 
 * combobox in OrderingView class. 
 */
public class CalculateCakeSize extends CalculateCost {

    private static double priceForSize;
    
    // Encapsulating field
    public static double getPriceForSize() {
        return priceForSize;
    }
    
    public static void setPriceForSize(double aPriceForSize) {
        priceForSize = aPriceForSize;
    }
  
    /**
     * Method to set price for size depending on what user selects in combobbox
     * using get SelectedIndex, which will help locate what user selected
     * and where we can set the price depending on their selection
     * 
     * @return getPriceForSize()
     */
    public double cakeSizePrice() {
        
        switch (orderingSizesComboBox.getSelectedIndex()) {
           case 0 -> {
               setPriceForSize(CakeSizes.FOURINCH.getSizeCost()); // should return 45
               break;
               
           }
           case 1 -> {
               setPriceForSize(CakeSizes.SIXINCH.getSizeCost()); // should return 55
               break;
           }
           case 2 -> {
               setPriceForSize(CakeSizes.EIGHTINCH.getSizeCost()); // should return 65
               break;
           }
           case 3 -> {
               setPriceForSize(CakeSizes.TENINCH.getSizeCost()); // should return 85
               break;
           }
           case 4 -> {
               setPriceForSize(CakeSizes.TWELVEINCH.getSizeCost()); // should return 95
               break;           
           }
           case 5 -> {
               setPriceForSize(CakeSizes.FOURTEENINCH.getSizeCost());
               break;
           }
       }
        return getPriceForSize();
    }

    // Abstract method to save priceForSize()
    @Override
    public double calcPrice() {
        return this.price += getPriceForSize();
    }
}
