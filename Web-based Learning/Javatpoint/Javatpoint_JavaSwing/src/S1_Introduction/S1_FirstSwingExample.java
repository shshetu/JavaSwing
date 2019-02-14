/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S1_Introduction;

import javax.swing.JButton;
import javax.swing.JFrame;



/**
 *
 * @author User
 */
public class S1_FirstSwingExample {
    public static void main(String[] args) {
       //we are creating object of the JFrame class
        JFrame f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(130,100,100,40);
        f.setSize(400,500);
        f.add(b);
        //no layout
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
