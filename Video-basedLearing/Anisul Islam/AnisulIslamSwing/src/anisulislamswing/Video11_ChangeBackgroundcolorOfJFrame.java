/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulislamswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author shshe
 */
public class Video11_ChangeBackgroundcolorOfJFrame extends JFrame{
    private ImageIcon icon;
    private Container c;
    Video11_ChangeBackgroundcolorOfJFrame(){
    initComponents();
    }
    
    public void initComponents(){
    c = this.getContentPane();
    c.setBackground(Color.magenta);
    
    //set image icon
   icon = new ImageIcon(getClass().getResource("happyIcon.png"));
   this.setIconImage(icon.getImage());
    
    }
    
    public static void main(String[] args) {
        //Create Object
        Video11_ChangeBackgroundcolorOfJFrame f = new Video11_ChangeBackgroundcolorOfJFrame();
        
        //Location
        f.setBounds(100,100,400,400);
        
        //Action
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Love
        f.setLayout(null);
        f.setVisible(true);
    }
}
