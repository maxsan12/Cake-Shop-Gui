/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

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
        OrderingView view = new OrderingView();
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
