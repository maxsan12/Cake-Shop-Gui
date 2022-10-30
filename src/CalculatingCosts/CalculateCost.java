/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 * 
 * Abstract class which holds abstract method to calculate price
 */
public abstract class CalculateCost {
 
    public double price;
    
    public double getPrice() {
        return price;
    }
    
    public void setSubPrice(double price) {
        this.price = price;
    }

    public void printPrice(double price){
        System.out.print(String.format("$%.2f", price));
    }
    
    public abstract double calcPrice(); // method to calculate and save prices.
    
}
