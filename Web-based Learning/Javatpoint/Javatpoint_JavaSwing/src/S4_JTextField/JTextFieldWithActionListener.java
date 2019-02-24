/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S4_JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class JTextFieldWithActionListener implements ActionListener{
JTextField t1,t2,t3;
JFrame f;
JButton b1,b2;
    public JTextFieldWithActionListener() {
    //Create Objects
    f = new JFrame();
   t1 = new JTextField();
   t2 = new JTextField();
    t3 = new JTextField();
         b1 = new JButton("+");
        b2 = new JButton("-");
    //Location
    t1.setBounds(50,50,150,20);
    t2.setBounds(50,100,150,20);
    t3.setBounds(50,150,150,20);
    b1.setBounds(50,200,50,50);
    b2.setBounds(120,200,50,50);
    t3.setEditable(false);
    f.setSize(300,300);
    //Actions
    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(b1);
    f.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
    //Love
    f.setLayout(null);
    f.setVisible(true);
   
    
    }
     //Extra Method
    public void actionPerformed(ActionEvent e){
    String s1 = t1.getText();
    String s2 = t2.getText();
    int a = Integer.parseInt(s1);
    int b = Integer.parseInt(s2);
    int c = 0;
    if(e.getSource() == b1){c = a+b;}
    else if(e.getSource() == b2){c = a-b;}
    String result = String.valueOf(c);
    t3.setText(result);
    }
    public static void main(String[] args) {
        new JTextFieldWithActionListener();
    }
    
}
