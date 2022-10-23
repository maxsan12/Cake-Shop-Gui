/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - 19084694
 * Group 27 - Assignment 2
 * 
 * Class dedicated for creating image that will be used for home panel
 * (Referring to tutorial 6.2)
 */
public class HomePageImage extends JPanel {
    
    public Image image; 
    
    public HomePageImage() {
        this.image = new ImageIcon("./resources/home page.jpg").getImage();
    }
    
    @Override 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(this.image, 327, 316, null); // setting to 0 and null, which will then use the actual size of the jpg image.
    }
    
}
