/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulislamswing;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author shshe
 */
public class Video10_ChangeJFrameIcon extends JFrame{
    private ImageIcon icon;
    Video10_ChangeJFrameIcon(){
    initComponents();
    }
    //initComponents
    public void initComponents(){
    icon = new ImageIcon(getClass().getResource("happyIcon.jpg"));
    this.setIconImage(icon.getImage());
    
    }
    
    //Main method
    public static void main(String[] args) {
    ///Create object
        Video10_ChangeJFrameIcon f = new Video10_ChangeJFrameIcon();
        //Location
        f.setBounds(100,100,300,300);
        //Action
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Love
        //f.setLayout(null);
        f.setVisible(true);
    }

    
}
