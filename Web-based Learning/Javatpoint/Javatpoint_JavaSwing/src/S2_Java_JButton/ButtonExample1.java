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
public class ButtonExample1 {
    public static void main(String[] args) {
       ///creating object
    JFrame f = new JFrame("Button Example");
    JButton b = new JButton("Click Here");
    
    //set location
    b.setBounds(130,100,100,40);
    f.setSize(400,500);
    
     //add the button to the frame
    f.add(b);
   
    //Love
    f.setLayout(null);
    f.setVisible(true);
    }
    
   
   
}
