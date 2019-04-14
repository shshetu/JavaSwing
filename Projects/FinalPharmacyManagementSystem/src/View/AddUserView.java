/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import dao.UserDao;
import daoImp.UserDaoImp;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.User;

/**
 *
 * @author shshe
 */
public class AddUserView extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    public AddUserView() {
        initComponents();
        //button
        jButtonUpdateUser.setEnabled(false);
        jButtonDeleteUser.setEnabled(false);
        ///display into table
        new UserDaoImp().createTable();
        displayDataIntoTable();
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTableUserDisplay.getModel();
        model.setRowCount(0);
    }

    public void displayDataIntoTable() {
        clearTable();
        DefaultTableModel model = (DefaultTableModel) jTableUserDisplay.getModel();
        UserDao us = new UserDaoImp();
        List<User> list = us.getUser();
        Object[] cols = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            cols[0] = list.get(i).getUserID();
            cols[1] = list.get(i).getUserName();
            cols[2] = list.get(i).getDob();
            cols[3] = list.get(i).getAddress();
            cols[4] = list.get(i).getPhone();
            cols[5] = list.get(i).getSalary();
            cols[6] = list.get(i).getRoleName();
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
        jTableUserDisplay = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonAddUser = new javax.swing.JButton();
        jButtonDeleteUser = new javax.swing.JButton();
        jButtonUpdateUser = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jComboBoxYear = new javax.swing.JComboBox<>();
        jComboBoxDay = new javax.swing.JComboBox<>();
        jComboBoxMonth = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxRole = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("User Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(349, 349, 349)
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 984, 60));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jTableUserDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "DOB", "ADDRESS", "PHONE", "SALARY", "Role"
            }
        ));
        jScrollPane1.setViewportView(jTableUserDisplay);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");

        jTextFieldUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of Birth:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone:");

        jTextFieldPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salary:");

        jTextFieldSalary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");

        jTextFieldPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButtonAddUser.setBackground(new java.awt.Color(0, 102, 102));
        jButtonAddUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAddUser.setText("Add User");
        jButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUserActionPerformed(evt);
            }
        });

        jButtonDeleteUser.setBackground(new java.awt.Color(0, 102, 102));
        jButtonDeleteUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDeleteUser.setText("Delete User");

        jButtonUpdateUser.setBackground(new java.awt.Color(0, 102, 102));
        jButtonUpdateUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonUpdateUser.setText("Update User");

        jButtonCancel.setBackground(new java.awt.Color(0, 102, 102));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(0, 102, 102));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextAreaAddress.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAddress);

        jComboBoxYear.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year:", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021" }));

        jComboBoxDay.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxDay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxMonth.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Role:");

        jComboBoxRole.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxRole.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A Role:", "admin", "manager", "employee" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(209, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPhone)
                                    .addComponent(jTextFieldSalary)
                                    .addComponent(jTextFieldPassword)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                    .addComponent(jComboBoxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jComboBoxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddUser)
                    .addComponent(jButtonUpdateUser)
                    .addComponent(jButtonDeleteUser)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonClear))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 980, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdministrationDashBoard().setVisible(true);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUserActionPerformed
        // TODO add your handling code here:
        UserDao us = new UserDaoImp();

        //validation
        //problem in validation
        try {
            if (jComboBoxRole.getItemAt(jComboBoxRole.getSelectedIndex()).equals("Select A ROle:")) {
                JOptionPane.showMessageDialog(null, "Please select a role!");

            } else if (jTextFieldUsername.getText().trim().length() < 3) {
                JOptionPane.showMessageDialog(null, "Username should be atleast 3 charcters!");
            } else if (jComboBoxDay.getItemAt(jComboBoxDay.getSelectedIndex()).equals("Day:") || jComboBoxMonth.getItemAt(jComboBoxMonth.getSelectedIndex()).equals("Month:") || jComboBoxYear.getItemAt(jComboBoxYear.getSelectedIndex()).equals("Year:")) {
                JOptionPane.showMessageDialog(null, "Please select the date correctly!");
            } else if (jTextAreaAddress.getText().trim().length() < 3) {
                JOptionPane.showMessageDialog(null, "Address should be atleast 3 charcters!");
            } else if (String.valueOf(Integer.parseInt(jTextFieldPhone.getText().trim())).length() < 4) {
                JOptionPane.showMessageDialog(null, "Phone number should be atleast 4 charcters!");
            } else if (String.valueOf(Double.valueOf(jTextFieldSalary.getText().trim())).length() < 3) {
                JOptionPane.showMessageDialog(null, "Salary should be atleast 3 charcters!");
            } else if (jTextFieldPassword.getText().trim().length() < 6) {
                JOptionPane.showMessageDialog(null, "Password should be atleast 6 charcters!");
            } else {
                try {
                    //collect data
                    String role_name = jComboBoxRole.getItemAt(jComboBoxRole.getSelectedIndex());
                    String user_name = jTextFieldUsername.getText().trim();
                    String d = jComboBoxDay.getItemAt(jComboBoxDay.getSelectedIndex());
                    String m = jComboBoxMonth.getItemAt(jComboBoxMonth.getSelectedIndex());
                    String y = jComboBoxYear.getItemAt(jComboBoxYear.getSelectedIndex());

                    String address = jTextAreaAddress.getText().trim();
                    int phone = Integer.parseInt(jTextFieldPhone.getText().trim());
                    double salary = Double.valueOf(jTextFieldSalary.getText().trim());
                    String pass = jTextFieldPassword.getText().trim();
                    ////////////////////////
                    int day = Integer.parseInt(jComboBoxDay.getItemAt(jComboBoxDay.getSelectedIndex()));
                    int month = Integer.parseInt(jComboBoxMonth.getItemAt(jComboBoxMonth.getSelectedIndex()));
                    int year = Integer.parseInt(jComboBoxYear.getItemAt(jComboBoxYear.getSelectedIndex()));
                    Date dob = Date.valueOf(year + "-" + month + "-" + day);
                    //User(String userName, Date dob, String Address, int phone, double salary, String pass)
                    User u = new User(role_name, user_name, dob, address, phone, salary, pass);
                    us.insert(u);
                    displayDataIntoTable();
                    JOptionPane.showMessageDialog(null, "Data is inserted successfully into user table!");

                } catch (Exception e) {

                }

            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Insert Data in every field!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid phone or salary!");

        }
        //insertion
    }//GEN-LAST:event_jButtonAddUserActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        jComboBoxRole.setSelectedIndex(0);
        jTextFieldUsername.setText("");
        jComboBoxDay.setSelectedIndex(0);
        jComboBoxMonth.setSelectedIndex(0);
        jComboBoxYear.setSelectedIndex(0);

        jTextAreaAddress.setText("");
        jTextFieldPhone.setText("");
        jTextFieldSalary.setText("");
        jTextFieldPassword.setText("");

    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(AddUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUserView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDeleteUser;
    private javax.swing.JButton jButtonUpdateUser;
    private javax.swing.JComboBox<String> jComboBoxDay;
    private javax.swing.JComboBox<String> jComboBoxMonth;
    private javax.swing.JComboBox<String> jComboBoxRole;
    private javax.swing.JComboBox<String> jComboBoxYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableUserDisplay;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldSalary;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
