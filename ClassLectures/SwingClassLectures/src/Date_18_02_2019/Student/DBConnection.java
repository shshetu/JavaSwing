/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_18_02_2019.Student;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class DBConnection {
    public static Connection getDbConnection(){
    Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1234");
            System.out.println("::Connected::");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void main(String[] args) {
        getDbConnection();
    }
}
