/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

import CakeShopChoices.CakeSizes;
import CakeShopChoices.CakeShapes;
import CakeShopChoices.CakeFlavours;
import CakeShopChoices.DeliveryOrPickup;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;

/**
 *
 * @author Maxinne Santico 19084694
 COMP603/50 - 19084694
 
 This class is designed as the 'OrderingView' class inspired by the MVC design pattern
 The view class should contain what the user will be seeing - the full gui. 
 NOTE: class is long since there are multiple tabs inside a JTabbedPane. 
 I decided to go with this route instead of creating multiple new JFrames and
 Instantiating them as this could potential slow down the process. 
 * 
 */
public final class OrderingView extends JFrame {
    
    // Declare ActionListnener for addActionListener method later for components below
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
    public javax.swing.JTabbedPane tabsPanel; // tabbed panel for panels below
    
    // Components for Home Panel
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel homeIconLabel;
    public javax.swing.JButton homeContinueBttn;
    
    // Components for Ordering Panel
    private javax.swing.JPanel orderingPanel;
    private javax.swing.JLabel orderingSizesLabel;
    public static javax.swing.JComboBox<CakeSizes> orderingSizesComboBox; // using Cake Sizes enum class for the sizes combo box
    private javax.swing.JLabel orderingShapesLabel;
    public static javax.swing.JComboBox<CakeShapes> orderingShapesComboBox; // using Cake Shapes enum class for the shape combo box
    private javax.swing.JLabel orderingFlavoursLabel;
    public static javax.swing.JComboBox<CakeFlavours> orderingFlavoursComboBox; // using Cake Flavours enum class for the flavours combo box
    private javax.swing.JLabel orderingQuantityLabel;
    private javax.swing.JLabel orderingQtyNoLabel;
    public javax.swing.JButton orderingQtyAddButton;
    public static int orderingQuantity = 1; // declare as 1 so that the quantity is 1 in ording QtyNoLabel.
    public javax.swing.JButton orderingQtySubtractButton;
    private javax.swing.JPanel orderingCartPanel;
    private javax.swing.JLabel orderingCartLabel;
    private javax.swing.JLabel orderingCartSizesLabel;
    private javax.swing.JTextField orderingCartSizesTextField;
    private javax.swing.JLabel orderingCartShapesLabel;
    private javax.swing.JTextField orderingCartShapesTextField;
    private javax.swing.JLabel orderingCartFlavoursLabel;
    private javax.swing.JTextField orderingCartFlavoursTextField;
    private javax.swing.JLabel orderingCartQuantityLabel;
    private javax.swing.JTextField orderingCartQuantityTextField;
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
    public static javax.swing.JComboBox<DeliveryOrPickup> detailsDelOrPicComboBox;
    public javax.swing.JButton detailsBackButton;
    public javax.swing.JButton detailsContinueButton;
    
    public OrderingView() {
        initMainComponents();
        initHomeComponents();
        initLoginComponents();
        initOrderingComponents();
        initDetailsComponents();
        loadBoxes();
        //initActionListener();

    }
    
    private void initMainComponents() {
        
        // Instantiating Main Page gui components
        panelForFrame = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        tabsPanel = new javax.swing.JTabbedPane();
        
        // Setting and adding elements to main page components
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CC CAKES");
        setBackground(new java.awt.Color(0, 102, 102));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 630));

        panelForFrame.setBackground(new java.awt.Color(255, 255, 255));

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
        
        tabsPanel.setBackground(new java.awt.Color(255, 255, 255));
        tabsPanel.setBorder(null);
        tabsPanel.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        //tabsPanel.setSize(700, 559); // setting tabsPanel/JTabbedPanel to this specific size so that the panel can stay hidden when executed
        
        pack();
    }
    
    private void initHomeComponents() {
        
        // Instantiating home panel gui components 
        homePanel = new javax.swing.JPanel();
        homeIconLabel = new javax.swing.JLabel();
        homeContinueBttn = new javax.swing.JButton();
      
        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        homePanel.setPreferredSize(new Dimension (500, 450));
        // Creating an instance of HomePageImage class, which holds the image we need for home page panel
        //HomePageImage hpi = new HomePageImage();
        //this.add(hpi, BorderLayout.CENTER); // setting image to the center
        //homePanel.add(hpi); // adding image from HomePageImage class 
        
        homeIconLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\maxin\\Desktop\\homepage.jpg")); // NOI18N

        homeContinueBttn.setBackground(new java.awt.Color(0, 51, 51));
        homeContinueBttn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        homeContinueBttn.setForeground(new java.awt.Color(255, 255, 255));
        homeContinueBttn.setText("CONTINUE");
        homeContinueBttn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Go to the next page which is the ordering panel
                tabsPanel.setSelectedIndex(1);
            }
        });
        
        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(homeIconLabel))
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(homeContinueBttn))
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(homeIconLabel)
                .addGap(45, 45, 45)
                .addComponent(homeContinueBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        
        tabsPanel.addTab("Home", homePanel);
        
        pack();
    }
    
    private void initLoginComponents() {
        
        // Instantiating login panel gui components
        loginPanel = new javax.swing.JPanel();
        loginUserTextField = new javax.swing.JTextField();
        loginTextLabel = new javax.swing.JLabel();
        loginUsernameLabel = new javax.swing.JLabel();
        loginPasswordLabel = new javax.swing.JLabel();
        loginUserPasswordField = new javax.swing.JPasswordField();
        loginContinueButton = new javax.swing.JButton();
        loginBackButton = new javax.swing.JButton();
        
        // Setting and adding elements to login components
        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        
        loginUserTextField.setBackground(new java.awt.Color(204, 204, 204));
        loginUserTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        loginUserTextField.setForeground(new java.awt.Color(0, 51, 51));

        loginTextLabel.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        loginTextLabel.setForeground(new java.awt.Color(0, 102, 102));
        loginTextLabel.setText("Login or create an account to proceed:");

        loginUsernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        loginUsernameLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        loginUsernameLabel.setForeground(new java.awt.Color(0, 102, 102));
        loginUsernameLabel.setText("Username:");

        loginPasswordLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        loginPasswordLabel.setForeground(new java.awt.Color(0, 102, 102));
        loginPasswordLabel.setText("Password:");

        loginUserPasswordField.setBackground(new java.awt.Color(204, 204, 204));
        loginUserPasswordField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        loginUserPasswordField.setForeground(new java.awt.Color(0, 51, 51));

        loginContinueButton.setBackground(new java.awt.Color(0, 51, 51));
        loginContinueButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        loginContinueButton.setForeground(new java.awt.Color(255, 255, 255));
        loginContinueButton.setText("Continue");
        loginContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                 // Go to the next Panel which is the Ordering panel
                tabsPanel.setSelectedIndex(2);
            }
        });

        loginBackButton.setBackground(new java.awt.Color(0, 51, 51));
        loginBackButton.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        loginBackButton.setForeground(new java.awt.Color(255, 255, 255));
        loginBackButton.setText("Back");
        loginBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Go back to the previous page which is the home panel
                tabsPanel.setSelectedIndex(0);
            }
        });
        
        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(loginTextLabel))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(loginUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(loginUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(loginPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(loginUserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(loginBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(loginContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(loginTextLabel)
                .addGap(40, 40, 40)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(loginUsernameLabel))
                    .addComponent(loginUserTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(loginPasswordLabel))
                    .addComponent(loginUserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginBackButton)
                    .addComponent(loginContinueButton)))
        );

        tabsPanel.addTab("Login", loginPanel);
        
        pack();
    }
    
    private void initOrderingComponents() {
        
        // Instantiating ordering panel gui components
        orderingPanel = new javax.swing.JPanel();
        orderingSizesLabel = new javax.swing.JLabel();
        orderingSizesComboBox = new javax.swing.JComboBox<>();
        orderingShapesLabel = new javax.swing.JLabel();
        orderingShapesComboBox = new javax.swing.JComboBox<>();
        orderingFlavoursLabel = new javax.swing.JLabel();
        orderingFlavoursComboBox = new javax.swing.JComboBox<>();
        orderingQuantityLabel = new javax.swing.JLabel();
        orderingQtyNoLabel = new javax.swing.JLabel();
        orderingQtyAddButton = new javax.swing.JButton();
        orderingQtySubtractButton = new javax.swing.JButton();
        orderingCartPanel = new javax.swing.JPanel();
        orderingCartLabel = new javax.swing.JLabel();
        orderingCartSizesLabel = new javax.swing.JLabel();
        orderingCartSizesTextField = new javax.swing.JTextField();
        orderingCartShapesLabel = new javax.swing.JLabel();
        orderingCartShapesTextField = new javax.swing.JTextField();
        orderingCartFlavoursLabel = new javax.swing.JLabel();
        orderingCartFlavoursTextField = new javax.swing.JTextField();
        orderingCartQuantityLabel = new javax.swing.JLabel();
        orderingCartQuantityTextField = new javax.swing.JTextField();
        orderingBackButton = new javax.swing.JButton();
        orderingContinueButton = new javax.swing.JButton();
        
        // Setting and adding elements to ordering components
        orderingPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        orderingSizesLabel.setBackground(new java.awt.Color(255, 255, 255));
        orderingSizesLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingSizesLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingSizesLabel.setText("Cake Sizes:");
        
        orderingSizesComboBox.setBackground(new java.awt.Color(0, 51, 51));
        orderingSizesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        orderingSizesComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Getting selected option from sizes combobox
                String selected = orderingSizesComboBox.getSelectedItem().toString();
                // placing selected size option into the textfield
                orderingCartSizesTextField.setText(selected);
            }
        });

        orderingShapesLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingShapesLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingShapesLabel.setText("Cake Shapes:");
        
        orderingShapesComboBox.setBackground(new java.awt.Color(0, 51, 51));
        orderingShapesComboBox.setForeground(new java.awt.Color(255, 255, 255));
        orderingShapesComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // ggetting selected option from sizes combobox
                String selected = orderingShapesComboBox.getSelectedItem().toString();
                // placing selected size option into the textfield
                orderingCartShapesTextField.setText(selected);
            }
        });
        
        orderingFlavoursLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingFlavoursLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingFlavoursLabel.setText("Cake Flavours:");

        orderingFlavoursComboBox.setBackground(new java.awt.Color(0, 51, 51));
        orderingFlavoursComboBox.setForeground(new java.awt.Color(255, 255, 255));
        orderingFlavoursComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // ggetting selected option from sizes combobox
                String selected = orderingFlavoursComboBox.getSelectedItem().toString();
                // placing selected size option into the textfield
                orderingCartFlavoursTextField.setText(selected);
            }
        });
        
        orderingQuantityLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingQuantityLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingQuantityLabel.setText("Quantity:");
        
        orderingQtySubtractButton.setBackground(new java.awt.Color(0, 51, 51));
        orderingQtySubtractButton.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderingQtySubtractButton.setForeground(new java.awt.Color(255, 255, 255));
        orderingQtySubtractButton.setText("-");
        orderingQtySubtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Decrementing quantity that user chooses when they click this button
                // Note: value will only decrement if quantity is greater than 1.
                orderingQuantity = orderingQuantity > 1 ? --orderingQuantity : 1;
                orderingQtyNoLabel.setText(String.valueOf(orderingQuantity));
                orderingCartQuantityTextField.setText(String.valueOf(orderingQuantity));
            }
        });

        orderingQtyNoLabel.setBackground(new java.awt.Color(255, 255, 255));
        orderingQtyNoLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        orderingQtyNoLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingQtyNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderingQtyNoLabel.setText(Integer.toString(orderingQuantity));
        
        orderingQtyAddButton.setBackground(new java.awt.Color(0, 51, 51));
        orderingQtyAddButton.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        orderingQtyAddButton.setForeground(new java.awt.Color(255, 255, 255));
        orderingQtyAddButton.setText("+");
        orderingQtyAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
        
                // Incrementing quantity that user chooses when they click this button
                orderingQuantity++;
                // Setting the value to the orderingQtyNoLabel based on how many times this button is clicked.
                orderingQtyNoLabel.setText(String.valueOf(orderingQuantity));
                orderingCartQuantityTextField.setText(String.valueOf(orderingQuantity));
            }
        });
        
        // Creating cart panel and components inside it for ordering page
        orderingCartLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        orderingCartLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingCartLabel.setText("Your Cart:");
        
        orderingCartPanel.setBackground(new java.awt.Color(255, 255, 255));
        orderingCartPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
       
        orderingCartSizesLabel.setBackground(new java.awt.Color(255, 255, 255));
        orderingCartSizesLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingCartSizesLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingCartSizesLabel.setText("Cake Sizes:");
        
        orderingCartSizesTextField.setEditable(false);
        orderingCartSizesTextField.setBackground(new java.awt.Color(255, 255, 255));
        orderingCartSizesTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        orderingCartSizesTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        orderingCartShapesLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingCartShapesLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingCartShapesLabel.setText("Cake Shapes:");
        
        orderingCartShapesTextField.setEditable(false);
        orderingCartShapesTextField.setBackground(new java.awt.Color(255, 255, 255));
        orderingCartShapesTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        orderingCartShapesTextField.setForeground(new java.awt.Color(0, 102, 102));
        
        orderingCartFlavoursLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingCartFlavoursLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingCartFlavoursLabel.setText("Cake Flavours:");
        
        orderingCartFlavoursTextField.setEditable(false);
        orderingCartFlavoursTextField.setBackground(new java.awt.Color(255, 255, 255));
        orderingCartFlavoursTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        orderingCartFlavoursTextField.setForeground(new java.awt.Color(0, 102, 102));

        orderingCartQuantityLabel.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingCartQuantityLabel.setForeground(new java.awt.Color(0, 102, 102));
        orderingCartQuantityLabel.setText("Quantity:");
        
        orderingCartQuantityTextField.setEditable(false);
        orderingCartQuantityTextField.setBackground(new java.awt.Color(255, 255, 255));
        orderingCartQuantityTextField.setFont(new java.awt.Font("Corbel", 0, 16)); // NOI18N
        orderingCartQuantityTextField.setForeground(new java.awt.Color(0, 102, 102));
        orderingCartQuantityTextField.setText("1"); // setting it to 1 as that is the default value

        orderingBackButton.setBackground(new java.awt.Color(0, 51, 51));
        orderingBackButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingBackButton.setForeground(new java.awt.Color(255, 255, 255));
        orderingBackButton.setText("<");
         orderingBackButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Go back to the previous page which is the login panel
                tabsPanel.setSelectedIndex(1);
            }
        });

        orderingContinueButton.setBackground(new java.awt.Color(0, 51, 51));
        orderingContinueButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        orderingContinueButton.setForeground(new java.awt.Color(255, 255, 255));
        orderingContinueButton.setText(">");
        orderingContinueButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // Go to the next Panel which is the details panel
                tabsPanel.setSelectedIndex(3);
            }
        });
        
        javax.swing.GroupLayout orderingCartPanelLayout = new javax.swing.GroupLayout(orderingCartPanel);
        orderingCartPanel.setLayout(orderingCartPanelLayout);
        orderingCartPanelLayout.setHorizontalGroup(
            orderingCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderingCartPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(orderingCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(orderingCartFlavoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderingCartShapesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderingCartSizesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderingCartSizesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(orderingCartShapesTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(orderingCartQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderingCartFlavoursTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(orderingCartQuantityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        orderingCartPanelLayout.setVerticalGroup(
            orderingCartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderingCartPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(orderingCartSizesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderingCartSizesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderingCartShapesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderingCartShapesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderingCartFlavoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderingCartFlavoursTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orderingCartQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderingCartQuantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout orderingPanelLayout = new javax.swing.GroupLayout(orderingPanel);
        orderingPanel.setLayout(orderingPanelLayout);
        orderingPanelLayout.setHorizontalGroup(
            orderingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderingPanelLayout.createSequentialGroup()
                .addGroup(orderingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderingPanelLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(orderingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(orderingPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(orderingSizesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(orderingSizesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(orderingPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(orderingShapesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(orderingShapesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(orderingPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(orderingFlavoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(orderingFlavoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(orderingPanelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(orderingQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(orderingPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(orderingQtySubtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderingQtyNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderingQtyAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162)
                .addGroup(orderingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderingPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(orderingCartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(orderingCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(orderingPanelLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(orderingBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(orderingContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        orderingPanelLayout.setVerticalGroup(
            orderingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderingPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(orderingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderingPanelLayout.createSequentialGroup()
                        .addComponent(orderingSizesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(orderingSizesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(orderingShapesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(orderingShapesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(orderingFlavoursLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(orderingFlavoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(orderingQuantityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(orderingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderingQtyNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderingQtyAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderingQtySubtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(orderingPanelLayout.createSequentialGroup()
                        .addComponent(orderingCartLabel)
                        .addGap(0, 0, 0)
                        .addComponent(orderingCartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(orderingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderingBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderingContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tabsPanel.addTab("Ordering", orderingPanel);
        
        pack();
    }
    
    private void initDetailsComponents() {
        
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
        
        // setting and adding elements to details components
        detailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        detailsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        detailsFNLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsFNLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsFNLabel.setText("First Name:");

        detailsLNLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsLNLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsLNLabel.setText("Last Name:");

        detailsAddressLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsAddressLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsAddressLabel.setText("Address:");

        detailsEmailLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsEmailLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsEmailLabel.setText("Email Address:");

        detailsPhNoLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsPhNoLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsPhNoLabel.setText("Phone Number:");

        detailsFNTextField.setBackground(new java.awt.Color(255, 255, 255));
        detailsFNTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        detailsFNTextField.setForeground(new java.awt.Color(0, 102, 102));
        detailsFNTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        detailsLNTextField.setBackground(new java.awt.Color(255, 255, 255));
        detailsLNTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        detailsLNTextField.setForeground(new java.awt.Color(0, 102, 102));
        detailsLNTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        detailsEmailTextField.setBackground(new java.awt.Color(255, 255, 255));
        detailsEmailTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        detailsEmailTextField.setForeground(new java.awt.Color(0, 102, 102));
        detailsEmailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        detailsPhNoTextField.setBackground(new java.awt.Color(255, 255, 255));
        detailsPhNoTextField.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        detailsPhNoTextField.setForeground(new java.awt.Color(0, 102, 102));
        detailsPhNoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        detailsDelOrPicLabel.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N
        detailsDelOrPicLabel.setForeground(new java.awt.Color(0, 102, 102));
        detailsDelOrPicLabel.setText("Delivery or Pick Up:");
        
        detailsDelOrPicComboBox.setBackground(new java.awt.Color(0, 51, 51));
        detailsDelOrPicComboBox.setForeground(new java.awt.Color(255, 255, 255));
        detailsDelOrPicComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // ggetting selected option from sizes combobox
                String selected = detailsDelOrPicComboBox.getSelectedItem().toString();
                // placing selected size option into the textfield - will be added in receipt class
            }
        });

        detailsAddressTextArea.setBackground(new java.awt.Color(255, 255, 255));
        detailsAddressTextArea.setColumns(20);
        detailsAddressTextArea.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        detailsAddressTextArea.setForeground(new java.awt.Color(0, 102, 102));
        detailsAddressTextArea.setRows(5);
        detailsAddressTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        detailsAddressScrollPane.setViewportView(detailsAddressTextArea);

        detailsBackButton.setBackground(new java.awt.Color(0, 51, 51));
        detailsBackButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        detailsBackButton.setForeground(new java.awt.Color(255, 255, 255));
        detailsBackButton.setText("<");
        detailsBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Go back to the previous panel which is the ordering panel
                tabsPanel.setSelectedIndex(2);
            }
        });

        detailsContinueButton.setBackground(new java.awt.Color(0, 51, 51));
        detailsContinueButton.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        detailsContinueButton.setForeground(new java.awt.Color(255, 255, 255));
        detailsContinueButton.setText(">");
        detailsContinueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                // Go to the next JFrame which is the receipt, which displays the users final order
                ReceiptView r = new ReceiptView();
                r.show();
                //dispose(); // dispose this frame when user gets 
             
            }
        });
        
        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(detailsFNLabel)
                .addGap(49, 49, 49)
                .addComponent(detailsFNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(detailsLNLabel)
                .addGap(50, 50, 50)
                .addComponent(detailsLNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(detailsAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(detailsAddressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsDelOrPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsDelOrPicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(detailsEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(detailsEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(detailsPhNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(detailsPhNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(detailsBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(detailsContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsFNLabel)
                    .addComponent(detailsFNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsLNLabel)
                    .addComponent(detailsLNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(detailsAddressLabel))
                    .addComponent(detailsAddressScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(detailsDelOrPicLabel)
                        .addGap(10, 10, 10)
                        .addComponent(detailsDelOrPicComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(detailsPhNoLabel))
                    .addComponent(detailsPhNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tabsPanel.addTab("Customer Details", detailsPanel);

        javax.swing.GroupLayout panelForFrameLayout = new javax.swing.GroupLayout(panelForFrame);
        panelForFrame.setLayout(panelForFrameLayout);
        panelForFrameLayout.setHorizontalGroup(
            panelForFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(tabsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelForFrameLayout.setVerticalGroup(
            panelForFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(panelForFrameLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(tabsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelForFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tabsPanel.addTab("Customer Details", detailsPanel);

        pack();
    }

    // Method to load combo boxes which hold the values from the CakeSizes, CakeShapes and CakeFlavours classes
    private void loadBoxes() {
        orderingSizesComboBox.setModel(new DefaultComboBoxModel<>(CakeSizes.values()));
        orderingShapesComboBox.setModel(new DefaultComboBoxModel<>(CakeShapes.values()));
        orderingFlavoursComboBox.setModel(new DefaultComboBoxModel<>(CakeFlavours.values()));
        detailsDelOrPicComboBox.setModel(new DefaultComboBoxModel<>(DeliveryOrPickup.values()));
    }

}
