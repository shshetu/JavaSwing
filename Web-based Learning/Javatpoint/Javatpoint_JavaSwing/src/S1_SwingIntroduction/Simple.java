/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S1_SwingIntroduction;

//Association : inside consturctor => Creating Object of JFrame

import javax.swing.JButton;
import javax.swing.JFrame;

public class Simple {
    //creating default constuctor
    //declaring the instance variable for JFrame class
    JFrame f;
    Simple(){
   //creating object
   f = new JFrame();
        JButton b = new JButton("Click");
        
        //set location
        b.setBounds(130,100,100,40); //x axis, y axis, width, height
        f.setSize(400,500); //x axis, y axis
         
        //add the button object to the JFrame object
        f.add(b);
        
        //Love
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Simple();
    }
}
