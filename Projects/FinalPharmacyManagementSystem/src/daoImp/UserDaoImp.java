/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import Connection.CustomDBConnection;
import dao.UserDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.User;

/**
 *
 * @author shshe
 */
public class UserDaoImp implements UserDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists user(user_id int(20) auto_increment primary key,role_name varchar(30),user_name varchar(30),dob date,address varchar(30),phone int(30),salary double,pass varchar(30))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("user table is created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(User us) {
        String sql = "insert into user(role_name,user_name,dob,address ,phone,salary,pass) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, us.getRoleName());
            pstm.setString(2, us.getUserName());
            pstm.setDate(3, us.getDob());
            pstm.setString(4, us.getAddress());
            pstm.setInt(5, us.getPhone());
            pstm.setDouble(6, us.getSalary());
            pstm.setString(7, us.getPass());
            pstm.executeUpdate();
            System.out.println("Data is inserted successfully into user table!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(User us) {
        //updated by user id

        String sql = "update user set role_name = ?,user_name =?,dob =?,address=? ,phone =?,salary =?,pass=? where user_id =?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, us.getRoleName());
            pstm.setString(2, us.getUserName());
            pstm.setDate(3, us.getDob());
            pstm.setString(4, us.getAddress());
            pstm.setInt(5, us.getPhone());
            pstm.setDouble(6, us.getSalary());
            pstm.setString(7, us.getPass());
            pstm.setInt(8, us.getUserID());
            pstm.executeUpdate();
            System.out.println("Data is updated successfully into user table!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updatePass(User us) {
        //updated by user id

        String sql = "update user set pass=? where user_name =?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, us.getPass());
            pstm.setString(2, us.getUserName());
            pstm.executeUpdate();
            System.out.println("Data is updated successfully into user table!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(User us) {

        //deleted by user id
        String sql = "delete from user where user_id =?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, us.getUserID());
            pstm.executeUpdate();
            System.out.println("Data is deleted successfully from user table!");
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        String sql = "select * from user where user_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8));

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    @Override
    public User getUserByUserName(String name) {

        User user = null;
        String sql = "select * from user where user_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8));

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    @Override
    public User getUserByPhone(int phone) {

        User user = null;
        String sql = "select * from user where phone = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, phone);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8));

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    @Override
    public List<User> getUser() {
        List<User> list = new ArrayList<>();
        String sql = "select * from user";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8));
                list.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
