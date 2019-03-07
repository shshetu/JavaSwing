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
public class Video7_ShowConfirmDialog {
    
    public static void main(String[] args) {
       int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit?", "title", JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice==JOptionPane.YES_OPTION){
       System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null, "You have selected no option");
        }
    }
}
