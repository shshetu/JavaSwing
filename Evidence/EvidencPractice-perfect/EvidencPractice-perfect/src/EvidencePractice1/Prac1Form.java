/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidencePractice1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Prac1Form extends javax.swing.JFrame {

    /**
     * Creates new form Prac1Form
     */
    public Prac1Form() {
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDisplay = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonReadFromFile = new javax.swing.JButton();
        jButtonClearForm = new javax.swing.JButton();
        jButtonClearTable = new javax.swing.JButton();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jCheckBoxJava = new javax.swing.JCheckBox();
        jCheckBoxHTML = new javax.swing.JCheckBox();
        jCheckBoxSpring = new javax.swing.JCheckBox();
        jComboBoxRound = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaComments = new javax.swing.JTextArea();
        jButtonExit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Student Form");

        jTableDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Age", "Email", "Gender", "C.Course", "Round", "Comments"
            }
        ));
        jScrollPane1.setViewportView(jTableDisplay);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Email");

        jLabel5.setText("Gender");

        jLabel6.setText("C.Course");

        jLabel7.setText("Round");

        jLabel8.setText("Comments");

        jButtonReadFromFile.setText("Read File");

        jButtonClearForm.setText("Clear Form");
        jButtonClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFormActionPerformed(evt);
            }
        });

        jButtonClearTable.setText("Clear Table");
        jButtonClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearTableActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");

        buttonGroup1.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");

        jCheckBoxJava.setText("Java");

        jCheckBoxHTML.setText("HTML");

        jCheckBoxSpring.setText("Spring");

        jComboBoxRound.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A Round", "Round 38", "Round 39", "Round 40" }));

        jTextAreaComments.setColumns(20);
        jTextAreaComments.setRows(5);
        jScrollPane2.setViewportView(jTextAreaComments);

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabel9.setText("Age");

        jTextFieldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jRadioButtonMale)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonFemale))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxRound, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxHTML)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxJava)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBoxSpring))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonReadFromFile)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonClearForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonClearTable)
                .addGap(245, 245, 245)
                .addComponent(jButtonExit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jRadioButtonMale)
                            .addComponent(jRadioButtonFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jCheckBoxJava)
                            .addComponent(jCheckBoxSpring)
                            .addComponent(jCheckBoxHTML))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonReadFromFile))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonClearForm)
                            .addComponent(jButtonClearTable)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButtonExit)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean checkEmailValidity(String email){
    String epattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    Pattern p = Pattern.compile(epattern);
    Matcher m = p.matcher(email);
    return m.matches();
}
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:

        //Validation
        //id
//        Object x = null;
//        try {
//            x = Integer.parseInt(jTextFieldId.getText());
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Enter a valid number!");
//        }
       
        
        if (String.valueOf(Integer.parseInt(jTextFieldId.getText())).length() < 5) {
            JOptionPane.showMessageDialog(null, "Your Id should be atleast 5 characters!");
        } 
     
      else if (jTextFieldId.getText().trim().length() < 5) {
            JOptionPane.showMessageDialog(null, "Your Id should be atleast 5 characters!");
        }
      //name
      else if (jTextFieldName.getText().trim().length() < 4) {
            JOptionPane.showMessageDialog(null, "Your Name should be atleast 4 characters!");

        } 
        //age
      else if(Integer.parseInt(jTextFieldAge.getText())<18 ||Integer.parseInt(jTextFieldAge.getText())>100 ){
                  JOptionPane.showMessageDialog(null, "Enter your age between 18 and 100!");
      }
        //email
      else if(!checkEmailValidity(jTextFieldEmail.getText())||jTextFieldEmail.getText().length()<1){
      JOptionPane.showMessageDialog(null, "Enter a valid email!");
      }
        //gender
      else if(!jRadioButtonMale.isSelected() && !jRadioButtonFemale.isSelected()){
    JOptionPane.showMessageDialog(null, "Select your Gender!");
      }
        //ccourse
      else if(!jCheckBoxHTML.isSelected()&&!jCheckBoxJava.isSelected()&&!jCheckBoxSpring.isSelected()){
          JOptionPane.showMessageDialog(null, "Select your Course!");
          
      }
        //round
      else if(jComboBoxRound.getItemAt(jComboBoxRound.getSelectedIndex()) == "Select A Round"){
 JOptionPane.showMessageDialog(null, "Select your Round!");
      }
        //comments
      else if(jTextAreaComments.getText().trim().length()<10){
       JOptionPane.showMessageDialog(null, "Enter Atleast 10 characters!");

      }else{
        //Variables
        int id = Integer.parseInt(jTextFieldId.getText());
        String name = jTextFieldName.getText();
        int age = Integer.parseInt(jTextFieldAge.getText());
        String email = jTextFieldEmail.getText();
        String gender = "";
        if (jRadioButtonMale.isSelected()) {
            gender = jRadioButtonMale.getText();
        }
        if (jRadioButtonFemale.isSelected()) {
            gender = jRadioButtonFemale.getText();
        }

        String ccourse = "";
        if (jCheckBoxHTML.isSelected()) {
            ccourse += jCheckBoxHTML.getText();
        }
        if (jCheckBoxJava.isSelected()) {
            ccourse += " " + jCheckBoxJava.getText();
        }
        if (jCheckBoxSpring.isSelected()) {
            ccourse += " " + jCheckBoxSpring.getText();
        }

        String round = jComboBoxRound.getItemAt(jComboBoxRound.getSelectedIndex());
        String comments = jTextAreaComments.getText();

        String result = id + " " + name + " " + age + " " + email + " " + gender + " " + ccourse + " " + round + " " + comments;
        JOptionPane.showMessageDialog(null, result);
        //create an object of Table
        DefaultTableModel model = (DefaultTableModel) jTableDisplay.getModel();
        //Create an object type array to add all the values one by one
        Object[] cols = new Object[8];
        cols[0] = id;
        cols[1] = name;
        cols[2] = age;
        cols[3] = email;
        cols[4] = gender;
        cols[5] = ccourse;
        cols[6] = round;
        cols[7] = comments;
        model.addRow(cols);
        
        ///Make a list to write to the file
        
      }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAgeActionPerformed

    private void jButtonClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTableDisplay.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButtonClearTableActionPerformed

    private void jButtonClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFormActionPerformed
        // TODO add your handling code here:
        jTextFieldId.setText("");
        jTextFieldName.setText("");
        jTextFieldAge.setText("");
        jTextFieldEmail.setText("");
        buttonGroup1.clearSelection();
        jCheckBoxHTML.setSelected(false);
        jCheckBoxJava.setSelected(false);
        jCheckBoxSpring.setSelected(false);
        jComboBoxRound.setSelectedIndex(0);
        jTextAreaComments.setText("");
    }//GEN-LAST:event_jButtonClearFormActionPerformed

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
            java.util.logging.Logger.getLogger(Prac1Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prac1Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prac1Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prac1Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prac1Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearForm;
    private javax.swing.JButton jButtonClearTable;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReadFromFile;
    private javax.swing.JCheckBox jCheckBoxHTML;
    private javax.swing.JCheckBox jCheckBoxJava;
    private javax.swing.JCheckBox jCheckBoxSpring;
    private javax.swing.JComboBox<String> jComboBoxRound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDisplay;
    private javax.swing.JTextArea jTextAreaComments;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
