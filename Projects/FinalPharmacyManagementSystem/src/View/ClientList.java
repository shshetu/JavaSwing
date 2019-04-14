/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import daoImp.BuyDrugDaoImp;
import daoImp.CompanyDaoImp;
import daoImp.DrugDaoImp;
import daoImp.SummaryDaoImp;
import java.util.List;
import javax.swing.JOptionPane;
import pojo.BuyDrug;
import pojo.Company;
import pojo.Drug;
import pojo.Summary;

/**
 *
 * @author shshe
 */
public class ClientList extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public ClientList() {
        initComponents();
        jButtonUpdate.setEnabled(false);
        new BuyDrugDaoImp().createTable();
        displayDataAtComboBox();
    }

    public void displayDataAtComboBox() {
        List<Company> list = new CompanyDaoImp().getCompany();
        jComboBoxCompanyName.addItem("Select A Company:");
        for (Company c : list) {
            jComboBoxCompanyName.addItem(c.getCompany_name());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDragBarcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBuyingPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jComboBoxCompanyName = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientList = new javax.swing.JTable();
        jComboBoxAge = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaHomeAddress = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaCurrentAddress = new javax.swing.JTextArea();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Client List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Client Name:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        jTextFieldDragBarcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jTextFieldDragBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 233, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Client Age:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 133, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Type:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 411, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, -1, -1));

        jTextFieldBuyingPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jTextFieldBuyingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 230, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Current Address:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, -1, -1));

        jButtonInsert.setBackground(new java.awt.Color(0, 102, 102));
        jButtonInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonInsert.setText("Insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 120, -1));

        jButtonUpdate.setBackground(new java.awt.Color(0, 102, 102));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdate.setText("Update");
        jPanel2.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 120, -1));

        jButtonDelete.setBackground(new java.awt.Color(0, 102, 102));
        jButtonDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 430, 120, -1));

        jComboBoxCompanyName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(jComboBoxCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 411, 230, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Home Address:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 347, -1, -1));

        jTableClientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client ID", "Client Name", "Gender", "Phone", "Current Address", "Home Address", "Type"
            }
        ));
        jScrollPane1.setViewportView(jTableClientList);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 556, 380));

        jComboBoxAge.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Your Age:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        jPanel2.add(jComboBoxAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, -1));

        jRadioButton1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("Female");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("Male");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jTextAreaHomeAddress.setColumns(20);
        jTextAreaHomeAddress.setRows(5);
        jScrollPane2.setViewportView(jTextAreaHomeAddress);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 324, 233, 69));

        jTextAreaCurrentAddress.setColumns(20);
        jTextAreaCurrentAddress.setRows(5);
        jScrollPane3.setViewportView(jTextAreaCurrentAddress);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 221, 233, 69));

        jButtonCancel.setBackground(new java.awt.Color(0, 102, 102));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int total_qty = 0;
    int available_qty = 0;
    int sold_qty = 0;
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdministrationDashBoard().setVisible(true);
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        //validation
//        try {
//            if (jTextFieldDragBarcode.getText().trim().length() < 3) {
//                JOptionPane.showMessageDialog(null, "Drug barcode should be atleast 3 characters!");
//
//            } else if (jTextFieldDragBarcode.getText().trim().length() < 3) {
//                JOptionPane.showMessageDialog(null, "Drug barcode should be atleast 3 characters!");
//
//            } else if (jTextFieldDrugName.getText().trim().length() < 3) {
//                JOptionPane.showMessageDialog(null, "Drug name should be atleast 3 characters!");
//
//            } else if (jTextFieldDrugType.getText().trim().length() < 3) {
//                JOptionPane.showMessageDialog(null, "Drug type should be atleast 3 characters!");
//
//            } else if ((jComboBoxCompanyName.getItemAt(jComboBoxCompanyName.getSelectedIndex())).equals("Select A Company:")) {
//                JOptionPane.showMessageDialog(null, "Please select a company name!");
//
//            } else if ((jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex())).equals("Quantity:")) {
//                JOptionPane.showMessageDialog(null, "Please select a drug quantity!");
//
//            } else if (jTextFieldBuyingPrice.getText().trim().length() < 1) {
//                JOptionPane.showMessageDialog(null, "Enter the buying price!");
//
//            } else if ((jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex())).equals("Quantity:") || jTextFieldBuyingPrice.getText().trim().length() < 1) {
//                JOptionPane.showMessageDialog(null, "Please select quantity and buying price correctly!");
//
//            } else {
//                String bar_code = jTextFieldDragBarcode.getText().trim();
//                String drug_name = jTextFieldDrugName.getText().trim();
//                String drug_type = jTextFieldDrugType.getText().trim();
//                String com_name = jComboBoxCompanyName.getItemAt(jComboBoxCompanyName.getSelectedIndex());
//                Company com = new CompanyDaoImp().getCompanyByName(com_name);
//                int quantity = Integer.parseInt(jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex()));
//                double buying_price = Double.parseDouble(jTextFieldBuyingPrice.getText().trim());
//                double amount = Integer.parseInt(jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex())) * Double.parseDouble(jTextFieldBuyingPrice.getText().trim());
//
//                try {
//                    BuyDrug buy_drug = new BuyDrug(bar_code, drug_name, drug_type, com, quantity, buying_price, amount);
//                    BuyDrug existDrug = new BuyDrugDaoImp().getBuyDrugByDrugName(drug_name);
//                    if (existDrug.getDrug_name() != null) {
//                        ////update method will be called
//                        JOptionPane.showMessageDialog(null, "Call the update method");
//                        int qty = Integer.parseInt(jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex()));
//                        Summary sumO = new SummaryDaoImp().getSummaryByDrugName(drug_name);
//                        total_qty = sumO.getTotal_qty()+qty;
//                        available_qty = sumO.getAvailable_qty()+qty;
//                        sold_qty = sumO.getSold_qty();
//                        Summary sum = new Summary(drug_name, total_qty, available_qty, sold_qty);
//                        new SummaryDaoImp().updateSum(sum);
//                        JOptionPane.showMessageDialog(null, "Data updated into summary table!");
//
//                    } else {
//                        new BuyDrugDaoImp().insert(buy_drug);
//                        JOptionPane.showMessageDialog(null, "Data inserted successfully into the database!");
//
//                    }
//                } catch (Exception e) {
//                    BuyDrug buy_drug = new BuyDrug(bar_code, drug_name, drug_type, com, quantity, buying_price, amount);
//                    new BuyDrugDaoImp().insert(buy_drug);
//                    JOptionPane.showMessageDialog(null, "Data inserted successfully into the database!");
//
//                }
//                //(String bar_code, String drug_name, String drug_type, Company company, int quantity, double buy_price, double amount)
//            }
//        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(null, "Enter numbers correctly into the fields!");
//        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdministrationDashBoard().setVisible(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(ClientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new ClientList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxAge;
    private javax.swing.JComboBox<String> jComboBoxCompanyName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableClientList;
    private javax.swing.JTextArea jTextAreaCurrentAddress;
    private javax.swing.JTextArea jTextAreaHomeAddress;
    private javax.swing.JTextField jTextFieldBuyingPrice;
    private javax.swing.JTextField jTextFieldDragBarcode;
    // End of variables declaration//GEN-END:variables
}
