/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulislamswing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shshe
 */
public class Video9_CreatingAndSettingUpJFrame_Part2 {
    Video9_CreatingAndSettingUpJFrame_Part2(){
        //create Object
        JFrame f = new JFrame();
        JButton b = new JButton("Click!");
       
        //Location
        f.setBounds(100,100,300,300);
        b.setBounds(100,100,100,100);
        
        //Action
        f.add(b);
        f.setTitle("This is title");        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Love
        f.setLayout(null);
        f.setVisible(true);
    
    }
    public static void main(String[] args) {
       Video9_CreatingAndSettingUpJFrame_Part2 test = new Video9_CreatingAndSettingUpJFrame_Part2();
    }
}
