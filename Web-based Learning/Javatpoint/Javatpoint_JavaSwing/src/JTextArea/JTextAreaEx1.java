/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTextArea;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author User
 */
public class JTextAreaEx1 {

    public JTextAreaEx1() {
    //Create Object
    JFrame f = new JFrame();
    JTextArea area = new JTextArea("Welcome to JavaTPoint");
    
    //location
   area.setBounds(100,100,200,100);
   f.setSize(500,500);
    //Action
    f.add(area);
    area.setEditable(false);
    //Love
    f.setLayout(null);
    f.setVisible(true);
    
    }
    
    
    public static void main(String[] args) {
     new JTextAreaEx1();
    }
   
}
