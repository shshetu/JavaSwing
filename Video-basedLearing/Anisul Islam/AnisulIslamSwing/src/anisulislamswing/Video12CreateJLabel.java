/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anisulislamswing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author shshe
 */
public class Video12CreateJLabel extends JFrame{
//Declare container object,JLabel object
private Container c;
private JLabel l;
private JLabel passLevel;

//constructor
    Video12CreateJLabel(){
    initComponents();
    }
    
    //Create a special method
    public void initComponents(){
  //create object
  c= this.getContentPane();
  l = new JLabel();
  passLevel = new JLabel("Enter your password: ");
  //Location
 l.setBounds(100,100,100,50);
 passLevel.setBounds(100,160,150,50); //100+ 50 = 150
  //Action
  c.add(l);
  c.add(passLevel);
  
  l.setText("Enter your name:");
  c.setBackground(Color.blue);
  //Love
  c.setLayout(null);
    }
    //main method
    public static void main(String[] args) {
        //We will create only JFrame here
        //create object
        Video12CreateJLabel f = new Video12CreateJLabel();
        
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
