/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopChoices;

/**
 *
 * @author Maxinne Santico 
 */
public enum CakeFlavours {

    CHOCOLATE("Chocolate", 2.0),
    STRAWBERRY("Strawberry", 2.0),
    VANILLA("Vanilla", 2.0),
    BANANA("Banana", 2.0),
    CARROT("Carrot", 2.0),
    TIRAMISU("Tiramisu", 2.0),
    MANGO("Mango", 2.0),
    MATCHA("Matcha", 2.0),
    LEMON("Lemon", 2.0),
    FUNFETTI("Funfetti", 2.0);
    
    private final String flavourName;
    private final double flavourCost;
    
    CakeFlavours(String flavourName, double flavourCost) {
        this.flavourName = flavourName;
        this.flavourCost = flavourCost;
    }
    
    public String getFlavourName() {
        return this.flavourName;
    }
    
    public double getFlavourCost() {
        return this.flavourCost;
    }
    
    @Override
    public String toString() {
        return flavourName + " = $" + String.format("%.2f", flavourCost);
    }

}
