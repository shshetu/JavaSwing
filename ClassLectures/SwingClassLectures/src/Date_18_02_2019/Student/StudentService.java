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
public class StudentService implements CommonDAO{
static Connection con = DBConnection.getDbConnection();
    @Override
    public void insert(Student obj) {
        String sql = "insert into Student(name) values(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,obj.getName());
            ps.executeUpdate();
        } catch (Exception e) {
        e.printStackTrace();
        }
    }

    @Override
    public void update(Student obj) {
        String sql = "update Student set name=? where id=?";
       
       
    }

    @Override
    public void delete(Student obj) {
    }
    
}
