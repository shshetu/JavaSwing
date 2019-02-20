/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2_Java_JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ButtonExampleActionListener {
    //JFrame using Association
    public static void main(String[] args) {
        //create objct
        JFrame f = new JFrame("Button Example With TextField");
        JButton b = new JButton("Click Here");
        JTextField tf = new JTextField();
        
        //Location
        tf.setBounds(50,50,150,20);
        b.setBounds(50,100,95,30);
       f.setSize(400,500);
        
        //Actions 
        f.add(b);
        f.add(tf);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("welcome to JavaTPoint!");
            }
        }); 
        
        //Love
        f.setLayout(null);
        f.setVisible(true);
    }
}
