/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_18_02_2019.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class CreateStudentTable {
    //connects the database
    static Connection con = DBConnection.getDbConnection();
    public static void createStudentTable(){
    String sql = "create table Student(name varchar(15) primary key)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Student Table Created!");
        } catch (Exception e) {
        e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        createStudentTable();
    }
}
