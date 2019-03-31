/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.View;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import pharmacymanagement.Dao.InsertCompayDao;
import pharmacymanagement.Dao.InsertMedicineDao;
import pharmacymanagement.DaoImp.InsertCompanyDaoImp;
import pharmacymanagement.DaoImp.InsertMedicineDaoImp;
import pharmacymanagement.Pojo.InsertCompany;
import pharmacymanagement.Pojo.InsertMedicine;

/**
 *
 * @author shshe
 */
public class MedicinesPage extends javax.swing.JFrame {

    /**
     * Creates new form AfterLoginPage
     */
    public MedicinesPage() {
        initComponents();
        displayDataintoTable();
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTableMedicineDisplay.getModel();
        model.setRowCount(0);
    }

    public void displayDataintoTable() {
        clearTable();
        InsertMedicineDao ic = new InsertMedicineDaoImp();
        DefaultTableModel model = (DefaultTableModel) jTableMedicineDisplay.getModel();
        List<InsertMedicine> list = ic.getInsertMedicine();
        Object[] cols = new Object[11];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getProductId();
            cols[1] = list.get(i).getProductName();
            cols[2] = list.get(i).getProductCode();
            cols[3] = list.get(i).getMedicineGroup();
            InsertCompany ik = new InsertCompanyDaoImp().getInsertCompanyById(list.get(i).getProductId());
            cols[4] = ik.getCompanyName();
            InsertMedicine im = new InsertMedicineDaoImp().getMedicineByid(list.get(i).getProductId());
            cols[5] = im.getProductName();

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
        jButtonInsertMedicines = new javax.swing.JButton();
        jButtonUpdateMedicines = new javax.swing.JButton();
        jButtonDeleteMedicines = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicineDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAfterLoginIcon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAfterLoginIcon.setText("Login Icon");

        jButtonInsertMedicines.setText("Insert Medicines");

        jButtonUpdateMedicines.setText("UpdateMedicines");

        jButtonDeleteMedicines.setText("Delete Medicines");

        jButtonBack.setText("Back");

        jButtonSearch.setText("Search");

        jTextFieldSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldSearch.setText("If i search by 'a' it wil show all medicines  start with a");

        jTableMedicineDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Proudct Code", "Medicine Group", "Company Name", "Product Category", "Quantity", "Price Per Unit", "Expire Date", "DoseType", "Remarks"
            }
        ));
        jScrollPane1.setViewportView(jTableMedicineDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAfterLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdateMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsertMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAfterLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButtonInsertMedicines)
                .addGap(18, 18, 18)
                .addComponent(jButtonUpdateMedicines)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeleteMedicines)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBack)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MedicinesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicinesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicinesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicinesPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicinesPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDeleteMedicines;
    private javax.swing.JButton jButtonInsertMedicines;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdateMedicines;
    private javax.swing.JLabel jLabelAfterLoginIcon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicineDisplay;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
