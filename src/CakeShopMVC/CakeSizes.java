/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;


/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 * 
 * Enum class for cake size and its prices
 */
public class CakeSizes {
    
    
    
    
    private final String sizeName;
    //private final double sizeCost;
    
    CakeSizes(String sizeName) {
        this.sizeName = sizeName;
        //this.sizeCost = sizeCost;
    }
    
    public String getSizeName() {
        return sizeName;
    }
    
    //public double getSizeCost() {
    //    return sizeCost;
    //}
    
    @Override
    public String toString() {
        return sizeName;
    }
    

}
