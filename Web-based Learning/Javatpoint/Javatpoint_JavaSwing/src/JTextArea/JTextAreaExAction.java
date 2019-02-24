/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author User
 */
public class JTextAreaExAction implements ActionListener{
    JFrame f;
    JTextArea area;
    JLabel l1,l2;
    JButton b;
    public JTextAreaExAction() {
        //Create Object
     f = new JFrame();
     area = new JTextArea();
    l1= new JLabel();
    l2 = new JLabel();
    b = new JButton();
    //Location
    l1.setBounds(50,20,50,100);
    l2.setBounds(50,20,150,100);
    area.setBounds(30,200,200,200);
    b.setBounds(100,300,100,50);
    f.setSize(500,500);
//Action
    f.add(area);
    f.add(l1);
    f.add(l2);
    f.add(b);
    b.addActionListener(this);
    
    //LOve
    f.setLayout(null);
   f.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String[] words = text.split("\\s");
        l1.setText("Words: "+words.length);
        l2.setText("Characters: "+ text.length());
    }
    
    public static void main(String[] args) {
        new JTextAreaExAction();
    }

    
}
