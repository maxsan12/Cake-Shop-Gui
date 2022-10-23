/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;
import CakeShopMVC.View;

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
    
    public View view; 
    //public Model model;
    
    public Controller (View view) {
        this.view = view;
        //this.model = model;
        
    }

    // creating actionPerformed method - will implement all performances needed when a button is clicked. 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object obj = e.getActionCommand(); // using getActionCommand to identify the buttons clicked
        
        if(obj == this.view.homeContinueBttn.getActionCommand()) {
            this.view.tabsPanel.setSelectedIndex(1);
            
                if (obj == this.view.orderingContinueButton.getActionCommand()) {
                this.view.tabsPanel.setSelectedIndex(2);
            }
        }
        
        else if (obj == this.view.loginContinueButton.getActionCommand()) {
            this.view.tabsPanel.setSelectedIndex(2);
        }
        else if (obj == this.view.detailsContinueButton.getActionCommand()) {
            this.view.tabsPanel.setSelectedIndex(0);
        }
    }
    
    public void actionPerformed2(ActionEvent ae) {
        
    }
    
}
