/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

/**
 *
 * @author maxin
 */
public abstract class CalculateCost {
 
    public double subTotal = 0.0;
    public double total = 0.0;
    
    public double getSubTotal() {
        return subTotal;
    }
    
    public void setSubTotal(double subtotal) {
        this.subTotal = subtotal; 
    }
    
      public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    // Method to print sub price to decimal places and include dollar sign
    public void printSubPirce(double subTotal) {
        System.out.println(String.format("$%.2f", subTotal));
    }
    
    // Method to print total price to decimal places and include dollar sign.
    public void printTotalPrice(double total){
        System.out.print(String.format("$%.2f", total));
    }
    
    public abstract double calcSubPrice(); // method to calculate and save prices.
    public abstract double calcTotalPrice();
    
}
