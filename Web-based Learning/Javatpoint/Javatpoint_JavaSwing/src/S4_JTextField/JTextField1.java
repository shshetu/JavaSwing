/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S4_JTextField;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class JTextField1 {
    public static void main(String[] args) {
        //Create new Object
        JFrame f = new JFrame("TextField Example");
        JTextField t1 = new JTextField("Welcome to Javatpoint");
        JTextField t2 = new JTextField("AWT Tutorial");
    
        //Location
        t1.setBounds(50,100,150,20);
        t2.setBounds(50,150,150,20);
        f.setSize(300,300);
        
        //Actions 
        f.add(t1);
        f.add(t2);
        
        //Love
        f.setLayout(null);
        f.setVisible(true);
    }
}
