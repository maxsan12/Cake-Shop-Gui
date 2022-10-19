/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CakeShopMVC;

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
    
    // Creating a class in order to allow image from resources to be added into home panel later
    public class imagePanel extends
    
    
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

        
        homeIconLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\maxin\\Desktop\\home page.jpg")); // NOI18N
        homePanel.add(homeIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 29, -1, -1));

        homeContinueBttn.setBackground(new java.awt.Color(0, 51, 51));
        homeContinueBttn.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        homeContinueBttn.setForeground(new java.awt.Color(255, 255, 255));
        homeContinueBttn.setText("CONTINUE");
        homePanel.add(homeContinueBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 411, -1, 38));
        
        
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
        loginPanel = new javax.swing.JPanel();
        loginUserTextField = new javax.swing.JTextField();
        loginTextLabel = new javax.swing.JLabel();
        loginUsernameLabel = new javax.swing.JLabel();
        loginPasswordLabel = new javax.swing.JLabel();
        loginUserPasswordField = new javax.swing.JPasswordField();
        loginContinueButton = new javax.swing.JButton();
        loginBackButton = new javax.swing.JButton();
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

    }
    
    @Override
    public void update(Observable o, Object o1) {
        
    }
    
    
}
