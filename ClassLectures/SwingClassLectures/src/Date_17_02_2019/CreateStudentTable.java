/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_17_02_2019;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class CreateStudentTable {
    static Connection con = DbConnect.getDbConnection();
    public static void createStudentTable(){
            String sql = "create table student(id int(11) primary key auto_increment,name varchar(50) not null)";

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
