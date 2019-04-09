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
public class SummaryView extends javax.swing.JFrame {

    /**
     * Creates new form SearchDrugView
     */
    public SummaryView() {
        initComponents();
        new SummaryDaoImp().createTable();
        displayDataIntoTable();
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTableSummaryDisplay.getModel();
        model.setRowCount(0);
    }

    public void displayDataIntoTable() {
        clearTable();
        List<Summary> list = new SummaryDaoImp().getSummary();
        DefaultTableModel model = (DefaultTableModel) jTableSummaryDisplay.getModel();
        Object[] cols = new Object[18];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_id();
            cols[1] = list.get(i).getDrug_name();
            cols[2] = list.get(i).getDrug_type();
            cols[3] = list.get(i).getDrug_barcode();
            cols[4] = list.get(i).getDrug_dose();
            cols[5] = list.get(i).getDrug_code();
            cols[6] = list.get(i).getBuy_price();
            cols[7] = list.get(i).getSell_price();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getCompany().getCompany_id());
            cols[8] = com.getCompany_name();
            cols[9] = list.get(i).getProduction_date();
            cols[10] = list.get(i).getExpire_date();
            cols[11] = list.get(i).getExpire_time();
            cols[12] = list.get(i).getValidity();
            cols[13] = list.get(i).getDrug_tax();
            cols[14] = list.get(i).getDrug_place();
            cols[15] = list.get(i).getTotal_qty();
            cols[16] = list.get(i).getAvailable_qty();
            cols[17] = list.get(i).getSold_qty();
            model.addRow(cols);
        }
    }

    ///selecting for name
    public void displayDataIntoTableSelectingName() {
        clearTable();
        List<Summary> list = new SummaryDaoImp().getSummarySelectingName();
        DefaultTableModel model = (DefaultTableModel) jTableSummaryDisplay.getModel();
        Object[] cols = new Object[18];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_id();
            cols[1] = list.get(i).getDrug_name();
            cols[2] = list.get(i).getDrug_type();
            cols[3] = list.get(i).getDrug_barcode();
            cols[4] = list.get(i).getDrug_dose();
            cols[5] = list.get(i).getDrug_code();
            cols[6] = list.get(i).getBuy_price();
            cols[7] = list.get(i).getSell_price();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getDrug_id());
            cols[8] = com.getCompany_name();
            cols[9] = list.get(i).getProduction_date();
            cols[10] = list.get(i).getExpire_date();
            cols[11] = list.get(i).getExpire_time();
            cols[12] = list.get(i).getValidity();
            cols[13] = list.get(i).getDrug_tax();
            cols[14] = list.get(i).getDrug_place();
            cols[15] = list.get(i).getTotal_qty();
            cols[16] = list.get(i).getAvailable_qty();
            cols[17] = list.get(i).getSold_qty();
            model.addRow(cols);
        }
    }

    ///selecting for type
    public void displayDataIntoTableSelectingType() {
        clearTable();
        List<Summary> list = new SummaryDaoImp().getSummarySelectingType();
        DefaultTableModel model = (DefaultTableModel) jTableSummaryDisplay.getModel();
        Object[] cols = new Object[18];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_id();
            cols[1] = list.get(i).getDrug_name();
            cols[2] = list.get(i).getDrug_type();
            cols[3] = list.get(i).getDrug_barcode();
            cols[4] = list.get(i).getDrug_dose();
            cols[5] = list.get(i).getDrug_code();
            cols[6] = list.get(i).getBuy_price();
            cols[7] = list.get(i).getSell_price();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getDrug_id());
            cols[8] = com.getCompany_name();
            cols[9] = list.get(i).getProduction_date();
            cols[10] = list.get(i).getExpire_date();
            cols[11] = list.get(i).getExpire_time();
            cols[12] = list.get(i).getValidity();
            cols[13] = list.get(i).getDrug_tax();
            cols[14] = list.get(i).getDrug_place();
            cols[15] = list.get(i).getTotal_qty();
            cols[16] = list.get(i).getAvailable_qty();
            cols[17] = list.get(i).getSold_qty();
            model.addRow(cols);
        }
    }

    ///selecting for expire date
    public void displayDataIntoTableSelectingExpiration() {
        clearTable();
        List<Summary> list = new SummaryDaoImp().getSummarySelectingExpiration();
        DefaultTableModel model = (DefaultTableModel) jTableSummaryDisplay.getModel();
        Object[] cols = new Object[18];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getDrug_id();
            cols[1] = list.get(i).getDrug_name();
            cols[2] = list.get(i).getDrug_type();
            cols[3] = list.get(i).getDrug_barcode();
            cols[4] = list.get(i).getDrug_dose();
            cols[5] = list.get(i).getDrug_code();
            cols[6] = list.get(i).getBuy_price();
            cols[7] = list.get(i).getSell_price();
            Company com = new CompanyDaoImp().getCompanyById(list.get(i).getDrug_id());
            cols[8] = com.getCompany_name();
            cols[9] = list.get(i).getProduction_date();
            cols[10] = list.get(i).getExpire_date();
            cols[11] = list.get(i).getExpire_time();
            cols[12] = list.get(i).getValidity();
            cols[13] = list.get(i).getDrug_tax();
            cols[14] = list.get(i).getDrug_place();
            cols[15] = list.get(i).getTotal_qty();
            cols[16] = list.get(i).getAvailable_qty();
            cols[17] = list.get(i).getSold_qty();
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
        jTableSummaryDisplay = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxSortBy = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabelSearchByName = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Summary View");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(462, 462, 462)
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

        jTableSummaryDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Id", "Name", "Type", "Barcode", "Drug Dose", "Drug_Code", "Buy_Price", "Sell_Price", "Com_Name", "Pro_Date", "Ex_ Date", "Ex_Time", "Validity ", "Tax", "Place", "Total_Qty", "Available_Qty", "Sold_Qty"
            }
        ));
        jScrollPane1.setViewportView(jTableSummaryDisplay);
        if (jTableSummaryDisplay.getColumnModel().getColumnCount() > 0) {
            jTableSummaryDisplay.getColumnModel().getColumn(4).setResizable(false);
            jTableSummaryDisplay.getColumnModel().getColumn(15).setResizable(false);
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Search By Name:");

        jLabelSearchByName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSearchByName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1263, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jComboBoxSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(jLabelSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(jButtonBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jComboBoxSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonBack)
                .addContainerGap(35, Short.MAX_VALUE))
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
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdministrationDashBoard().setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(SummaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummaryView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummaryView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JComboBox<String> jComboBoxSortBy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSearchByName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSummaryDisplay;
    // End of variables declaration//GEN-END:variables
}
