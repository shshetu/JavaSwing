/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulislamswing;

import javax.swing.JOptionPane;

/**
 *
 * @author shshe
 */
public class Video4_ShowMessageDialogPart2 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Wrong Password","Warning",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password","Warning",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password","Warning",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password","Warning",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Wrong Password","Warning",JOptionPane.PLAIN_MESSAGE);
        
        //for Plain Message = -1 
        //for Error Message = 0
        //for Information Message = 1
        //for Warning Message = 2
        //for Question Message = 3
        
    }
}
