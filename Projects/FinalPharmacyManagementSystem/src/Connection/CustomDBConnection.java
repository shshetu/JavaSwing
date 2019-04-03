/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shshe
 */
public class CustomDBConnection {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharm", "root", "1234");
            System.out.println("Connected to the database pharm!");
        } catch (SQLException ex) {
            Logger.getLogger(CustomDBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
