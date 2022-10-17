/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cake.shop.mvc;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - 19084694
 * 
 * This class is designed as the 'View' class inspired by the MVC design pattern
 * The view class 
 */
public class View  extends JFrame implements Observer {
    
    // need to create Action Listener
    private ActionListener actionListener; 
    

    @Override
    public void update(Observable o, Object o1) {
        
    }
    
    
    private void mainPageGui() {
        
    }
}
