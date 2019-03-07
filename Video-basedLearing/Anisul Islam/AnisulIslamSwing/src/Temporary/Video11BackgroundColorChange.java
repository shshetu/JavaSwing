/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporary;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shshe
 */
public class Video11BackgroundColorChange extends JFrame{
    private Container c;
   Video11BackgroundColorChange(){
   initComponents();
   }
   
   public void initComponents(){
   c = this.getContentPane();
   c.setBackground(Color.yellow);
   }
    
    
    public static void main(String[] args) {
        //Create object
        Video11BackgroundColorChange obj = new Video11BackgroundColorChange();
        
    //Location
    obj.setBounds(300,100,500,500);
        //Action
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Love
        obj.setLayout(null);
        obj.setVisible(true);
    }
}
