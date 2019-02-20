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
public class Simple2 extends JFrame{
     //JFrame f; //global variable is must to declare here
    Simple2(){
        //create a button object from JButton
        JButton b = new JButton("Click");
        
        //Location
        b.setBounds(130,100,100,40);
        setSize(400,500);
        
        //Add
        add(b);
        
        //Love
        setLayout(null);
        setVisible(true);
    
    }
    public static void main(String[] args) {
        new Simple2();
    }
}
