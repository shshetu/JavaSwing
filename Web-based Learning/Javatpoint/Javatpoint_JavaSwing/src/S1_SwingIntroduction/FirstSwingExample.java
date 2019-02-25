/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S1_SwingIntroduction;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class FirstSwingExample {
    public static void main(String[] args) {
    //creating the object of Jframe and JButton
        JFrame f = new JFrame();
        JButton b = new JButton("click");
     //set the location or position of objects
     b.setBounds(130,100,100,40); //x axis, y axis, width, height
     f.setSize(400,500); //width, height
     
     //Action
     f.add(b);
     b.setEnabled(true);
   
     ///love
     f.setLayout(null);//using no layout manager
     f.setVisible(true);
    }
}
