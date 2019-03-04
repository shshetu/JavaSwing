/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3_JLabel;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class JLabelActionListener extends Frame implements ActionListener{
JFrame f;
  JLabel l;
    JButton b;
    JTextField tf;
   JLabelActionListener(){
       //create object
   l = new JLabel();
   b = new JButton("Find IP");
   tf = new JTextField();
   
   //Location
   tf.setBounds(50,50,100,20);
   l.setBounds(50,100,200,20);
   b.setBounds(50,200,80,30);
   setSize(400,500);
   
   //Actions
   b.addActionListener(this);
   add(tf);
   add(b);
   add(l);
//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
//Love
       setLayout(null);
       setVisible(true);
   }
   
   ///actionPerformed Method

    @Override
    public void actionPerformed(ActionEvent e) {
      
      try {
          String host = tf.getText();
          String ip = java.net.InetAddress.getByName(host).getHostAddress();
          l.setText("Ip of "+host+ " is:"+ip);
      } catch (UnknownHostException ex) {
          Logger.getLogger(JLabelActionListener.class.getName()).log(Level.SEVERE, null, ex);
      }
     
 
    }
    public static void main(String[] args) {
        new JLabelActionListener();
    }
   
    
}
