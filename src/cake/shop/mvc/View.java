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
 * The view class is used 
 * 
 * 
 */
public class View extends JFrame implements Observer {
    
    // Declare ActionListnener to perform actionPerformed later for components below
    private ActionListener actionListener; 
    
    /** COMPONENTS FOR MAIN PAGE GUI 
     * 
     * note: components that will be pressed/typed by 
     * the user will be declared as public
     * (the rest of the components will be private 
     * so that the user cannot modify them)
     * 
     */
    
    // Main Page components 
    private javax.swing.JPanel panelForFrame;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTabbedPane tabsPanel; // tabbed panel for panels below
    
    // Components for Home Panel
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel homeIconLabel;
    public javax.swing.JButton homeContinueBttn;
    
    // Components for Ordering Panel
    private javax.swing.JPanel orderingPanel;
    private javax.swing.JLabel orderingSizesLabel;
    public javax.swing.JComboBox<String> orderingSizesComboBox;
    private javax.swing.JLabel orderingShapesLabel;
    public javax.swing.JComboBox<String> orderingShapesComboBox;
    private javax.swing.JLabel orderingFlavoursLabel;
    public javax.swing.JComboBox<String> orderingFlavoursComboBox;
    private javax.swing.JLabel orderingQuantityLabel;
    private javax.swing.JLabel orderingQtyNoLabel;
    public javax.swing.JButton orderingAddButton;
    public javax.swing.JButton orderingSubtractButton;
    private javax.swing.JLabel orderingCartLabel;
    private javax.swing.JTextArea orderingCartTextArea;
    private javax.swing.JScrollPane orderingCartScrollPane;
    public javax.swing.JButton orderingBackButton;
    public javax.swing.JButton orderingContinueButton;
    
    // Components for Login Panel
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel loginTextLabel;
    private javax.swing.JLabel loginUsernameLabel;
    private javax.swing.JLabel loginPasswordLabel;
    public javax.swing.JPasswordField loginUserPasswordField;
    public javax.swing.JTextField loginUserTextField;
    public javax.swing.JButton loginBackButton;
    public javax.swing.JButton loginContinueButton;
    
    // Components for Details Panel
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JLabel detailsFNLabel;
    public javax.swing.JTextField detailsFNTextField;
    private javax.swing.JLabel detailsLNLabel;
    public javax.swing.JTextField detailsLNTextField;
    private javax.swing.JLabel detailsAddressLabel;
    private javax.swing.JScrollPane detailsAddressScrollPane;
    public javax.swing.JTextArea detailsAddressTextArea;
    private javax.swing.JLabel detailsEmailLabel;
    public javax.swing.JTextField detailsEmailTextField;
    private javax.swing.JLabel detailsPhNoLabel;
    public javax.swing.JTextField detailsPhNoTextField;
    private javax.swing.JLabel detailsDelOrPicLabel;
    public javax.swing.JComboBox<String> detailsDelOrPicComboBox;
    public javax.swing.JButton detailsBackButton;
    public javax.swing.JButton detailsContinueButton;
    
  
    /** COMPONENTS FOR RECEIPT GUI 
     * 
     * 
     * 
     */
    
    
    @Override
    public void update(Observable o, Object o1) {
        
    }
    
    
    private void mainPageGui() {
        
    }
    
    
}
