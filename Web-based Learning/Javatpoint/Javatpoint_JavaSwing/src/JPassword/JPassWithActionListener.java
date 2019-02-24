/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPassword;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class JPassWithActionListener implements ActionListener{
    JFrame f;
    JLabel l1,l2,l3;
    JTextField tf1,tf2;
    JButton b;
    JPasswordField pass;
    JPassWithActionListener(){
    //Create Object
    l1 = new JLabel("Username: ");;
    l2 = new JLabel("Password: ");;
    l3 = new JLabel();
    tf1 = new JTextField();
    pass = new JPasswordField();
    b = new JButton("Login");
    //Location
    l1.setBounds(50,50,100,30);
    tf1.setBounds(100,50,100,30);
    
    l2.setBounds(50,100,100,30);
    pass.setBounds(100,100,100,30);
    
    b.setBounds(100,200,50,50);
        l3.setBounds(50,300,200,30);
        f.setSize(500,500);
//Action
    //Love
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf1.getText();
    }
    
    public static void main(String[] args) {
        new JPassWithActionListener();
    }
    
}
