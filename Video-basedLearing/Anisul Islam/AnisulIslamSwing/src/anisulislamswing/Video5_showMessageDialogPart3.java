/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulislamswing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author shshe
 */
public class Video5_showMessageDialogPart3 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("happyIcon.png");
        JOptionPane.showMessageDialog(null, "Enter correct Password","this is a title",JOptionPane.PLAIN_MESSAGE,icon);
    }
}
