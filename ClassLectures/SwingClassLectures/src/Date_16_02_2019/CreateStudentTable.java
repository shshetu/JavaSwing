/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_16_02_2019;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class  CreateStudentTable {
static Connection con = DblConnection.getDbConnection();
public static void createStudentTable(){
String sql = "create table student(id int(11) primary key auto_increment,name varchar(50) not null)";
String sql1 = "create table department(id int(11) primary key auto_increment,name varchar(50) not null)";
   
try {
//        PreparedStatement ps = con.prepareStatement(sql);
//        ps.execute();
        PreparedStatement ps1 = con.prepareStatement(sql1);
        ps1.execute();
       // System.out.println("Student Table Created");
        System.out.println("Department Table Created");
    } catch (SQLException ex) {
        Logger.getLogger(CreateStudentTable.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    public static void main(String[] args) {
        createStudentTable();
    }
}
