/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.View;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import pharmacymanagement.Dao.SalesDao;
import pharmacymanagement.DaoImp.InsertCompanyDaoImp;
import pharmacymanagement.DaoImp.ProductCategoryDaoImp;
import pharmacymanagement.DaoImp.SalesDaoImp;
import pharmacymanagement.Pojo.InsertCompany;
import pharmacymanagement.Pojo.ProductCategory;
import pharmacymanagement.Pojo.Sales;

/**
 *
 * @author shshe
 */
public class NewSales extends javax.swing.JFrame {

    /**
     * Creates new form AfterLoginPage
     */
    public NewSales() {
        initComponents();
        new SalesDaoImp().createTable();
        displayDataintoTable();
        displayDataIntoComboBox();
    }

    public void displayDataIntoComboBox() {
        List<Sales> list = new SalesDaoImp().getSales();
        jComboBoxProductName.addItem("Select A Product");
        for (Sales i : list) {
            jComboBoxProductName.addItem(i.getProductName());
        }
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTableNewSales.getModel();
        model.setRowCount(0);
    }

    public void displayDataintoTable() {
        clearTable();
        SalesDao ic = new SalesDaoImp();
        DefaultTableModel model = (DefaultTableModel) jTableNewSales.getModel();
        List<Sales> list = ic.getSales();
        Object[] cols = new Object[11];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getProductId();
            cols[1] = list.get(i).getProductName();
            cols[2] = list.get(i).getProductCode();
            cols[3] = list.get(i).getMedicineGroup();
            InsertCompany ik = new InsertCompanyDaoImp().getInsertCompanyById(list.get(i).getProductId());
            cols[4] = ik.getCompanyName();
            ProductCategory pc = new ProductCategoryDaoImp().getProductCategorybyId(list.get(i).getProductId());
            cols[5] = pc.getProductCategoryName();

            cols[6] = list.get(i).getProductQuantity();
            cols[7] = list.get(i).getProductPrice();
            cols[8] = list.get(i).getExpireDate();
            cols[9] = list.get(i).getDoseType();
            cols[10] = list.get(i).getRemarks();
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
        jButtonAddToCart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxProductName = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEnterQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDisplayBillAndValues = new javax.swing.JTable();
        jButtonBack1 = new javax.swing.JButton();
        jButtonPrint1 = new javax.swing.JButton();
        jButtonDone = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableNewSales = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAfterLoginIcon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAfterLoginIcon.setText("Login Icon");

        jButtonAddToCart.setText("Add To Cart");
        jButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Product Name");

        jComboBoxProductName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Enter Quantity");

        jTableDisplayBillAndValues.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Quantity", "Price per unit", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTableDisplayBillAndValues);

        jButtonBack1.setText("Back");
        jButtonBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBack1ActionPerformed(evt);
            }
        });

        jButtonPrint1.setText("Print");

        jButtonDone.setText("Done");
        jButtonDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoneActionPerformed(evt);
            }
        });

        jTableNewSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Code", "Medicine Group", "Company Name", "Product Category", "Quantity", "Price Per Unit", "Expire Date", "DoseType", "Remarks"
            }
        ));
        jScrollPane3.setViewportView(jTableNewSales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelAfterLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(288, 288, 288)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxProductName, 0, 243, Short.MAX_VALUE)
                    .addComponent(jTextFieldEnterQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddToCart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(jButtonBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1164, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(1116, Short.MAX_VALUE)
                    .addComponent(jButtonPrint1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(87, 87, 87)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAfterLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldEnterQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButtonAddToCart)
                        .addGap(54, 54, 54)
                        .addComponent(jButtonDone)))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(514, Short.MAX_VALUE)
                    .addComponent(jButtonBack1)
                    .addGap(62, 62, 62)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(489, Short.MAX_VALUE)
                    .addComponent(jButtonPrint1)
                    .addGap(87, 87, 87)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void diplayDataIntoBillTable() {
        String productName = jComboBoxProductName.getItemAt(jComboBoxProductName.getSelectedIndex());
        int quantity = Integer.parseInt(jTextFieldEnterQuantity.getText());
        DefaultTableModel model = (DefaultTableModel) jTableDisplayBillAndValues.getModel();
        Sales ic = new SalesDaoImp().getSalesByProductName(productName);
        double productPrice = ic.getProductPrice();
        Object[] cols = new Object[4];
        //list 
        List<Sales> list = new SalesDaoImp().getSales();
        for (int i = 0; i < 1; i++) {
            cols[0] = productName;
            cols[1] = quantity;
            cols[2] = productPrice;
            cols[3] = quantity * productPrice;
            model.addRow(cols);
        }

    }

    private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartActionPerformed
        // TODO add your handling code here:
        diplayDataIntoBillTable();

    }//GEN-LAST:event_jButtonAddToCartActionPerformed

    private void jButtonBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBack1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_jButtonBack1ActionPerformed

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonDoneActionPerformed

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
            java.util.logging.Logger.getLogger(NewSales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSales.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new NewSales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddToCart;
    private javax.swing.JButton jButtonBack1;
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonPrint1;
    private javax.swing.JComboBox<String> jComboBoxProductName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAfterLoginIcon;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableDisplayBillAndValues;
    private javax.swing.JTable jTableNewSales;
    private javax.swing.JTextField jTextFieldEnterQuantity;
    // End of variables declaration//GEN-END:variables
}
