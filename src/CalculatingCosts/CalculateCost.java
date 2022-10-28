/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculatingCosts;

/**
 *
 * @author maxin
 */
public abstract class CalculateCost {
 
    public double price = 0.0;
    //public double totalPrice = 0.0;
    
    public double getPrice() {
        return price;
    }
    
    public void setSubPrice(double price) {
        this.price = price;
    }

    public void printPrice(double total){
        System.out.print(String.format("$%.2f", total));
    }
    
    public abstract double calcPrice(); // method to calculate and save prices.
    
}
