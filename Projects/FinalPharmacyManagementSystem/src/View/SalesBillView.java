/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import daoImp.CompanyDaoImp;
import daoImp.SummaryDaoImp;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Company;
import pojo.Summary;

/**
 *
 * @author shshe
 */
public class SalesBillView extends javax.swing.JFrame {

    /**
     * Creates new form SearchDrugView
     */
    public SalesBillView() {
        initComponents();
    }

    public void diplayDataIntoBillTable() {
        String name = jTextFieldDrugName.getText().trim();
        int quantity = Integer.parseInt(jTextFieldQuantity.getText());
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String time = formatter.format(date);
        /*Calendar c = Calendar.getInstance();
c.setTimeInMillis(System.currentTimeMillis());

String date = c.get(Calendar.YEAR)+"-"+c.get(Calendar.MONTH)+"-"+c.get(Calendar.DAY_OF_MONTH);
String time = c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);

System.out.println(date + " " + time);*/

        DefaultTableModel model = (DefaultTableModel) jTableSalesBill.getModel();
        Summary sum = new SummaryDaoImp().getSummaryByDrugName(name);
        Object[] cols = new Object[10];
        for (int i = 0; i < 1; i++) {
            cols[0] = sum.getDrug_barcode();
            cols[1] = sum.getDrug_name();
            cols[2] = sum.getDrug_type();
            cols[3] = sum.getDrug_dose();
            cols[4] = quantity;
            cols[5] = sum.getSell_price();
            cols[6] = sum.getSell_price() * quantity;
            Company com = new CompanyDaoImp().getCompanyById(sum.getDrug_id());
            cols[7] = com.getCompany_name();
            cols[8] = date;
            cols[9] = time;
            model.addRow(cols);
        }
//        //list 
//        List<Sales> list = new SalesDaoImp().getSales();
//        for (int i = 0; i < 1; i++) {
//            cols[0] = productName;
//            cols[1] = quantity;
//            cols[2] = productPrice;
//            cols[3] = quantity * productPrice;
//            model.addRow(cols);
//        }
//
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDrugName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldBarcode = new javax.swing.JTextField();
        jButtonAddToCart = new javax.swing.JButton();
        jButtonBill = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jButtonClear = new javax.swing.JButton();
        jButtonCancel1 = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSalesBill = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableFromSummary = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Sales Bill Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Drug Name:");

        jTextFieldDrugName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDrugName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDrugNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldDrugNameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Barcode: ");

        jTextFieldBarcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButtonAddToCart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAddToCart.setText("Add To Cart");
        jButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartActionPerformed(evt);
            }
        });

        jButtonBill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBill.setText("Bill");
        jButtonBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBillActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Total");

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelTotal.setText("00.0$");

        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonCancel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel1.setText("Cancel");
        jButtonCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancel1ActionPerformed(evt);
            }
        });

        jButtonPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPrint.setText("Print");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        jTextFieldQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTableSalesBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Type", "Dose", "Quantity", "Price", "Amount", "Company", "Date", "Time"
            }
        ));
        jScrollPane2.setViewportView(jTableSalesBill);

        jTableFromSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Id", "Name", "Type", "Barcode", "Dose", "Code", "Buy_Price", "Sell_Price", "Com_Name", "Pro_Date", "Ex_ Date", "Ex_Time", "Validity ", "Tax", "Place", "Total_Qty", "Available_Qty", "Sold_Qty"
            }
        ));
        jTableFromSummary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableFromSummaryKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTableFromSummary);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(jTextFieldDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButtonAddToCart)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotal)
                .addGap(49, 49, 49)
                .addComponent(jButtonPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBill)
                .addGap(42, 42, 42)
                .addComponent(jButtonClear)
                .addGap(158, 158, 158))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(674, Short.MAX_VALUE)
                    .addComponent(jButtonCancel1)
                    .addGap(28, 28, 28)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButtonAddToCart)
                        .addComponent(jTextFieldBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonBill)
                    .addComponent(jLabel4)
                    .addComponent(jLabelTotal)
                    .addComponent(jButtonPrint))
                .addGap(31, 31, 31))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(413, Short.MAX_VALUE)
                    .addComponent(jButtonCancel1)
                    .addGap(31, 31, 31)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(284, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(71, 71, 71)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdministrationDashBoard().setVisible(true);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancel1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdministrationDashBoard().setVisible(true);
    }//GEN-LAST:event_jButtonCancel1ActionPerformed

    private void jTextFieldDrugNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDrugNameKeyTyped
        // TODO add your handling code here:
        //        String name = jTextFieldDrugName.getText().trim();

    }//GEN-LAST:event_jTextFieldDrugNameKeyTyped

    private void jTableFromSummaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableFromSummaryKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableFromSummaryKeyPressed

    private void jTextFieldDrugNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDrugNameKeyPressed
        // TODO add your handling code here:
        String name = jTextFieldDrugName.getText().trim();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DefaultTableModel model = (DefaultTableModel) jTableFromSummary.getModel();
            model.setRowCount(0);
            Summary sum = new SummaryDaoImp().getSummaryByDrugName(name);

            Object[] cols = new Object[18];
            for (int i = 0; i < 1; i++) {
                cols[0] = sum.getDrug_id();
                cols[1] = sum.getDrug_name();
                cols[2] = sum.getDrug_type();
                cols[3] = sum.getDrug_barcode();
                cols[4] = sum.getDrug_dose();
                cols[5] = sum.getDrug_code();
                cols[6] = sum.getBuy_price();
                cols[7] = sum.getSell_price();
                Company com = new CompanyDaoImp().getCompanyById(sum.getDrug_id());
                cols[8] = com.getCompany_name();
                cols[9] = sum.getProduction_date();
                cols[10] = sum.getExpire_date();
                cols[11] = sum.getExpire_time();
                cols[12] = sum.getValidity();
                cols[13] = sum.getDrug_tax();
                cols[14] = sum.getDrug_place();
                cols[15] = sum.getTotal_qty();
                cols[16] = sum.getAvailable_qty();
                cols[17] = sum.getSold_qty();
                model.addRow(cols);
            }

        }
    }//GEN-LAST:event_jTextFieldDrugNameKeyPressed

    private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartActionPerformed
        // TODO add your handling code here:
        diplayDataIntoBillTable();
    }//GEN-LAST:event_jButtonAddToCartActionPerformed

    private void jButtonBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBillActionPerformed
        // TODO add your handling code here:
        //insert into sales table

        //insert into summary table
        String name = jTextFieldDrugName.getText().trim();
        int qty = Integer.parseInt(jTextFieldQuantity.getText().trim());
        Summary sum = new SummaryDaoImp().getSummaryByDrugName(name);
        int total_qty = sum.getTotal_qty();
        int available_qty = sum.getTotal_qty() - qty;
        int sold_qty = sum.getSold_qty() + qty;
        Summary sumF = new Summary(name, total_qty, available_qty, sold_qty);
        new SummaryDaoImp().updateSum(sumF);
        JOptionPane.showMessageDialog(null, "Sold_qty: " + sold_qty);
    }//GEN-LAST:event_jButtonBillActionPerformed

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
            java.util.logging.Logger.getLogger(SalesBillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesBillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesBillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesBillView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesBillView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddToCart;
    private javax.swing.JButton jButtonBill;
    private javax.swing.JButton jButtonCancel1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableFromSummary;
    private javax.swing.JTable jTableSalesBill;
    private javax.swing.JTextField jTextFieldBarcode;
    private javax.swing.JTextField jTextFieldDrugName;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
