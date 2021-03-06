/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.View;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pharmacymanagement.Dao.InsertCompayDao;
import pharmacymanagement.DaoImp.InsertCompanyDaoImp;
import pharmacymanagement.Pojo.InsertCompany;

/**
 *
 * @author shshe
 */
public class CompanyPage_UpdateCompany extends javax.swing.JFrame {

    /**
     * Creates new form ProductAdd
     */
    public CompanyPage_UpdateCompany() {
        initComponents();
        displayDataIntoComboBox();
        displayDataintoTable();
    }

    public void displayDataIntoComboBox() {
        InsertCompayDao ic = new InsertCompanyDaoImp();
        List<InsertCompany> list = ic.getInsertCompany();
        jComboBoxCompanyName.addItem("Select A Company");
        for (InsertCompany i : list) {
            jComboBoxCompanyName.addItem(i.getCompanyName());

        }
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTableCompanyUpdateDisplay.getModel();
        model.setRowCount(0);
    }

    public void displayDataintoTable() {
        InsertCompayDao ic = new InsertCompanyDaoImp();
        DefaultTableModel model = (DefaultTableModel) jTableCompanyUpdateDisplay.getModel();
        List<InsertCompany> list = ic.getInsertCompany();
        Object[] cols = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getId();
            cols[1] = list.get(i).getCompanyName();
            cols[2] = list.get(i).getCompanyCountry();
            cols[3] = list.get(i).getCompanyEmail();
            cols[4] = list.get(i).getCompanyContactNo();
            cols[5] = list.get(i).getCompanyAddress();
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

        jLabelAfterLoginIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jComboBoxCompanyName = new javax.swing.JComboBox<>();
        jTextFieldUpdateContact = new javax.swing.JTextField();
        jButtonUpdateContact = new javax.swing.JButton();
        jTextFieldUpdateEmailID = new javax.swing.JTextField();
        jButtonUpdateEmail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCompanyUpdateDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAfterLoginIcon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAfterLoginIcon.setText("Login Icon");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("COMPANY NAME");

        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBack.setText("Back");

        jComboBoxCompanyName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxCompanyName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxCompanyNameItemStateChanged(evt);
            }
        });

        jTextFieldUpdateContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUpdateContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUpdateContactActionPerformed(evt);
            }
        });

        jButtonUpdateContact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdateContact.setText("Update Contact");
        jButtonUpdateContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateContactActionPerformed(evt);
            }
        });

        jTextFieldUpdateEmailID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUpdateEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUpdateEmailIDActionPerformed(evt);
            }
        });

        jButtonUpdateEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdateEmail.setText("Update Email ID");
        jButtonUpdateEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateEmailActionPerformed(evt);
            }
        });

        jTableCompanyUpdateDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company ID", "Company  Name", "Company Country", "Company Email", "Company Contact Number", "Company Address"
            }
        ));
        jTableCompanyUpdateDisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCompanyUpdateDisplayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableCompanyUpdateDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelAfterLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldUpdateContact)
                            .addComponent(jComboBoxCompanyName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldUpdateEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonUpdateContact, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelAfterLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUpdateContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdateContact))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldUpdateEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUpdateEmail))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUpdateContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUpdateContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUpdateContactActionPerformed

    private void jTextFieldUpdateEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUpdateEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUpdateEmailIDActionPerformed
    int selectedId;
    private void jTableCompanyUpdateDisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCompanyUpdateDisplayMouseClicked
        int i = jTableCompanyUpdateDisplay.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableCompanyUpdateDisplay.getModel();
        jTextFieldUpdateEmailID.setText(model.getValueAt(i, 3).toString());
        jTextFieldUpdateContact.setText(model.getValueAt(i, 4).toString());
        selectedId = Integer.parseInt(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_jTableCompanyUpdateDisplayMouseClicked

    private void jComboBoxCompanyNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxCompanyNameItemStateChanged
       
    }//GEN-LAST:event_jComboBoxCompanyNameItemStateChanged

    private void jButtonUpdateContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateContactActionPerformed
        // TODO add your handling code here:
        String contactNo = jTextFieldUpdateContact.getText().trim();
        InsertCompany ic = new InsertCompanyDaoImp().getInsertCompanyById(selectedId);
        if(ic.getCompanyName() != null){
//        new InsertCompanyDaoImp().;
        displayDataintoTable();
            JOptionPane.showMessageDialog(null, "Contact Number is updated!");
        }
    }//GEN-LAST:event_jButtonUpdateContactActionPerformed

    private void jButtonUpdateEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateEmailActionPerformed

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
            java.util.logging.Logger.getLogger(CompanyPage_UpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompanyPage_UpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompanyPage_UpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompanyPage_UpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyPage_UpdateCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonUpdateContact;
    private javax.swing.JButton jButtonUpdateEmail;
    private javax.swing.JComboBox<String> jComboBoxCompanyName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAfterLoginIcon;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCompanyUpdateDisplay;
    private javax.swing.JTextField jTextFieldUpdateContact;
    private javax.swing.JTextField jTextFieldUpdateEmailID;
    // End of variables declaration//GEN-END:variables
}
