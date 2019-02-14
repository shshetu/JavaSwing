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
public class JB3_ButtonExample {

    public JB3_ButtonExample() {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton(new ImageIcon("E:\\Shetu\\git\\shetu's git\\JavaSwing\\Web-based Learning\\Javatpoint\\ImagesforPrograms\\green-icon.jpg"));
    //location
    b.setBounds(100,100,100,40);
    f.setSize(300,400);
    //add object
    f.add(b);
    //love
    f.setLayout(null);
    f.setVisible(true);
    }
    public static void main(String[] args) {
        new JB3_ButtonExample();
    }
    
}
