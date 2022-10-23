/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

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
    private javax.swing.JLabel receiptLabel;
    private javax.swing.JButton receiptOrderAgainButton;
    private javax.swing.JLabel receiptOrderLabel;
    private javax.swing.JPanel receiptOrderPanel;
    private javax.swing.JTextField receiptOtyTextField;
    private javax.swing.JPanel receiptPanel;
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
    
    public ReceiptView() {
        initReceiptPageGui();
    }
    
    
    private void initReceiptPageGui() {
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        receiptPanel.setBackground(new java.awt.Color(255, 255, 255));
        receiptPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        receiptLabel.setBackground(new java.awt.Color(255, 255, 255));
        receiptLabel.setFont(new java.awt.Font("Corbel", 1, 40)); // NOI18N
        receiptLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        receiptLabel.setText("RECEIPT:");

        receiptConfirmButton.setBackground(new java.awt.Color(0, 51, 51));
        receiptConfirmButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        receiptConfirmButton.setText("Confirm");

        receiptOrderAgainButton.setBackground(new java.awt.Color(0, 51, 51));
        receiptOrderAgainButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptOrderAgainButton.setForeground(new java.awt.Color(255, 255, 255));
        receiptOrderAgainButton.setText("Order Again");

        receiptOrderPanel.setBackground(new java.awt.Color(255, 255, 255));

        receiptOrderLabel.setBackground(new java.awt.Color(255, 255, 255));
        receiptOrderLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        receiptOrderLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptOrderLabel.setText("Order Details:");

        receiptSizeLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptSizeLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptSizeLabel.setText("Cake Size:");

        receiptShapesLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptShapesLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptShapesLabel.setText("Cake Shape:");

        receiptFlavourLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptFlavourLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptFlavourLabel.setText("Cake Flavour:");

        receiptQuantityLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptQuantityLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptQuantityLabel.setText("Quantity:");

        receiptSizeTextField.setEditable(false);
        receiptSizeTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptSizeTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptSizeTextField.setForeground(new java.awt.Color(0, 102, 102));

        receiptShapeTextField.setEditable(false);
        receiptShapeTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptShapeTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptShapeTextField.setForeground(new java.awt.Color(0, 102, 102));

        receiptFlavourTextField.setEditable(false);
        receiptFlavourTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptFlavourTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptFlavourTextField.setForeground(new java.awt.Color(0, 102, 102));

        receiptOtyTextField.setEditable(false);
        receiptOtyTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptOtyTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N

        javax.swing.GroupLayout receiptOrderPanelLayout = new javax.swing.GroupLayout(receiptOrderPanel);
        receiptOrderPanel.setLayout(receiptOrderPanelLayout);
        receiptOrderPanelLayout.setHorizontalGroup(
            receiptOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                .addGroup(receiptOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(receiptOtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(receiptOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(receiptOrderLabel))
                        .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(receiptOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(receiptSizeLabel)
                                .addComponent(receiptShapesLabel)
                                .addComponent(receiptFlavourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(receiptQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(receiptSizeTextField)
                                .addComponent(receiptShapeTextField)
                                .addComponent(receiptFlavourTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        receiptOrderPanelLayout.setVerticalGroup(
            receiptOrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptOrderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receiptOrderLabel)
                .addGap(28, 28, 28)
                .addComponent(receiptSizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(receiptShapesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptShapeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiptFlavourLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptFlavourTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(receiptQuantityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptOtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        receiptDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        receiptDetailsLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        receiptDetailsLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptDetailsLabel.setText("Customer Details:");

        receiptFNameLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptFNameLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptFNameLabel.setText("First Name:");

        receiptLNameLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptLNameLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptLNameLabel.setText("Last Name:");

        receiptAddressLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptAddressLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptAddressLabel.setText("Address:");

        receiptEmailLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptEmailLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptEmailLabel.setText("Email Address:");

        receiptPhLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptPhLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptPhLabel.setText("Phone Number:");

        receiptAddressTextArea.setEditable(false);
        receiptAddressTextArea.setBackground(new java.awt.Color(255, 255, 255));
        receiptAddressTextArea.setColumns(20);
        receiptAddressTextArea.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptAddressTextArea.setForeground(new java.awt.Color(0, 102, 102));
        receiptAddressTextArea.setRows(5);
        receiptAddressScrollPane.setViewportView(receiptAddressTextArea);

        receiptFNTextField.setEditable(false);
        receiptFNTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptFNTextField.setFont(new java.awt.Font("Corbel", 0, 12)); // NOI18N
        receiptFNTextField.setToolTipText("");

        receiptLNTextField.setEditable(false);
        receiptLNTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptLNTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptLNTextField.setForeground(new java.awt.Color(0, 102, 102));

        receiptEmailTextField.setEditable(false);
        receiptEmailTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptEmailTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptEmailTextField.setForeground(new java.awt.Color(0, 102, 102));

        receiptPhTextField.setEditable(false);
        receiptPhTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptPhTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptPhTextField.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout receiptDetailsPanelLayout = new javax.swing.GroupLayout(receiptDetailsPanel);
        receiptDetailsPanel.setLayout(receiptDetailsPanelLayout);
        receiptDetailsPanelLayout.setHorizontalGroup(
            receiptDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                .addGroup(receiptDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(receiptDetailsLabel))
                    .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(receiptDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receiptAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptFNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptLNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptPhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(receiptDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(receiptLNTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addComponent(receiptAddressScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(receiptFNTextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(receiptEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptPhLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        receiptDetailsPanelLayout.setVerticalGroup(
            receiptDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receiptDetailsLabel)
                .addGap(21, 21, 21)
                .addComponent(receiptFNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptFNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiptLNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptLNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiptAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(receiptAddressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(receiptEmailLabel)
                .addGap(1, 1, 1)
                .addComponent(receiptEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receiptPhLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptPhTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        receiptDelOrPicPanel.setBackground(new java.awt.Color(255, 255, 255));

        receiptDelOrPicLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptDelOrPicLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptDelOrPicLabel.setText("Delivery or Pickup:");

        receiptDelOrPicTextField.setEditable(false);
        receiptDelOrPicTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptDelOrPicTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptDelOrPicTextField.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout receiptDelOrPicPanelLayout = new javax.swing.GroupLayout(receiptDelOrPicPanel);
        receiptDelOrPicPanel.setLayout(receiptDelOrPicPanelLayout);
        receiptDelOrPicPanelLayout.setHorizontalGroup(
            receiptDelOrPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptDelOrPicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(receiptDelOrPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receiptDelOrPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receiptDelOrPicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        receiptDelOrPicPanelLayout.setVerticalGroup(
            receiptDelOrPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptDelOrPicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receiptDelOrPicLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptDelOrPicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        receipTotalPanel.setBackground(new java.awt.Color(255, 255, 255));

        receiptSubTotalLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptSubTotalLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptSubTotalLabel.setText("Sub Total:");

        receiptTotalLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        receiptTotalLabel.setForeground(new java.awt.Color(0, 102, 102));
        receiptTotalLabel.setText("TOTAL:");

        receiptSubTotalTextField.setEditable(false);
        receiptSubTotalTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptSubTotalTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptSubTotalTextField.setForeground(new java.awt.Color(0, 102, 102));

        receiptTotalTextField.setEditable(false);
        receiptTotalTextField.setBackground(new java.awt.Color(255, 255, 255));
        receiptTotalTextField.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        receiptTotalTextField.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout receipTotalPanelLayout = new javax.swing.GroupLayout(receipTotalPanel);
        receipTotalPanel.setLayout(receipTotalPanelLayout);
        receipTotalPanelLayout.setHorizontalGroup(
            receipTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receipTotalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(receipTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receiptSubTotalTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(receipTotalPanelLayout.createSequentialGroup()
                        .addGroup(receipTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(receiptSubTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(receiptTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        receipTotalPanelLayout.setVerticalGroup(
            receipTotalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receipTotalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(receiptSubTotalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptSubTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(receiptTotalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiptTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout receiptPanelLayout = new javax.swing.GroupLayout(receiptPanel);
        receiptPanel.setLayout(receiptPanelLayout);
        receiptPanelLayout.setHorizontalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(receiptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(receiptOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(receiptDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receiptDelOrPicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(receipTotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(receiptOrderAgainButton)
                .addGap(29, 29, 29)
                .addComponent(receiptConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        receiptPanelLayout.setVerticalGroup(
            receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiptPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(receiptLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(receiptOrderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(receiptDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(receiptPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(receiptDelOrPicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(receipTotalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(receiptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(receiptOrderAgainButton)
                    .addComponent(receiptConfirmButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(receiptPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
    }
    
}
