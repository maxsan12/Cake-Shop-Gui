/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cake.shop.gui;

/**
 *
 * @author maxin
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        homePageBttn = new javax.swing.JButton();
        cakeSizeBttn = new javax.swing.JButton();
        cakeShapeBttn = new javax.swing.JButton();
        cakeFlavourBttn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        homePagePnl = new javax.swing.JPanel();
        cakeSizePnl = new javax.swing.JPanel();
        cakeShapePnl = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        cakeFlavourPnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        jLabel1.setText("CC CAKES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 85));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        homePageBttn.setText("Home Page");
        homePageBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageBttnActionPerformed(evt);
            }
        });

        cakeSizeBttn.setText("Cake Sizes");
        cakeSizeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cakeSizeBttnActionPerformed(evt);
            }
        });

        cakeShapeBttn.setText("Cake Shapes");
        cakeShapeBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cakeShapeBttnActionPerformed(evt);
            }
        });

        cakeFlavourBttn.setText("Cake Flavours");
        cakeFlavourBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cakeFlavourBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(homePageBttn)
                .addGap(54, 54, 54)
                .addComponent(cakeSizeBttn)
                .addGap(63, 63, 63)
                .addComponent(cakeShapeBttn)
                .addGap(62, 62, 62)
                .addComponent(cakeFlavourBttn)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homePageBttn)
                    .addComponent(cakeSizeBttn)
                    .addComponent(cakeShapeBttn)
                    .addComponent(cakeFlavourBttn))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 820, 60));

        homePagePnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Home Page", homePagePnl);

        javax.swing.GroupLayout cakeSizePnlLayout = new javax.swing.GroupLayout(cakeSizePnl);
        cakeSizePnl.setLayout(cakeSizePnlLayout);
        cakeSizePnlLayout.setHorizontalGroup(
            cakeSizePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        cakeSizePnlLayout.setVerticalGroup(
            cakeSizePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cake Sizes", cakeSizePnl);

        jCheckBox2.setText("jCheckBox2");

        javax.swing.GroupLayout cakeShapePnlLayout = new javax.swing.GroupLayout(cakeShapePnl);
        cakeShapePnl.setLayout(cakeShapePnlLayout);
        cakeShapePnlLayout.setHorizontalGroup(
            cakeShapePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cakeShapePnlLayout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );
        cakeShapePnlLayout.setVerticalGroup(
            cakeShapePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cakeShapePnlLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jCheckBox2)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cake Shapes", cakeShapePnl);

        javax.swing.GroupLayout cakeFlavourPnlLayout = new javax.swing.GroupLayout(cakeFlavourPnl);
        cakeFlavourPnl.setLayout(cakeFlavourPnlLayout);
        cakeFlavourPnlLayout.setHorizontalGroup(
            cakeFlavourPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        cakeFlavourPnlLayout.setVerticalGroup(
            cakeFlavourPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cake Flavours", cakeFlavourPnl);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 670, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -2, 680, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cakeSizeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cakeSizeBttnActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1); // will access the cake size tab/panel
        
    }//GEN-LAST:event_cakeSizeBttnActionPerformed

    private void homePageBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageBttnActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0); // will access the home page tab/panel.
    }//GEN-LAST:event_homePageBttnActionPerformed

    private void cakeShapeBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cakeShapeBttnActionPerformed
        // TODO add your handling code here: 
        jTabbedPane1.setSelectedIndex(2); // will access the cake shape tab/panel.
    }//GEN-LAST:event_cakeShapeBttnActionPerformed

    private void cakeFlavourBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cakeFlavourBttnActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3); // will access the cake flavour tab/panel
    }//GEN-LAST:event_cakeFlavourBttnActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cakeFlavourBttn;
    private javax.swing.JPanel cakeFlavourPnl;
    private javax.swing.JButton cakeShapeBttn;
    private javax.swing.JPanel cakeShapePnl;
    private javax.swing.JButton cakeSizeBttn;
    private javax.swing.JPanel cakeSizePnl;
    private javax.swing.JButton homePageBttn;
    private javax.swing.JPanel homePagePnl;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
