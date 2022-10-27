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
 * class to calculate cake size price based on what user selects from combobox's in OrderingView class. 
 */
public class CalculateCakeSize {

    private static double priceForSize;
    
    /**
     * @return the priceForSize
     */
    public static double getPriceForSize() {
        return priceForSize;
    }

    /**
     * @param aPriceForSize the priceForSize to set
     */
    public static void setPriceForSize(double aPriceForSize) {
        priceForSize = aPriceForSize;
    }
  
    public static double cakeSizePrice() {
        
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
           }
               
       }
        return getPriceForSize();
    }
    
}
