/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopChoices;


/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 * 
 * Enum class to hold cake size options and its prices
 * will be used for its assigned jcombobox in OrderingView class
 */
public enum CakeSizes {
    
    FOURINCH("4 inch cake", 45.0),
    SIXINCH("6 inch cake", 55.0),
    EIGHTINCH("8 inch cake", 65.0),
    TENINCH("10 inch cake", 85.0 ),
    TWELVEINCH("12 inch cake", 95.0),
    FOURTEENINCH("14 inch cake", 115.0);

    
    private final String sizeName;
    private final double sizeCost;
    
    CakeSizes(String sizeName, double sizeCost) {
        this.sizeName = sizeName;
        this.sizeCost = sizeCost;
    }
    
    public String getSizeName() {
        return this.sizeName;
    }
    
    public double getSizeCost() {
        return this.sizeCost;
    }
    
    @Override
    public String toString() {
        return sizeName + " = $" + String.format("%.2f", sizeCost);
    }

}
