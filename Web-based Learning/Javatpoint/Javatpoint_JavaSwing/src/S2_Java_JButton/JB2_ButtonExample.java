/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2_Java_JButton;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class JB2_ButtonExample {
    public static void main(String[] args) {
        //1. create object with pass by value
        JFrame f = new JFrame("Button Exmaple");
        JButton b = new JButton("Click Here");
        
        //2. set location
        b.setBounds(50,100,95,30);
        f.setSize(400,400);
        //3.add JButton object into JFrame object
        f.add(b);
        //Use LOVE
        f.setLayout(null);
        f.setVisible(true);
    }
}
