/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import daoImp.CompanyDaoImp;
import daoImp.SummaryDaoImp;
import daoImp.UserDaoImp;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Company;
import pojo.Summary;
import pojo.User;

/**
 *
 * @author shshe
 */
public class MoveDrugView extends javax.swing.JFrame {

    /**
     * Creates new form SearchDrugView
     */
    public MoveDrugView() {
        initComponents();
    }
    String name;

    public void dipslayDateIntoTableForBarcode() {
        String barcode = jTextFieldDrugBarcode.getText().trim();

        DefaultTableModel model = (DefaultTableModel) jTableMoveDrug.getModel();
        model.setRowCount(0);
        List<Summary> list = new SummaryDaoImp().getSummarySearchingBarcode(barcode);
        Object[] cols = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_name();
            cols[1] = list.get(i).getDrug_type();
            cols[2] = list.get(i).getDrug_barcode();
            cols[3] = list.get(i).getDrug_place();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getCompany().getCompany_id());
            cols[4] = com.getCompany_name();
            model.addRow(cols);
        }
    }

    public void dipslayDateIntoTableForDrugName() {
        name = jTextFieldDrugName.getText().trim();

        DefaultTableModel model = (DefaultTableModel) jTableMoveDrug.getModel();
        model.setRowCount(0);
        List<Summary> list = new SummaryDaoImp().getSummarySearchingName(name);
        Object[] cols = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_name();
            cols[1] = list.get(i).getDrug_type();
            cols[2] = list.get(i).getDrug_barcode();
            cols[3] = list.get(i).getDrug_place();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getCompany().getCompany_id());
            cols[4] = com.getCompany_name();
            model.addRow(cols);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMoveDrug = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDrugBarcode = new javax.swing.JTextField();
        jComboBoxSection = new javax.swing.JComboBox<>();
        jTextFieldOldPlace = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxPlace = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDrugName = new javax.swing.JTextField();
        jButtonBack = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Move Drug");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 11, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jTableMoveDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Barcode", "Place", "Company"
            }
        ));
        jTableMoveDrug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMoveDrugMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMoveDrug);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Drug Barcode:");

        jTextFieldDrugBarcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDrugBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDrugBarcodeKeyReleased(evt);
            }
        });

        jComboBoxSection.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxSection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxSection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section:", "A", "B", "C", "D" }));

        jTextFieldOldPlace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldOldPlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOldPlaceActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Old Place");

        jComboBoxPlace.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxPlace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxPlace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Place:", "Left", "Right", "Down", "Up" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("New Place:");

        jButtonUpdate.setBackground(new java.awt.Color(0, 102, 102));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Drug Name:");

        jTextFieldDrugName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDrugName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldDrugNameKeyReleased(evt);
            }
        });

        jButtonBack.setBackground(new java.awt.Color(0, 102, 102));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(0, 102, 102));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(48, 48, 48)
                                        .addComponent(jTextFieldOldPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(40, 40, 40))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jButtonBack)
                                        .addGap(223, 223, 223)
                                        .addComponent(jButtonClear)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonUpdate)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBoxSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jTextFieldDrugBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldDrugBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jComboBoxSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldOldPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonClear))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldOldPlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOldPlaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOldPlaceActionPerformed

    private void jTextFieldDrugBarcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDrugBarcodeKeyReleased
        // TODO add your handling code here:
        dipslayDateIntoTableForBarcode();

    }//GEN-LAST:event_jTextFieldDrugBarcodeKeyReleased

    private void jTextFieldDrugNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDrugNameKeyReleased
        // TODO add your handling code here:
        dipslayDateIntoTableForDrugName();

    }//GEN-LAST:event_jTextFieldDrugNameKeyReleased

    private void jTableMoveDrugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMoveDrugMouseClicked
        // TODO add your handling code here:
        int i = jTableMoveDrug.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableMoveDrug.getModel();
        String place = model.getValueAt(i, 3).toString();
        String barcode = model.getValueAt(i, 2).toString();
        jTextFieldOldPlace.setText(place);
        jTextFieldDrugBarcode.setText(barcode);

    }//GEN-LAST:event_jTableMoveDrugMouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        name = jTextFieldDrugName.getText();
        String new_place = jComboBoxSection.getItemAt(jComboBoxSection.getSelectedIndex()) + "-" + jComboBoxPlace.getItemAt(jComboBoxPlace.getSelectedIndex());
        Summary sumExist = new SummaryDaoImp().getSummaryByDrugName(name);
        Summary sum = new Summary(name, new_place);
        if (sumExist.getDrug_name() != null) {
            new SummaryDaoImp().updatePlace(sum);
            JOptionPane.showMessageDialog(null, "Drug place is updated successfully!");
            jTextFieldDrugBarcode.setText("");
            jTextFieldDrugName.setText("");
            jTextFieldOldPlace.setText("");
            jComboBoxSection.setSelectedIndex(0);
            jComboBoxPlace.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        User user = new UserDaoImp().getUserByUserName(LoginView.user_name);
        if (user.getRoleName().equalsIgnoreCase("admin")) {
            this.setVisible(false);
            new AdministrationDashBoard().setVisible(true);
        } else if (user.getRoleName().equalsIgnoreCase("employee")) {
            this.setVisible(false);
            new EmployeeDashBoard().setVisible(true);
        }
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jTextFieldDrugBarcode.setText("");
        jTextFieldDrugName.setText("");
        jTextFieldOldPlace.setText("");
        jComboBoxSection.setSelectedIndex(0);
        jComboBoxPlace.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(MoveDrugView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoveDrugView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoveDrugView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoveDrugView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoveDrugView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxPlace;
    private javax.swing.JComboBox<String> jComboBoxSection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMoveDrug;
    private javax.swing.JTextField jTextFieldDrugBarcode;
    private javax.swing.JTextField jTextFieldDrugName;
    private javax.swing.JTextField jTextFieldOldPlace;
    // End of variables declaration//GEN-END:variables
}
