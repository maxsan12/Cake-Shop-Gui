/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultComboBoxModel;
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
    public javax.swing.JComboBox<CakeSizes> orderingSizesComboBox; //
    private javax.swing.JLabel orderingShapesLabel;
    public javax.swing.JComboBox<CakeShapes> orderingShapesComboBox; // using Cake Shapes enum class for the shape combo box
    private javax.swing.JLabel orderingFlavoursLabel;
    public javax.swing.JComboBox<CakeFlavours> orderingFlavoursComboBox; // using Cake Flavours enum class for the flavours combo box
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
    
    
    private void mainPageGui() {
        
        // Instantiating Main Page gui components
        panelForFrame = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        tabsPanel = new javax.swing.JTabbedPane();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CC CAKES");
        setBackground(new java.awt.Color(0, 102, 102));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelForFrame.setBackground(new java.awt.Color(255, 255, 255));
        panelForFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePanel.setBackground(new java.awt.Color(255, 255, 255));
        titlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 102, 102));
        titleLabel.setText("CC CAKES");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(titleLabel)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(15, 15, 15))
        );

        panelForFrame.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 110));
        tabsPanel.setBackground(new java.awt.Color(255, 255, 255));
        tabsPanel.setBorder(null);
        tabsPanel.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        
        
        // Instantiating home panel gui components 
        homePanel = new javax.swing.JPanel();
        homeIconLabel = new javax.swing.JLabel();
        homeContinueBttn = new javax.swing.JButton();
      
        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePageImage hpi = new HomePageImage();
        this.add(hpi, BorderLayout.CENTER); // setting image to the center
        homePanel.add(hpi); // adding image from HomePageImage class 
        
        //homeIconLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\maxin\\Desktop\\home page.jpg")); // NOI18N
        //homePanel.add(homeIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 29, -1, -1));

        homeContinueBttn.setBackground(new java.awt.Color(0, 51, 51));
        homeContinueBttn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        homeContinueBttn.setForeground(new java.awt.Color(255, 255, 255));
        homeContinueBttn.setText("CONTINUE");
        homePanel.add(homeContinueBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 411, -1, 38));
        
        tabsPanel.addTab("Home", homePanel);
        
        
        
        // Instantiating ordering panel gui components
        orderingPanel = new javax.swing.JPanel();
        orderingSizesLabel = new javax.swing.JLabel();
        orderingShapesLabel = new javax.swing.JLabel();
        orderingFlavoursLabel = new javax.swing.JLabel();
        orderingQuantityLabel = new javax.swing.JLabel();
        orderingCartScrollPane = new javax.swing.JScrollPane();
        orderingCartTextArea = new javax.swing.JTextArea();
        orderingSizesComboBox = new javax.swing.JComboBox<>();
        orderingShapesComboBox = new javax.swing.JComboBox<>();
        orderingFlavoursComboBox = new javax.swing.JComboBox<>();
        orderingAddButton = new javax.swing.JButton();
        orderingSubtractButton = new javax.swing.JButton();
        orderingQtyNoLabel = new javax.swing.JLabel();
        orderingBackButton = new javax.swing.JButton();
        orderingContinueButton = new javax.swing.JButton();
        orderingCartLabel = new javax.swing.JLabel();
        
        orderingPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        orderingPanel.setLayout(null);

        orderingSizesLabel.setBackground(new java.awt.Color(255, 255, 255));
        orderingSizesLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingSizesLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingSizesLabel.setText("Cake Sizes:");
        orderingPanel.add(orderingSizesLabel);
        orderingSizesLabel.setBounds(90, 50, 96, 30);

        orderingShapesLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingShapesLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingShapesLabel.setText("Cake Shapes:");
        orderingPanel.add(orderingShapesLabel);
        orderingShapesLabel.setBounds(80, 140, 120, 30);

        orderingFlavoursLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingFlavoursLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingFlavoursLabel.setText("Cake Flavours:");
        orderingPanel.add(orderingFlavoursLabel);
        orderingFlavoursLabel.setBounds(80, 230, 130, 30);

        orderingQuantityLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingQuantityLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingQuantityLabel.setText("Quantity:");
        orderingPanel.add(orderingQuantityLabel);
        orderingQuantityLabel.setBounds(100, 330, 90, 30);

        orderingCartTextArea.setBackground(new java.awt.Color(255, 255, 255));
        orderingCartTextArea.setColumns(20);
        orderingCartTextArea.setRows(5);
        orderingCartTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        orderingCartScrollPane.setViewportView(orderingCartTextArea);

        orderingPanel.add(orderingCartScrollPane);
        orderingCartScrollPane.setBounds(370, 70, 270, 340);

        orderingSizesComboBox.setBackground(new java.awt.Color(0, 51, 51));
        orderingPanel.add(orderingSizesComboBox);
        
        orderingSizesComboBox.setBounds(60, 80, 160, 26);

        orderingShapesComboBox.setBackground(new java.awt.Color(0, 51, 51));
        orderingShapesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        orderingShapesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>());
        orderingPanel.add(orderingShapesComboBox);
        orderingShapesComboBox.setBounds(60, 170, 160, 26);

        orderingFlavoursComboBox.setBackground(new java.awt.Color(0, 51, 51));
        orderingFlavoursComboBox.setForeground(new java.awt.Color(255, 255, 255));
        // using DefaultComboBox
        orderingFlavoursComboBox.setModel(new DefaultComboBoxModel<>(CakeFlavours.values()));
        //orderingFlavoursComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orderingPanel.add(orderingFlavoursComboBox);
        orderingFlavoursComboBox.setBounds(60, 260, 160, 26);

        orderingAddButton.setBackground(new java.awt.Color(0, 51, 51));
        orderingAddButton.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderingAddButton.setForeground(new java.awt.Color(255, 255, 255));
        orderingAddButton.setText("+");
        orderingPanel.add(orderingAddButton);
        orderingAddButton.setBounds(170, 360, 40, 32);

        orderingSubtractButton.setBackground(new java.awt.Color(0, 51, 51));
        orderingSubtractButton.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderingSubtractButton.setForeground(new java.awt.Color(255, 255, 255));
        orderingSubtractButton.setText("-");
        orderingPanel.add(orderingSubtractButton);
        orderingSubtractButton.setBounds(70, 360, 40, 32);

        orderingQtyNoLabel.setBackground(new java.awt.Color(255, 255, 255));
        orderingQtyNoLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        orderingQtyNoLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingQtyNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderingQtyNoLabel.setText("1");
        orderingPanel.add(orderingQtyNoLabel);
        orderingQtyNoLabel.setBounds(110, 360, 60, 30);

        orderingBackButton.setBackground(new java.awt.Color(0, 51, 51));
        orderingBackButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingBackButton.setForeground(new java.awt.Color(255, 255, 255));
        orderingBackButton.setText("<");
        orderingPanel.add(orderingBackButton);
        orderingBackButton.setBounds(240, 440, 70, 30);

        orderingContinueButton.setBackground(new java.awt.Color(0, 51, 51));
        orderingContinueButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingContinueButton.setForeground(new java.awt.Color(255, 255, 255));
        orderingContinueButton.setText(">");
        orderingPanel.add(orderingContinueButton);
        orderingContinueButton.setBounds(330, 440, 70, 30);

        orderingCartLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        orderingCartLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingCartLabel.setText("Your Cart:");
        orderingPanel.add(orderingCartLabel);
        orderingCartLabel.setBounds(370, 50, 80, 20);

        tabsPanel.addTab("Ordering", orderingPanel);
        
        
        
        // Instantiating login panel gui components
        loginPanel = new javax.swing.JPanel();
        loginUserTextField = new javax.swing.JTextField();
        loginTextLabel = new javax.swing.JLabel();
        loginUsernameLabel = new javax.swing.JLabel();
        loginPasswordLabel = new javax.swing.JLabel();
        loginUserPasswordField = new javax.swing.JPasswordField();
        loginContinueButton = new javax.swing.JButton();
        loginBackButton = new javax.swing.JButton();
        
        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        loginPanel.setLayout(null);

        loginUserTextField.setBackground(new java.awt.Color(204, 204, 204));
        loginUserTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        loginUserTextField.setForeground(new java.awt.Color(0, 51, 51));
        loginPanel.add(loginUserTextField);
        loginUserTextField.setBounds(310, 190, 200, 30);

        loginTextLabel.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        loginTextLabel.setForeground(new java.awt.Color(0, 102, 102));
        loginTextLabel.setText("Login or create an account to proceed:");
        loginPanel.add(loginTextLabel);
        loginTextLabel.setBounds(170, 120, 397, 30);

        loginUsernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        loginUsernameLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        loginUsernameLabel.setForeground(new java.awt.Color(0, 102, 102));
        loginUsernameLabel.setText("Username:");
        loginPanel.add(loginUsernameLabel);
        loginUsernameLabel.setBounds(210, 200, 88, 20);

        loginPasswordLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        loginPasswordLabel.setForeground(new java.awt.Color(0, 102, 102));
        loginPasswordLabel.setText("Password:");
        loginPanel.add(loginPasswordLabel);
        loginPasswordLabel.setBounds(210, 260, 80, 20);

        loginUserPasswordField.setBackground(new java.awt.Color(204, 204, 204));
        loginUserPasswordField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        loginUserPasswordField.setForeground(new java.awt.Color(0, 51, 51));
        loginPanel.add(loginUserPasswordField);
        loginUserPasswordField.setBounds(310, 250, 200, 30);

        loginContinueButton.setBackground(new java.awt.Color(0, 51, 51));
        loginContinueButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        loginContinueButton.setForeground(new java.awt.Color(255, 255, 255));
        loginContinueButton.setText("Continue");
        loginPanel.add(loginContinueButton);
        loginContinueButton.setBounds(360, 350, 100, 30);

        loginBackButton.setBackground(new java.awt.Color(0, 51, 51));
        loginBackButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        loginBackButton.setForeground(new java.awt.Color(255, 255, 255));
        loginBackButton.setText("Back");
        loginPanel.add(loginBackButton);
        loginBackButton.setBounds(230, 350, 100, 30);

        tabsPanel.addTab("Login", loginPanel);
        
        
        
        // Instantiating details panel gui components
        detailsPanel = new javax.swing.JPanel();
        detailsFNLabel = new javax.swing.JLabel();
        detailsLNLabel = new javax.swing.JLabel();
        detailsAddressLabel = new javax.swing.JLabel();
        detailsEmailLabel = new javax.swing.JLabel();
        detailsPhNoLabel = new javax.swing.JLabel();
        detailsFNTextField = new javax.swing.JTextField();
        detailsLNTextField = new javax.swing.JTextField();
        detailsEmailTextField = new javax.swing.JTextField();
        detailsPhNoTextField = new javax.swing.JTextField();
        detailsDelOrPicComboBox = new javax.swing.JComboBox<>();
        detailsDelOrPicLabel = new javax.swing.JLabel();
        detailsAddressScrollPane = new javax.swing.JScrollPane();
        detailsAddressTextArea = new javax.swing.JTextArea();
        detailsBackButton = new javax.swing.JButton();
        detailsContinueButton = new javax.swing.JButton();
        
        detailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        detailsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        detailsPanel.setLayout(null);

        detailsFNLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsFNLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsFNLabel.setText("First Name:");
        detailsPanel.add(detailsFNLabel);
        detailsFNLabel.setBounds(60, 90, 79, 20);

        detailsLNLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsLNLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsLNLabel.setText("Last Name:");
        detailsPanel.add(detailsLNLabel);
        detailsLNLabel.setBounds(60, 140, 80, 20);

        detailsAddressLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsAddressLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsAddressLabel.setText("Address:");
        detailsPanel.add(detailsAddressLabel);
        detailsAddressLabel.setBounds(60, 190, 80, 20);

        detailsEmailLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsEmailLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsEmailLabel.setText("Email Address:");
        detailsPanel.add(detailsEmailLabel);
        detailsEmailLabel.setBounds(60, 310, 120, 30);

        detailsPhNoLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsPhNoLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsPhNoLabel.setText("Phone Number:");
        detailsPanel.add(detailsPhNoLabel);
        detailsPhNoLabel.setBounds(60, 370, 120, 20);

        detailsFNTextField.setBackground(new java.awt.Color(204, 204, 204));
        detailsFNTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        detailsFNTextField.setForeground(new java.awt.Color(0, 102, 102));
        detailsFNTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        detailsPanel.add(detailsFNTextField);
        detailsFNTextField.setBounds(190, 90, 240, 22);

        detailsLNTextField.setBackground(new java.awt.Color(204, 204, 204));
        detailsLNTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        detailsLNTextField.setForeground(new java.awt.Color(0, 102, 102));
        detailsLNTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        detailsPanel.add(detailsLNTextField);
        detailsLNTextField.setBounds(190, 140, 240, 22);

        detailsEmailTextField.setBackground(new java.awt.Color(204, 204, 204));
        detailsEmailTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        detailsEmailTextField.setForeground(new java.awt.Color(0, 102, 102));
        detailsEmailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        detailsPanel.add(detailsEmailTextField);
        detailsEmailTextField.setBounds(190, 310, 240, 22);

        detailsPhNoTextField.setBackground(new java.awt.Color(204, 204, 204));
        detailsPhNoTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        detailsPhNoTextField.setForeground(new java.awt.Color(0, 102, 102));
        detailsPhNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        detailsPanel.add(detailsPhNoTextField);
        detailsPhNoTextField.setBounds(190, 360, 240, 22);

        detailsDelOrPicComboBox.setBackground(new java.awt.Color(0, 51, 51));
        detailsDelOrPicComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        detailsPanel.add(detailsDelOrPicComboBox);
        detailsDelOrPicComboBox.setBounds(500, 230, 130, 26);

        detailsDelOrPicLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsDelOrPicLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsDelOrPicLabel.setText("Delivery or Pick Up:");
        detailsPanel.add(detailsDelOrPicLabel);
        detailsDelOrPicLabel.setBounds(500, 200, 150, 20);

        detailsAddressTextArea.setBackground(new java.awt.Color(204, 204, 204));
        detailsAddressTextArea.setColumns(20);
        detailsAddressTextArea.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        detailsAddressTextArea.setForeground(new java.awt.Color(0, 102, 102));
        detailsAddressTextArea.setRows(5);
        detailsAddressTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        detailsAddressScrollPane.setViewportView(detailsAddressTextArea);

        detailsPanel.add(detailsAddressScrollPane);
        detailsAddressScrollPane.setBounds(190, 180, 240, 83);

        detailsBackButton.setBackground(new java.awt.Color(0, 51, 51));
        detailsBackButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        detailsBackButton.setForeground(new java.awt.Color(255, 255, 255));
        detailsBackButton.setText("<");
        detailsPanel.add(detailsBackButton);
        detailsBackButton.setBounds(260, 450, 80, 30);

        detailsContinueButton.setBackground(new java.awt.Color(0, 51, 51));
        detailsContinueButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        detailsContinueButton.setForeground(new java.awt.Color(255, 255, 255));
        detailsContinueButton.setText(">");
        detailsPanel.add(detailsContinueButton);
        detailsContinueButton.setBounds(360, 450, 73, 30);

        tabsPanel.addTab("Customer Details", detailsPanel);

        panelForFrame.add(tabsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 700, 540));

        getContentPane().add(panelForFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 630));

        pack();
        
        // Implement actionlistener here

    }
    
    @Override
    public void update(Observable o, Object o1) {
        
    }
    
    
}
