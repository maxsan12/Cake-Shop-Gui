/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Maxinne Santico 
 * COMP603/50 - 19084694
 * Assignment 2
 * 
 * Controller class created to interact with both model and view class, 
 * will update model and adds new values and then updates the current
 * view class, which is what that the user will see
 */
public class Controller implements ActionListener {
    
    public OrderingView view; 
    public Model model;
    
    public Controller (OrderingView view, Model model) {
        this.view = view;
        this.model = model;
        this.view.addActionListener(this);
        
    }

    /** Creating actionPerformed method - will implement all performances 
     * needed when login button is clicked. 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String command = e.getActionCommand();
        
        /**
         * 
         * Checking customer's username and password that they input from the 
         * Ordering view class 
         * 
         */
        switch(command) {
            case "Login" -> {
                String username = this.view.loginUserTextField.getText();
                String password = this.view.loginUserPasswordTextField.getText();
                this.model.checkUserDetails(username, password);
                break;
            }
        }
    }
    
}
