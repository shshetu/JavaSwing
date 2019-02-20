/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S3_JLabel;

//Association => creating JFrame Object

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelExample1 {
    public static void main(String[] args) {
       //creating object
       JFrame f = new JFrame("JLabel Example");
       JLabel l1 = new JLabel("First Label");
       JLabel l2 = new JLabel("Second Label");
       
       //Location
       l1.setBounds(50,50,100,30);
       l2.setBounds(50,100,100,30);
       f.setSize(400,500);
       //Actions
       f.add(l1);
       f.add(l2);
       
       //Love
       f.setLayout(null);
       f.setVisible(true);
       
    }
}
