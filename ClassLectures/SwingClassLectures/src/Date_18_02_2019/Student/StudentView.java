/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_18_02_2019.Student;

/**
 *
 * @author User
 */
public class StudentView extends javax.swing.JFrame {

    /**
     * Creates new form StudentView
     */
    public StudentView() {
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

        jtxtStudent = new javax.swing.JLabel();
        jlblName = new javax.swing.JLabel();
        jtxtName = new javax.swing.JTextField();
        jbtnInsert = new javax.swing.JButton();
        jbtUpdate = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtStudent.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtxtStudent.setText("Student Form");
        getContentPane().add(jtxtStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 29, -1, -1));

        jlblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlblName.setText("Name:");
        getContentPane().add(jlblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 105, 100, -1));

        jtxtName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, -1));

        jbtnInsert.setText("Insert");
        getContentPane().add(jbtnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jbtUpdate.setText("Update");
        getContentPane().add(jbtUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jbtnDelete.setText("Delete");
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

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
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtUpdate;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnInsert;
    private javax.swing.JLabel jlblName;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JLabel jtxtStudent;
    // End of variables declaration//GEN-END:variables
}