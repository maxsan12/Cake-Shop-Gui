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
public class CalculateCakeShape extends CalculateCost {
    
    private static double priceForShape;

    // Encapsulating field
    public static double getPriceForShape() {
        return priceForShape;
    }

    public static void setPriceForShape(double aPriceForShape) {
        priceForShape = aPriceForShape;
    }
    
    /** 
     * 
     * Method to check what index user selects in the combobox and 
     * then apply the appropriate price based on their selection from the
     * CakeShapes enum class
     * 
     * @return getPriceForShape()
     */
    public double cakeShapePrice() { 
        
        CalculateCost cc = new CalculateCakeShape();
        
        switch(orderingShapesComboBox.getSelectedIndex()) {
            case 0 -> {
                setPriceForShape(CakeShapes.CIRCLE.getShapeCost());
                cc.printPrice(getPriceForShape()); // allows price to print with 2 0's.
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
                break;
            }
            case 4 -> {
                setPriceForShape(CakeShapes.HEART.getShapeCost());
                break;
            }
            case 5 -> {
                setPriceForShape(CakeShapes.MOON.getShapeCost());
                break;
            }
            case 6 -> {
                setPriceForShape(CakeShapes.STAR.getShapeCost());
                break;
            }
            case 7 -> {
                setPriceForShape(CakeShapes.FLOWER.getShapeCost());
                break;
            }
        }
        return getPriceForShape();
    }

    // Abstract method to save priceForShape
    @Override
    public double calcPrice() {
        return this.price += getPriceForShape();
    }
}
