/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author User
 */
public class CommonMenu {
    public static JMenuBar getCommonMenu(JFrame f){
    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu help = new JMenu("Help");
    JMenu team = new JMenu("Team");
    //adding Item in Team
    
    ///adding Item in Dashboard
    JMenuItem itemDashboard = new JMenuItem("Dashboard");
    itemDashboard.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            new Dashboard().setVisible(true);
         }
    }); 
    JMenuItem itemAbout = new JMenuItem("About");
    itemAbout.setAccelerator(KeyStroke.getKeyStroke('A',InputEvent.CTRL_DOWN_MASK));
    itemAbout.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            new About().setVisible(true);
        }
    });
  JMenuItem itemExit = new JMenuItem("Exit");
  itemExit.setAccelerator(KeyStroke.getKeyStroke('E',InputEvent.CTRL_DOWN_MASK));
  itemExit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            new Login().setVisible(true);
        }
    }); 
    
    file.add(itemDashboard);
    file.add(itemAbout);
    file.add(itemExit);
    menuBar.add(file);
    menuBar.add(help);
    menuBar.add(team);
    f.setJMenuBar(menuBar);
    f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    return menuBar;
    }
}
