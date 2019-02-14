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
public class JB1_ButtonExample {
    public static void main(String[] args) {
        //class declaration
        JFrame f = new JFrame("Button Example"); //string type constructor
        JButton b = new JButton("Click Here");
        //sets the location
        b.setBounds(50,100,95,30); //x-axis,y-axis,width,height
        f.setSize(400,400); //width,height
        
        //adds the button object in the JFrame object
        f.add(b);
        
        //setLayout(),setVisibile = Love
        f.setLayout(null);
        f.setVisible(true);
    }
  
}
