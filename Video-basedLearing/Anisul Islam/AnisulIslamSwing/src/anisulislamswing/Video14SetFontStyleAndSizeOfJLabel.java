/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulislamswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author shshe
 */
public class Video14SetFontStyleAndSizeOfJLabel extends JFrame{
//Declare container object,JLabel object
private Container c;
private JLabel l;
private JLabel passLevel;
private Font font;
//constructor
    Video14SetFontStyleAndSizeOfJLabel(){
    initComponents();
    }
    
    //Create a special method
    public void initComponents(){
  //create object
  c= this.getContentPane();
  l = new JLabel();
  passLevel = new JLabel("Enter your password: ");
  font = new Font("Ariel",Font.BOLD,14);
  //Location
 l.setBounds(100,100,150,50);
 passLevel.setBounds(100,160,200,50); //100+ 50 = 150
  //Action
  c.add(l);
  c.add(passLevel);
  l.setFont(font);
  passLevel.setFont(font);
  l.setText("Enter your name:");
  c.setBackground(Color.blue);
  //Love
  c.setLayout(null);
    }
    //main method
    public static void main(String[] args) {
        //We will create only JFrame here
        //create object
        Video14SetFontStyleAndSizeOfJLabel f = new Video14SetFontStyleAndSizeOfJLabel();
        
        //Location
        f.setBounds(100,100,300,300);
        
        //Action
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("It is a title!");
        //Love
    //  f.setLayout(null);
        f.setVisible(true);
    }
}
