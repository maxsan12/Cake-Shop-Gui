/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopChoices;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Assignment 2
 * 
 */
public enum CakeShapes {
    
    CIRCLE("Circle", 2.00),
    SQUARE("Square", 2.00),
    RECTANGLE("Rectangle", 2.00),
    TRIANGLE("Triangle", 2.00),
    HEART("Heart", 3.00),
    MOON("Moon", 3.00),
    STAR("Star", 4.00),
    FLOWER("Flower", 4.00);
   
    private final String shapeName;
    private final double shapeCost;
    
    CakeShapes(String shapeName, double shapeCost) {
        this.shapeName = shapeName;
        this.shapeCost = shapeCost;
    }

    public String getShapeName() {
        return this.shapeName;
    }
    
    public double getShapeCost() {
        return this.shapeCost;
    }

    @Override
    public String toString() {
        return shapeName + " = $" + String.format("%.2f", shapeCost);
    }
}
