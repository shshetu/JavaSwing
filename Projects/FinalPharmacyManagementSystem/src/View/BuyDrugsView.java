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
import daoImp.UserDaoImp;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import pojo.BuyDrug;
import pojo.Company;
import pojo.Drug;
import pojo.Summary;
import pojo.User;

/**
 *
 * @author shshe
 */
public class BuyDrugsView extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public BuyDrugsView() {
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
    //display data into drug type

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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDragBarcode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDrugName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBuyingPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField();
        jButtonMakeDeal = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jComboBoxCompanyName = new javax.swing.JComboBox<>();
        jTextFieldDrugType = new javax.swing.JTextField();
        jComboBoxQuantity = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDrugGroup = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Buy Drug Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 11, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Drag Barcode:");

        jTextFieldDragBarcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDragBarcode.setText("abc");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Drug Name:");

        jTextFieldDrugName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDrugName.setText("Napa");
        jTextFieldDrugName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDrugNameKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Drug Type:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Company Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Buying Price:");

        jTextFieldBuyingPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldBuyingPrice.setText("10");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Amount:");

        jTextFieldAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldAmountMouseClicked(evt);
            }
        });

        jButtonMakeDeal.setBackground(new java.awt.Color(0, 102, 102));
        jButtonMakeDeal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMakeDeal.setText("Make Deal");
        jButtonMakeDeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMakeDealActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(0, 102, 102));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdate.setText("Update");

        jButtonCancel.setBackground(new java.awt.Color(0, 102, 102));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jComboBoxCompanyName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldDrugType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDrugType.setText("Tablet");

        jComboBoxQuantity.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxQuantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Drug Group:");

        jTextFieldDrugGroup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDrugGroup.setText("Paracetamol");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldDrugName)
                                    .addComponent(jTextFieldDragBarcode)
                                    .addComponent(jTextFieldDrugType)
                                    .addComponent(jTextFieldDrugGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxCompanyName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldBuyingPrice)
                            .addComponent(jTextFieldAmount)
                            .addComponent(jComboBoxQuantity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonMakeDeal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(310, 310, 310))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldDragBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldDrugType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldDrugGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addComponent(jComboBoxQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldBuyingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMakeDeal)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonCancel))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int total_qty = 0;
    int available_qty = 0;
    int sold_qty = 0;
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        User user = new UserDaoImp().getUserByUserName(LoginView.user_name);
        if (user.getRoleName().equalsIgnoreCase("admin")) {
            this.setVisible(false);
            new AdministrationDashBoard().setVisible(true);
        } else if (user.getRoleName().equalsIgnoreCase("employee")) {
            this.setVisible(false);
            new EmployeeDashBoard().setVisible(true);
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonMakeDealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMakeDealActionPerformed
        // TODO add your handling code here:
        //validation
        try {
            if (jTextFieldDragBarcode.getText().trim().length() < 3) {
                JOptionPane.showMessageDialog(null, "Drug barcode should be atleast 3 characters!");

            } else if (jTextFieldDragBarcode.getText().trim().length() < 3) {
                JOptionPane.showMessageDialog(null, "Drug barcode should be atleast 3 characters!");

            } else if (jTextFieldDrugName.getText().trim().length() < 3) {
                JOptionPane.showMessageDialog(null, "Drug name should be atleast 3 characters!");

            } else if (jTextFieldDrugType.getText().trim().length() < 3) {
                JOptionPane.showMessageDialog(null, "Drug type should be atleast 3 characters!");

            } else if (jTextFieldDrugGroup.getText().trim().length() < 3) {
                JOptionPane.showMessageDialog(null, "Drug group should be atleast 3 characters!");

            } else if ((jComboBoxCompanyName.getItemAt(jComboBoxCompanyName.getSelectedIndex())).equals("Select A Company:")) {
                JOptionPane.showMessageDialog(null, "Please select a company name!");

            } else if ((jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex())).equals("Quantity:")) {
                JOptionPane.showMessageDialog(null, "Please select a drug quantity!");

            } else if (jTextFieldBuyingPrice.getText().trim().length() < 1) {
                JOptionPane.showMessageDialog(null, "Enter the buying price!");

            } else if ((jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex())).equals("Quantity:") || jTextFieldBuyingPrice.getText().trim().length() < 1) {
                JOptionPane.showMessageDialog(null, "Please select quantity and buying price correctly!");

            } else {
                String bar_code = jTextFieldDragBarcode.getText().trim();
                String drug_name = jTextFieldDrugName.getText().trim();
                String drug_type = jTextFieldDrugType.getText().trim();
                String drug_group = jTextFieldDrugGroup.getText().trim();
                String com_name = jComboBoxCompanyName.getItemAt(jComboBoxCompanyName.getSelectedIndex());
                Company com = new CompanyDaoImp().getCompanyByName(com_name);
                int quantity = Integer.parseInt(jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex()));
                double buying_price = Double.parseDouble(jTextFieldBuyingPrice.getText().trim());
                double amount = Integer.parseInt(jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex())) * Double.parseDouble(jTextFieldBuyingPrice.getText().trim());
                //buy date, buy time
                Date buy_date = new Date(System.currentTimeMillis());
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                String time = formatter.format(buy_date);
                try {
                    BuyDrug buy_drug = new BuyDrug(bar_code, drug_name, drug_type, drug_group, com, quantity, buying_price, amount, buy_date, time);
                    Drug existDrug = new DrugDaoImp().getDrugByDrugName(drug_name);
                    if (existDrug.getDrug_name() != null) {
                        ////update method will be called
                        JOptionPane.showMessageDialog(null, "Call the update method");
                        int qty = Integer.parseInt(jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex()));
                        Summary sumO = new SummaryDaoImp().getSummaryByDrugName(drug_name);
                        total_qty = sumO.getTotal_qty() + qty;
                        available_qty = sumO.getAvailable_qty() + qty;
                        Summary sum = new Summary(drug_name, total_qty, available_qty);
                        new SummaryDaoImp().updateSum(sum);
                        JOptionPane.showMessageDialog(null, "Data updated into summary table!");

                    } else {
                        new BuyDrugDaoImp().insert(buy_drug);
                        JOptionPane.showMessageDialog(null, "Data inserted successfully into the database!");
                        this.setVisible(false);
                        new AddDrugView().setVisible(true);

                    }
                } catch (Exception e) {
                    BuyDrug buy_drug = new BuyDrug(bar_code, drug_name, drug_type, drug_group, com, quantity, buying_price, amount, buy_date, time);
                    new BuyDrugDaoImp().insert(buy_drug);
                    JOptionPane.showMessageDialog(null, "Data inserted successfully into the database!");
                    this.setVisible(false);
                    new AddDrugView().setVisible(true);
                }
                //(String bar_code, String drug_name, String drug_type, Company company, int quantity, double buy_price, double amount)
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Enter numbers correctly into the fields!");
        }
    }//GEN-LAST:event_jButtonMakeDealActionPerformed

    private void jTextFieldAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAmountMouseClicked
        // TODO add your handling code here:
        if ((jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex())).equals("Quantity:") || jTextFieldBuyingPrice.getText().trim().length() < 1) {
            JOptionPane.showMessageDialog(null, "Please select quantity and buying price correctly!");

        } else {

            double amount = Integer.parseInt(jComboBoxQuantity.getItemAt(jComboBoxQuantity.getSelectedIndex())) * Double.parseDouble(jTextFieldBuyingPrice.getText().trim());
            jTextFieldAmount.setText(String.valueOf(amount));
        }
    }//GEN-LAST:event_jTextFieldAmountMouseClicked

    private void jTextFieldDrugNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDrugNameKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldDrugNameKeyPressed

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
            java.util.logging.Logger.getLogger(BuyDrugsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyDrugsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyDrugsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyDrugsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyDrugsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonMakeDeal;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxCompanyName;
    private javax.swing.JComboBox<String> jComboBoxQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldBuyingPrice;
    private javax.swing.JTextField jTextFieldDragBarcode;
    private javax.swing.JTextField jTextFieldDrugGroup;
    private javax.swing.JTextField jTextFieldDrugName;
    private javax.swing.JTextField jTextFieldDrugType;
    // End of variables declaration//GEN-END:variables
}
