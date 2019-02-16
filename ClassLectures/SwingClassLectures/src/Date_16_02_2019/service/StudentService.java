/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_16_02_2019.service;

import Date_16_02_2019.DblConnection;
import Date_16_02_2019.pojo.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class StudentService implements CommonDao {

    //Sql connection
    static Connection con = DblConnection.getDbConnection();

    @Override
    public void save(Student obj) {
        String sql = "insert into student(name) values(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.executeUpdate();
            System.out.println("save success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Student obj) {
        try {
            String sql = "update student set name=? where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.setInt(2, obj.getId());
            ps.executeUpdate();
            System.out.println("Update Successful!");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void delete(Student obj) {
        try {
            String sql = "delete from student where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getId());
            ps.executeUpdate();
            System.out.println("delete Successful!");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void deleteById(int id) {
        try {
            String sql = "delete from student where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
            System.out.println("Delete Successful!");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public Student getById(int id) {
        String sql = "select * from student where id=?";
        Student student = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public List<Student> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
