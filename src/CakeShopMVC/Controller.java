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
        
    }

    // creating actionPerformed method - will implement all performances needed when a button is clicked. 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object obj = e.getActionCommand(); // using getActionCommand to identify the buttons clicked
        
        if(obj == this.view.homeContinueBttn.getActionCommand()) {
            this.view.tabsPanel.setSelectedIndex(1);
            
             
        }
        else if (obj == this.view.orderingContinueButton.getActionCommand()) {
            this.view.tabsPanel.setSelectedIndex(2);
        }
        
        else if (obj == this.view.loginContinueButton.getActionCommand()) {
            this.view.tabsPanel.setSelectedIndex(3);
        }
        else if (obj == this.view.detailsContinueButton.getActionCommand()) {
            this.view.tabsPanel.setSelectedIndex(0);
        }
    }
    
       /* // Method to initialize action listener 
    public void initActionListener() {
          // Implement actionlistener here
        this.homeContinueBttn.addActionListener(this.actionListener);
        this.orderingQtyAddButton.addActionListener(this.actionListener);
        this.orderingQtySubtractButton.addActionListener(this.actionListener);
        this.orderingBackButton.addActionListener(this.actionListener);
        this.orderingContinueButton.addActionListener(this.actionListener);
        this.loginBackButton.addActionListener(this.actionListener);
        this.loginContinueButton.addActionListener(this.actionListener);  
        this.detailsBackButton.addActionListener(this.actionListener);
        this.detailsContinueButton.addActionListener(this.actionListener);
        
        
    }*/
    
  
    
}
