/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import daoImp.CompanyDaoImp;
import daoImp.SummaryDaoImp;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Company;
import pojo.Summary;

/**
 *
 * @author shshe
 */
public class DrugListView extends javax.swing.JFrame {

    /**
     * Creates new form SearchDrugView
     */
    public DrugListView() {
        initComponents();
        displayDataIntoTable();
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTableDrugList.getModel();
        model.setRowCount(0);
    }

    public void displayDataIntoTable() {
        clearTable();
        DefaultTableModel model = (DefaultTableModel) jTableDrugList.getModel();
        List<Summary> list = new SummaryDaoImp().getSummary();
        Object[] cols = new Object[8];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_name();
            cols[1] = list.get(i).getDrug_type();
            cols[2] = list.get(i).getDrug_barcode();
            cols[3] = list.get(i).getBuy_price();
            cols[4] = list.get(i).getSell_price();
            cols[5] = list.get(i).getAvailable_qty();
            cols[6] = list.get(i).getValidity();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getDrug_id());
            cols[7] = com.getCompany_name();
            model.addRow(cols);
        }

    }

    public void displayDataIntoTableSelectingName() {
        clearTable();
        DefaultTableModel model = (DefaultTableModel) jTableDrugList.getModel();
        List<Summary> list = new SummaryDaoImp().getSummarySelectingName();
        Object[] cols = new Object[8];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_name();
            cols[1] = list.get(i).getDrug_type();
            cols[2] = list.get(i).getDrug_barcode();
            cols[3] = list.get(i).getBuy_price();
            cols[4] = list.get(i).getSell_price();
            cols[5] = list.get(i).getAvailable_qty();
            cols[6] = list.get(i).getValidity();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getDrug_id());
            cols[7] = com.getCompany_name();
            model.addRow(cols);
        }
    }

    public void displayDataIntoTableSelectingType() {
        clearTable();
        DefaultTableModel model = (DefaultTableModel) jTableDrugList.getModel();
        List<Summary> list = new SummaryDaoImp().getSummarySelectingType();
        Object[] cols = new Object[8];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_name();
            cols[1] = list.get(i).getDrug_type();
            cols[2] = list.get(i).getDrug_barcode();
            cols[3] = list.get(i).getBuy_price();
            cols[4] = list.get(i).getSell_price();
            cols[5] = list.get(i).getAvailable_qty();
            cols[6] = list.get(i).getValidity();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getDrug_id());
            cols[7] = com.getCompany_name();
            model.addRow(cols);
        }
    }

    public void displayDataIntoTableSelectingExpiration() {
        clearTable();
        DefaultTableModel model = (DefaultTableModel) jTableDrugList.getModel();
        List<Summary> list = new SummaryDaoImp().getSummarySelectingExpiration();
        Object[] cols = new Object[8];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_name();
            cols[1] = list.get(i).getDrug_type();
            cols[2] = list.get(i).getDrug_barcode();
            cols[3] = list.get(i).getBuy_price();
            cols[4] = list.get(i).getSell_price();
            cols[5] = list.get(i).getAvailable_qty();
            cols[6] = list.get(i).getValidity();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getDrug_id());
            cols[7] = com.getCompany_name();
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
        jTableDrugList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSortBy = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Drug List ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
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

        jTableDrugList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Barcode", "Buying Price", "Selling Price", "Available Qty", "Validity", "Company Name"
            }
        ));
        jScrollPane1.setViewportView(jTableDrugList);
        if (jTableDrugList.getColumnModel().getColumnCount() > 0) {
            jTableDrugList.getColumnModel().getColumn(5).setResizable(false);
            jTableDrugList.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Sort By:");

        jComboBoxSortBy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxSortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort By:", "Name", "Type", "Expiration" }));
        jComboBoxSortBy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSortByItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jComboBoxSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
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
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSortByItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSortByItemStateChanged
        // TODO add your handling code here:
        if ((jComboBoxSortBy.getItemAt(jComboBoxSortBy.getSelectedIndex())).equals("Name")) {
            displayDataIntoTableSelectingName();
            JOptionPane.showMessageDialog(null, "data is ordered by drug_name!");
        } else if ((jComboBoxSortBy.getItemAt(jComboBoxSortBy.getSelectedIndex())).equals("Type")) {
            displayDataIntoTableSelectingType();
            JOptionPane.showMessageDialog(null, "data is ordered by drug_type!");

        } else if ((jComboBoxSortBy.getItemAt(jComboBoxSortBy.getSelectedIndex())).equals("Expiration")) {
            displayDataIntoTableSelectingExpiration();
            JOptionPane.showMessageDialog(null, "data is ordered by exp_data!");

        }
    }//GEN-LAST:event_jComboBoxSortByItemStateChanged

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
            java.util.logging.Logger.getLogger(DrugListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrugListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrugListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrugListView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrugListView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxSortBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDrugList;
    // End of variables declaration//GEN-END:variables
}
