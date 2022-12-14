/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopChoices;

import static CakeShopMVC.OrderingView.detailsDelOrPicComboBox;
import static CakeShopMVC.OrderingView.orderingFlavoursComboBox;
import static CakeShopMVC.OrderingView.orderingShapesComboBox;
import static CakeShopMVC.OrderingView.orderingSizesComboBox;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Maxinne Santico 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 * 
 * Class to hold method for loading values from enum class to 
 * its assigned comboboxes in OrderingView comboboxes
 */
public class LoadBoxes {
    
    // Method to load combo boxes which hold the values from the CakeSizes, CakeShapes and CakeFlavours classes
    public static void loadBoxes() {
        orderingSizesComboBox.setModel(new DefaultComboBoxModel<>(CakeSizes.values()));
        orderingShapesComboBox.setModel(new DefaultComboBoxModel<>(CakeShapes.values()));
        orderingFlavoursComboBox.setModel(new DefaultComboBoxModel<>(CakeFlavours.values()));
        detailsDelOrPicComboBox.setModel(new DefaultComboBoxModel<>(DeliveryOrPickup.values()));
    }
}
