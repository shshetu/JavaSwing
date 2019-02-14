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
public class SI2_Simple {
    //creating constructor for the class
    SI2_Simple(){
    JFrame f = new JFrame();
    JButton b = new JButton("click");
    b.setBounds(130,100,100,40);
    f.setSize(400,500);
    f.add(b); //adding button in frame object
    
    ///set Layout null
    f.setLayout(null);
    f.setVisible(true);
    }
    public static void main(String[] args) {
        new SI2_Simple();
    }
    
}
