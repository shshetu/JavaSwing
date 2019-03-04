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
public class Video6_ShowInputDialog {
    public static void main(String[] args) {
        //1st part
       String name =  JOptionPane.showInputDialog("Enter your name: ");
       JOptionPane.showMessageDialog(null, name+" Welcome to Swing!");
       
       //2nd part: 2 Arguments 
       String firstName = JOptionPane.showInputDialog("Enter your First name: ","Shetu");
       
       //3rd Part: 4 arguments
       String lastName = JOptionPane.showInputDialog(null,"Enter your Last Name","This is a title",JOptionPane.QUESTION_MESSAGE);
       JOptionPane.showMessageDialog(null, "Your full name is: "+firstName+" "+lastName);
    }
 
}
