/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

import CakeShopChoices.CakeShapes;
import static CakeShopMVC.OrderingView.orderingShapesComboBox;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2 
 * 
 * class to calculate cake shape price based on what user selects from comboboxes in OrderingView class. 
 * note: switch case was the only solution i could come up with. 
 */
public class CalculateCakeShape {
    
    private static double priceForShape;

    /**
     * @return the priceForShape
     */
    public static double getPriceForShape() {
        return priceForShape;
    }

    /**
     * @param aPriceForShape the priceForShape to set
     */
    public static void setPriceForShape(double aPriceForShape) {
        priceForShape = aPriceForShape;
    }
    
    // Method to check what index user selects in the combobox and then apply the appropriate price based on their selection. 
    public static double cakeShapePrice() {
        switch(orderingShapesComboBox.getSelectedIndex()) {
            case 0 -> {
                setPriceForShape(CakeShapes.CIRCLE.getShapeCost());
                break;
            }
            case 1 -> {
                setPriceForShape(CakeShapes.SQUARE.getShapeCost());
                break;
            }
            case 2 -> {
                setPriceForShape(CakeShapes.RECTANGLE.getShapeCost());
                break;
            }
            case 3 -> {
                setPriceForShape(CakeShapes.TRIANGLE.getShapeCost());
            }
            case 4 -> {
                setPriceForShape(CakeShapes.HEART.getShapeCost());
            }
            case 5 -> {
                setPriceForShape(CakeShapes.MOON.getShapeCost());
            }
            case 6 -> {
                setPriceForShape(CakeShapes.STAR.getShapeCost());
            }
            case 7 -> {
                setPriceForShape(CakeShapes.FLOWER.getShapeCost());
            }
        }
        return getPriceForShape();
    }
}
