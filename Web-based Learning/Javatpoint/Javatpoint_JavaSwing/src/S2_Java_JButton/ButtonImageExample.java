/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2_Java_JButton;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class ButtonImageExample {
        //Association=> consturctor based
    ButtonImageExample() {
    //create object
    JFrame f = new JFrame("Image Button Example");
    JButton b = new JButton(new ImageIcon("E:\\icon.png"));
    
    //Location
    b.setBounds(150,100,50,50);
    f.setSize(400,500);
    
    //Actions
    f.add(b);
    //Love
    f.setLayout(null);
    f.setVisible(true);
    }
    
    //Main method
    public static void main(String[] args) {
        new ButtonImageExample();
    }
    
}
