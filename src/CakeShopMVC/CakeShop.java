/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import CakeShopChoices.LoadBoxes;

/**
 *
 * @author Maxinne Santico
 * COMP603/50 - 19084694
 * Group 27 - Assignment 2
 * 
 * Main class that will start program. 
 */
public class CakeShop {
    
    // Created a method so that it could be invoked in the ReceiptView class to start program again. 
    public static void promptBeginning() {

        /**
         * Instantiating OrderingView class and getting an instance
         * of the class to invoke the init Methods 
         */
        OrderingView view = new OrderingView();
        view.initMainComponents();
        view.initHomeComponents();
        view.initLoginComponents();
        view.initOrderingComponents();
        view.initDetailsComponents();
        /**
         * Invoking static method from LoadBoxes class so that
         * enum values can be set to comboboxes
         */
        LoadBoxes.loadBoxes(); 
        
        Model model = new Model();
        Controller controller = new Controller(view, model);
        model.addObserver(view); // Build connection between the view and the model.
    }
    
    public static void main(String[] args) {
        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                OrderingView view = new OrderingView();
//                view.setVisible(true);
//            }
//        });
    
        promptBeginning(); // Starting program 

    }
}
