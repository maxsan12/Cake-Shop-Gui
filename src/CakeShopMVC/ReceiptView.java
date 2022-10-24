/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author Maxinne Sanitco 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 */
public class ReceiptView extends JFrame {
    
    private javax.swing.JPanel receipTotalPanel;
    private javax.swing.JLabel receiptAddressLabel;
    private javax.swing.JScrollPane receiptAddressScrollPane;
    private javax.swing.JTextArea receiptAddressTextArea;
    private javax.swing.JButton receiptConfirmButton;
    private javax.swing.JLabel receiptDelOrPicLabel;
    private javax.swing.JPanel receiptDelOrPicPanel;
    private javax.swing.JTextField receiptDelOrPicTextField;
    private javax.swing.JLabel receiptDetailsLabel;
    private javax.swing.JPanel receiptDetailsPanel;
    private javax.swing.JLabel receiptEmailLabel;
    private javax.swing.JTextField receiptEmailTextField;
    private javax.swing.JTextField receiptFNTextField;
    private javax.swing.JLabel receiptFNameLabel;
    private javax.swing.JLabel receiptFlavourLabel;
    private javax.swing.JTextField receiptFlavourTextField;
    private javax.swing.JTextField receiptLNTextField;
    private javax.swing.JLabel receiptLNameLabel;
    private javax.swing.JButton receiptOrderAgainButton;
    private javax.swing.JTextField receiptOtyTextField;
    private javax.swing.JLabel receiptPhLabel;
    private javax.swing.JTextField receiptPhTextField;
    private javax.swing.JLabel receiptQuantityLabel;
    private javax.swing.JTextField receiptShapeTextField;
    private javax.swing.JLabel receiptShapesLabel;
    private javax.swing.JLabel receiptSizeLabel;
    private javax.swing.JTextField receiptSizeTextField;
    private javax.swing.JLabel receiptSubTotalLabel;
    private javax.swing.JTextField receiptSubTotalTextField;
    private javax.swing.JLabel receiptTotalLabel;
    private javax.swing.JTextField receiptTotalTextField;
    
    private javax.swing.JPanel receiptPanel;
    private javax.swing.JLabel receiptLabel;
    private javax.swing.JPanel receiptOrderPanel;
    private javax.swing.JLabel receiptOrderNoLabel;
    private javax.swing.JLabel receiptOrderLabel;
    
    
    
    public ReceiptView() {
        initReceiptPageGui();
    }
    
    // Method to generate a random number that will be customers order number
    // will be placed inside receiptOrderNoLabel
    public static int orderNumber() {
        Random random = new Random();

        int num = 1;
        for (int i = 0; i <= 10; i++) {
            num += random.nextInt(10000);
        }
        return num;
    }
    
    private void initReceiptPageGui() {
      
    }
}
