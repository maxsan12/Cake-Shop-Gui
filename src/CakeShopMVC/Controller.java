/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;
import CakeShopMVC.OrderingView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Maxinne Santico 
 * COMP603/50 - 19084694
 * Assignment 2
 * 
 * Contoller class created to intereact with both model and view class, 
 * will update model to update and new values and updates the current
 * view that the user will see
 */
public class Controller implements ActionListener {
    
    public OrderingView view; 
    public Model model;
    
    public Controller (OrderingView view, Model model) {
        this.view = view;
        this.model = model;
        this.view.addActionListener(this);
        
    }

    // creating actionPerformed method - will implement all performances needed when a button is clicked. 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String command = e.getActionCommand();
        
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
