/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPassword;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

/**
 *
 * @author User
 */
public class JPassEx {
    public static void main(String[] args) {
        //Create Object
        JFrame f = new JFrame("Password Field Example");
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Password");
        
        ///Location
        l1.setBounds(20,100,80,30);
        value.setBounds(100,100,100,30);
        ///Action
        f.add(value);
        f.add(l1);
        
        //LOVE
        f.setLayout(null);
        f.setVisible(false);
        
    }
   
}
