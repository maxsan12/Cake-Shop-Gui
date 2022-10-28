/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import CalculatingCosts.CalculateCakeFlavour;
import CalculatingCosts.CalculateCakeSize;
import CalculatingCosts.CalculateDelOrPic;
import CalculatingCosts.CalculatePrices;
import java.util.Random;
import javax.swing.JFrame;


/**
 *
 * @author Maxinne Sanitco 19084694
 * COMP603/50 - Group 27
 * Assignment 2
 */
public class ReceiptView extends JFrame {
    
    // Full panel
  
    private javax.swing.JPanel receiptPanel;
    private javax.swing.JLabel receiptLabel;
    // Buttons which prompt user to confirm order and leave the program
    // or order again which brings them back to the beginning of the program.
    private javax.swing.JButton receiptConfirmButton;
    private javax.swing.JButton receiptOrderAgainButton;
    
    // Panel and components for order details 
    private javax.swing.JPanel receiptOrderPanel;
    private javax.swing.JLabel receiptOrderNoLabel;
    private javax.swing.JLabel receiptOrderLabel;
    private javax.swing.JLabel receiptSizeLabel;
    public static javax.swing.JTextField receiptSizeTextField;
    private javax.swing.JLabel receiptShapesLabel;
    public static javax.swing.JTextField receiptShapeTextField;
    private javax.swing.JLabel receiptFlavourLabel;
    public static javax.swing.JTextField receiptFlavourTextField;
    private javax.swing.JLabel receiptQtyLabel;
    public static javax.swing.JTextField receiptOtyTextField;
    
    // Panel and components for customer details
    private javax.swing.JPanel receiptDetailsPanel;
    private javax.swing.JLabel receiptDetailsLabel;
    private javax.swing.JLabel receiptFNameLabel;
    public static javax.swing.JTextField receiptFNTextField;
    private javax.swing.JLabel receiptLNameLabel;
    public static javax.swing.JTextField receiptLNTextField;
    private javax.swing.JLabel receiptAddressLabel;
    private javax.swing.JScrollPane receiptAddressScrollPane;
    public static javax.swing.JTextArea receiptAddressTextArea;
    private javax.swing.JLabel receiptEmailLabel;
    public static javax.swing.JTextField receiptEmailTextField;
    private javax.swing.JLabel receiptPhLabel;
    public static javax.swing.JTextField receiptPhTextField;
    
    // Panel and components for Delivery or pick up details
    private javax.swing.JPanel receiptDelOrPicPanel;
    private javax.swing.JLabel receiptDelOrPicLabel;
    public static javax.swing.JTextField receiptDelOrPicTextField;
    
    // Panel and components for subtotal and total
    private javax.swing.JPanel receipTotalPanel;
    private javax.swing.JLabel receiptSubTotalLabel;
    public static javax.swing.JTextField receiptSubTotalTextField;
    private javax.swing.JLabel receiptTotalLabel;
    public static javax.swing.JTextField receiptTotalTextField;
    
    
    public ReceiptView() {
        initMainComponents();
        initOrderDetailsComponents();
        initCustDetailsComponents();
        initDelOrPicComponents();
        initTotalComponents();
        initEndComponents();
    }
    
    /** 
     * Method to generate a random number that will be customers order number
     *  will be placed inside receiptOrderNoLabel 
     * @return 
     */
    public static int orderNumber() {
        Random random = new Random();

        int num = 1;
        for (int i = 0; i <= 10; i++) {
            num += random.nextInt(1000);
        }
        return num;
    }
    
    //Method
    private void initMainComponents() {
    
        receiptPanel = new javax.swing.JPanel();
        receiptLabel = new javax.swing.JLabel();
        receiptConfirmButton = new javax.swing.JButton();
        receiptOrderAgainButton = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receipt");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(680, 670));
        setResizable(false);

        receiptPanel.setBackground(new java.awt.Color(255, 255, 255));
        receiptPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        receiptLabel.setBackground(new java.awt.Color(255, 255, 255));
        receiptLabel.setFont(new java.awt.Font("Corbel", 1, 40)); // NOI18N
        receiptLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receiptLabel.setText("RECEIPT");
        
        receiptConfirmButton.setBackground(new java.awt.Color(0, 51, 51));
        receiptConfirmButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        receiptConfirmButton.setText("Confirm");
        receiptConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        receiptOrderAgainButton.setBackground(new java.awt.Color(0, 51, 51));
        receiptOrderAgainButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptOrderAgainButton.setForeground(new java.awt.Color(255, 255, 255));
        receiptOrderAgainButton.setText("Order Again");
        receiptOrderAgainButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        pack();
    }
    
    // 
    private void initOrderDetailsComponents() {
        
        receiptOrderPanel = new javax.swing.JPanel();
        receiptOrderNoLabel = new javax.swing.JLabel();
        receiptOrderLabel = new javax.swing.JLabel();
        receiptSizeLabel = new javax.swing.JLabel();
        receiptSizeTextField = new javax.swing.JTextField();
        receiptShapesLabel = new javax.swing.JLabel();
        receiptShapeTextField = new javax.swing.JTextField();
        receiptFlavourLabel = new javax.swing.JLabel();
        receiptFlavourTextField = new javax.swing.JTextField();
        receiptOtyTextField = new javax.swing.JTextField();
        receiptQtyLabel = new javax.swing.JLabel();
        receiptDetailsPanel = new javax.swing.JPanel();

        receiptOrderPanel.setBackground(new java.awt.Color(255, 255, 255));
        
        receiptOrderNoLabel.setBackground(new java.awt.Color(255, 255, 255));
        receiptOrderNoLabel.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        receiptOrderNoLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptOrderNoLabel.setText("ORDER #"+String.valueOf(orderNumber())); // adding static random method here.

        receiptOrderLabel.setBackground(new java.awt.Color(255, 255, 255));
        receiptOrderLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        receiptOrderLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptOrderLabel.setText("Order Details:");

        receiptSizeLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptSizeLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptSizeLabel.setText("Cake Size:");
        
        receiptSizeTextField.setEditable(false);
        receiptSizeTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptSizeTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptSizeTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        
        receiptShapesLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptShapesLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptShapesLabel.setText("Cake Shape:");
        
        receiptShapeTextField.setEditable(false);
        receiptShapeTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptShapeTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptShapeTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        receiptFlavourLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptFlavourLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptFlavourLabel.setText("Cake Flavour:");
        
        receiptFlavourTextField.setEditable(false);
        receiptFlavourTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptFlavourTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptFlavourTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        receiptQtyLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptQtyLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptQtyLabel.setText("Quantity:");
        
        receiptOtyTextField.setEditable(false);
        receiptOtyTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptOtyTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptOtyTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        javax.swing.GroupLayout receiptOrderPanelLayout = new javax.swing.GroupLayout(receiptOrderPanel);
        receiptOrderPanel.setLayout(receiptOrderPanelLayout);
        receiptOrderPanelLayout.setHorizontalGroup(
            receiptOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                .addGroup(receiptOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(receiptOrderNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptSizeLabel))
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(receiptOrderLabel))
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptShapeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptFlavourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptShapesLabel))
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptFlavourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptOtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptQtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        receiptOrderPanelLayout.setVerticalGroup(
            receiptOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(receiptOrderNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(receiptOrderLabel)
                .addGap(18, 18, 18)
                .addComponent(receiptSizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(receiptShapesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptShapeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(receiptFlavourLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptFlavourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(receiptQtyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptOtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        
        pack();
    }
    
    private void initCustDetailsComponents() {
 
        receiptDetailsPanel = new javax.swing.JPanel();
        receiptDetailsLabel = new javax.swing.JLabel();
        receiptFNameLabel = new javax.swing.JLabel();
        receiptFNTextField = new javax.swing.JTextField();
        receiptLNameLabel = new javax.swing.JLabel();
        receiptLNTextField = new javax.swing.JTextField();
        receiptAddressLabel = new javax.swing.JLabel();
        receiptAddressScrollPane = new javax.swing.JScrollPane();
        receiptAddressTextArea = new javax.swing.JTextArea();
        receiptEmailLabel = new javax.swing.JLabel();
        receiptEmailTextField = new javax.swing.JTextField();
        receiptPhLabel = new javax.swing.JLabel();
        receiptPhTextField = new javax.swing.JTextField();
        
        receiptDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        receiptDetailsLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        receiptDetailsLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptDetailsLabel.setText("Customer Details:");

        receiptFNameLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptFNameLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptFNameLabel.setText("First Name:");
        
        receiptFNTextField.setEditable(false);
        receiptFNTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptFNTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptFNTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        receiptLNameLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptLNameLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptLNameLabel.setText("Last Name:");
        
        receiptLNTextField.setEditable(false);
        receiptLNTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptLNTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptLNTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        receiptAddressLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptAddressLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptAddressLabel.setText("Address:");
        
        receiptAddressTextArea.setBackground(new java.awt.Color(255, 255, 255));
        receiptAddressTextArea.setColumns(25);
        receiptAddressTextArea.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptAddressTextArea.setForeground(new java.awt.Color(0, 102, 102));
        receiptAddressTextArea.setRows(5);
        receiptAddressScrollPane.setViewportView(receiptAddressTextArea);
        
        receiptEmailLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptEmailLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptEmailLabel.setText("Email Address:");
        
        receiptEmailTextField.setEditable(false);
        receiptEmailTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptEmailTextField.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        receiptEmailTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        receiptPhLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptPhLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptPhLabel.setText("Phone Number:");

        receiptPhTextField.setEditable(false);
        receiptPhTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptPhTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptPhTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        javax.swing.GroupLayout receiptDetailsPanelLayout = new javax.swing.GroupLayout(receiptDetailsPanel);
        receiptDetailsPanel.setLayout(receiptDetailsPanelLayout);
        receiptDetailsPanelLayout.setHorizontalGroup(
            receiptDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                .addGroup(receiptDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptFNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptLNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptAddressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptLNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(receiptDetailsLabel))
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(receiptEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(receiptEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiptPhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiptPhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        receiptDetailsPanelLayout.setVerticalGroup(
            receiptDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(receiptDetailsLabel)
                .addGap(18, 18, 18)
                .addComponent(receiptFNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptFNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiptLNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptLNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(receiptAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptAddressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(receiptEmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiptPhLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptPhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }
    
    private void initDelOrPicComponents() {
        receiptDelOrPicPanel = new javax.swing.JPanel();
        receiptDelOrPicLabel = new javax.swing.JLabel();
        receiptDelOrPicTextField = new javax.swing.JTextField();
        
         receiptDelOrPicPanel.setBackground(new java.awt.Color(255, 255, 255));

        receiptDelOrPicLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptDelOrPicLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptDelOrPicLabel.setText("Delivery or Pickup:");

        receiptDelOrPicTextField.setEditable(false);
        receiptDelOrPicTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptDelOrPicTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptDelOrPicTextField.setForeground(new java.awt.Color(0, 102, 102));
        // Setting what user selects in delivery or pick up combo box from OrderingView class
        receiptDelOrPicTextField.setText(OrderingView.detailsDelOrPicComboBox.getSelectedItem().toString());

        javax.swing.GroupLayout receiptDelOrPicPanelLayout = new javax.swing.GroupLayout(receiptDelOrPicPanel);
        receiptDelOrPicPanel.setLayout(receiptDelOrPicPanelLayout);
        receiptDelOrPicPanelLayout.setHorizontalGroup(
            receiptDelOrPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receiptDelOrPicPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(receiptDelOrPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receiptDelOrPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiptDelOrPicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        receiptDelOrPicPanelLayout.setVerticalGroup(
            receiptDelOrPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptDelOrPicPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(receiptDelOrPicLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptDelOrPicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        
        pack();
    }
    
    private void initTotalComponents() {
        receipTotalPanel = new javax.swing.JPanel();
        receiptSubTotalLabel = new javax.swing.JLabel();
        receiptSubTotalTextField = new javax.swing.JTextField();
        receiptTotalLabel = new javax.swing.JLabel();
        receiptTotalTextField = new javax.swing.JTextField();
        
        receipTotalPanel.setBackground(new java.awt.Color(255, 255, 255));

        receiptSubTotalLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptSubTotalLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptSubTotalLabel.setText("Sub Total:");

        receiptSubTotalTextField.setEditable(false);
        receiptSubTotalTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptSubTotalTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptSubTotalTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        // will print cake size price:
        //receiptSubTotalTextField.setText(Double.toString(CalculateCakeSize.getPriceForSize()));
        
        receiptSubTotalTextField.setText(Double.toString(CalculatePrices.getSubTotal()));
        
        
       // receiptSubTotalTextField.setText(Double.toString(CalculatePrices.printSub()));
       //receiptSubTotalTextField.setText(Double.toString(CalculatePrices.getSubTotal()));
        
        receiptTotalLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptTotalLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptTotalLabel.setText("TOTAL:");

        receiptTotalTextField.setEditable(false);
        receiptTotalTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptTotalTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        receiptTotalTextField.setForeground(new java.awt.Color(0, 102, 102));
        //CalculatePrice cp = new CalculatePrice();
        //receiptTotalTextField.setText(String.valueOf(CalculatePrice.getTotalPrice()));
        

        javax.swing.GroupLayout receipTotalPanelLayout = new javax.swing.GroupLayout(receipTotalPanel);
        receipTotalPanel.setLayout(receipTotalPanelLayout);
        receipTotalPanelLayout.setHorizontalGroup(
            receipTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receipTotalPanelLayout.createSequentialGroup()
                .addGroup(receipTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receipTotalPanelLayout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(receipTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receiptSubTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptSubTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receipTotalPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(receipTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, receipTotalPanelLayout.createSequentialGroup()
                                .addComponent(receiptTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addComponent(receiptTotalTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        receipTotalPanelLayout.setVerticalGroup(
            receipTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receipTotalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receiptSubTotalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptSubTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(receiptTotalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        
        pack();
    }
    
    private void initEndComponents() {
         javax.swing.GroupLayout receiptPanelLayout = new javax.swing.GroupLayout(receiptPanel);
        receiptPanel.setLayout(receiptPanelLayout);
        receiptPanelLayout.setHorizontalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(receiptOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receiptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiptDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receiptDelOrPicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receipTotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receiptOrderAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        receiptPanelLayout.setVerticalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(receiptOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(receiptPanelLayout.createSequentialGroup()
                                .addComponent(receiptDelOrPicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(receipTotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receiptConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(receiptOrderAgainButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(receiptPanelLayout.createSequentialGroup()
                                .addComponent(receiptLabel)
                                .addGap(37, 37, 37)
                                .addComponent(receiptDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(54, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        pack();
    }
}
