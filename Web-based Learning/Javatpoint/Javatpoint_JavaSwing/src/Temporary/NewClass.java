/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class NewClass implements ActionListener {
    JFrame f;
    JTextField tf1,tf2,tf3;
    JButton b1,b2;
    NewClass(){
    //Create Objects
    f = new JFrame();
    tf1 = new JTextField();
    tf2 = new JTextField();
    tf3 = new JTextField();
    tf3.setEditable(false);
    b1 = new JButton("+");
    b2 = new JButton("-");
    
    ///Location
    tf1.setBounds(100,50,150,30);
    tf2.setBounds(100,100,150,30);
    tf3.setBounds(100,150,150,30);
    b1.setBounds(100,200,80,50);
    b2.setBounds(200,200,80,50);
    f.setSize(400,400);
        
//Actions
 f.add(tf1);
 f.add(tf2);
 f.add(tf3);
 f.add(b1);
 f.add(b2);
 b1.addActionListener(this);
 b2.addActionListener(this);
   
 //Love
 f.setLayout(null);
f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if(e.getSource() == b1){c =a+b;}
        else if(e.getSource() == b2){c = a-b;}
        String result = String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String[] args) {
        new NewClass();
    }
    
}
