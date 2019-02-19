/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_18_02_2019;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
    itemAbout.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            new About().setVisible(true);
        }
    });
  
    
    file.add(itemDashboard);
    file.add(itemAbout);
    menuBar.add(file);
    menuBar.add(help);
    menuBar.add(team);
    f.setJMenuBar(menuBar);
    f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    return menuBar;
    }
}
