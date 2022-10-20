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
 * Contoller class created 
 */
public class Controller implements ActionListener {
    
    public View view; 
    public Model model;
    
    public Controller (View view, Model model) {
        this.view = view;
        this.model = model;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String action = e.getActionCommand(); // using getActionCommand to identify the buttons clicked
        
        if(action.equals(this.view.homeContinueBttn.getActionCommand())) {
            
        }
    }
    
}
