/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_17_02_2019;

import com.sun.javafx.scene.control.skin.FXVK;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Biodata extends javax.swing.JFrame {

    /**
     * Creates new form Biodata
     */
    public Biodata() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtAge = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jradioFemale = new javax.swing.JRadioButton();
        jradioMale = new javax.swing.JRadioButton();
        jbtnClear = new javax.swing.JButton();
        jbtnClearTable = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jcmbRound = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDisplay = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jtxtMsg = new javax.swing.JTextField();
        jCheckJava = new javax.swing.JCheckBox();
        jCheckHTML = new javax.swing.JCheckBox();
        jCheckJS = new javax.swing.JCheckBox();
        jtxtResult = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jtxtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Age:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jtxtAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAgeActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jtxtEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gender:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("C.Course:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Round:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Studetnt Information");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel7)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 460, 70));

        buttonGroup1.add(jradioFemale);
        jradioFemale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jradioFemale.setText("Female");
        getContentPane().add(jradioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, -1));

        buttonGroup1.add(jradioMale);
        jradioMale.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jradioMale.setText("Male");
        getContentPane().add(jradioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, -1));

        jbtnClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnClear.setText("Clear");
        jbtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        jbtnClearTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnClearTable.setText("Clear Table");
        jbtnClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClearTableActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnClearTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        jbtnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtnAdd.setText("Add");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jcmbRound.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmbRound.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A Round", "Round 37", "Round 38", "Round 39", "Round 40" }));
        jcmbRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbRoundActionPerformed(evt);
            }
        });
        getContentPane().add(jcmbRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 200, -1));

        jtblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Email", "Gender", "C.Course", "Round", "Message"
            }
        ));
        jScrollPane1.setViewportView(jtblDisplay);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 460, 400));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Message:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jtxtMsg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMsgActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 388, 200, 80));

        jCheckJava.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckJava.setText("Java");
        getContentPane().add(jCheckJava, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jCheckHTML.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckHTML.setText("HTML");
        getContentPane().add(jCheckHTML, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, -1, -1));

        jCheckJS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckJS.setText("JavaScript");
        jCheckJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckJSActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckJS, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jtxtResult.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, 200, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNameActionPerformed

    private void jtxtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAgeActionPerformed

    private void jtxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmailActionPerformed
    
    }//GEN-LAST:event_jtxtEmailActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        String name = jtxtName.getText();
        int age = Integer.parseInt(jtxtAge.getText());
        String email = jtxtEmail.getText();
        String gender = "";
        if (jradioMale.isSelected() == true) {
            gender = jradioMale.getText();
        } else if (jradioFemale.isSelected() == true) {
            gender = jradioFemale.getText();
        }
        String ccourse = "";
        if (jCheckHTML.isSelected() == true) {
            ccourse += jCheckHTML.getText() + " ";
        }
        if (jCheckJS.isSelected() == true) {
            ccourse += jCheckJS.getText() + " ";
        }
        if (jCheckJava.isSelected() == true) {
            ccourse += jCheckJava.getText() + " ";
        }
        String round = jcmbRound.getItemAt(jcmbRound.getSelectedIndex());
        String msg = jtxtMsg.getText();
        String result = name + "\n" + age + "\n" + gender + "\n" + email + "\n" + ccourse + "\n" + round + "\n" + msg + "\n";
       
            DefaultTableModel model = (DefaultTableModel) jtblDisplay.getModel();
            Object[] row = new Object[7];
            row[0] = name;
            row[1] = age;
            row[2] = email;
            row[3] = gender;
            row[4] = ccourse;
            row[5] = round;
            row[6] = msg;

            model.addRow(row);
   

    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jcmbRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbRoundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbRoundActionPerformed

    private void jtxtMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtMsgActionPerformed

    private void jCheckJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckJSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckJSActionPerformed

    private void jbtnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearTableActionPerformed
 DefaultTableModel model = (DefaultTableModel)jtblDisplay.getModel();
 model.setRowCount(0);
    }//GEN-LAST:event_jbtnClearTableActionPerformed

    private void jbtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClearActionPerformed
    jtxtName.setText("");
     jtxtAge.setText("");
     jtxtEmail.setText("");
     buttonGroup1.clearSelection();
     jCheckHTML.setSelected(false);
     jCheckJS.setSelected(false);
     jCheckJava.setSelected(false);
     jcmbRound.setSelectedIndex(0);
     jtxtMsg.setText("");
    }//GEN-LAST:event_jbtnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JCheckBox jCheckHTML;
    private javax.swing.JCheckBox jCheckJS;
    private javax.swing.JCheckBox jCheckJava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnClear;
    private javax.swing.JButton jbtnClearTable;
    private javax.swing.JComboBox<String> jcmbRound;
    private javax.swing.JRadioButton jradioFemale;
    private javax.swing.JRadioButton jradioMale;
    private javax.swing.JTable jtblDisplay;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JTextField jtxtEmail;
    private javax.swing.JTextField jtxtMsg;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
