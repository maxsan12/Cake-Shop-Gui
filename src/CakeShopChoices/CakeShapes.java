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
 * Enum class to hold cake shape names and prices
 * will be used for its assigned jcombobox in OrderingView class
 */
public enum CakeShapes {
    
    CIRCLE("Circle", 2.0),
    SQUARE("Square", 2.0),
    RECTANGLE("Rectangle", 2.0),
    TRIANGLE("Triangle", 2.0),
    HEART("Heart", 3.0),
    MOON("Moon", 3.0),
    STAR("Star", 4.0),
    FLOWER("Flower", 4.0);
   
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
