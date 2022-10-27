/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CalculatingCosts.CalculateCost;
import CakeShopChoices.CakeSizes;
import static CakeShopMVC.OrderingView.orderingSizesComboBox;


/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2 
 * 
 * class to calculate price based on what user selects from combobox's in OrderingView class. 
 */
public class CalculateCakePrice {

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
  
    static double cakeSizePrice() {
        
        switch (orderingSizesComboBox.getSelectedIndex()) {
           case 0 -> {
               setPriceForSize(CakeSizes.FOURINCH.getSizeCost()); // should return 45
               break;
           }
           case 1 -> {
               setPriceForSize(CakeSizes.SIXINCH.getSizeCost()); 
               break;
           }
           case 2 -> {
               setPriceForSize(CakeSizes.EIGHTINCH.getSizeCost());
           }
               
       }
        return getPriceForSize();
    }

    
}
