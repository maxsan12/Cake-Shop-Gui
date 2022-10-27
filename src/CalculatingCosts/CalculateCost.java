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
    
//    public double getTotalPrice() {
//        return totalPrice;
//    }
//    
//    public void setTotalPrice(double totalPrice) {
//        this.totalPrice = totalPrice;
//    }
    
    // Method to print total price to decimal places and include dollar sign.
    public void printPrice(double total){
        System.out.print(String.format("$%.2f", total));
    }
    
    public abstract double calcPrice(); // method to calculate and save prices.
    //public abstract double calcTotalPrice();
    
    
    
}
