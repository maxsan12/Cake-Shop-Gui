/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import CakeShopChoices.CakeSizes;

/**
 *
 * @author maxin
 */
public abstract class CalculateCost {
 
    public double price = 0.0;
    //public double total = 0.0;
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price; 
    }
    
    /*  public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }*/
    
    // Method to print sub price to decimal places and include dollar sign
    public void printSubPrice(double subTotal) {
        System.out.println(String.format("$%.2f", subTotal));
    }
    
    // Method to print total price to decimal places and include dollar sign.
    public void printTotalPrice(double total){
        System.out.print(String.format("$%.2f", total));
    }
    
    public abstract double calcSubPrice(CakeSizes cakes); // method to calculate and save prices.
    //public abstract double calcTotalPrice();
    
    
    
}
