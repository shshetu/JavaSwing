/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import Connection.CustomDBConnection;
import dao.LoginDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Login;
import pojo.User;

/**
 *
 * @author User
 */
public class LoginDaoImp implements LoginDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        User user = null;
        String sql = "select * from user where user_name = ? and pass = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                //    public User(int userID, String roleName, String userName, Date dob, String Address, int phone, double salary, String pass) {

                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getString(8));

            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    @Override
    public void createTable() {
        String sql = "create table if not exists login(login_id int(30) auto_increment primary key,username varchar(30),role_name varchar(30),login_date date,login_time varchar(30),logout_time varchar(30),duration varchar(30))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("login table is created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Login login) {
        String sql = "insert into login(username,role_name,login_date,login_time,logout_time,duration) values(?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, login.getUsername());
            pstm.setString(2, login.getRole_name());
            pstm.setDate(3, login.getLogin_date());
            pstm.setString(4, login.getLogin_time());
            pstm.setString(5, login.getLogout_time());
            pstm.setString(6, login.getDuration());
            pstm.executeUpdate();
            System.out.println("Data is inserted successfully into login table!");
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Login login) {
        String sql = "update login set logout_time = ?,duration = ? where login_time =?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, login.getLogout_time());
            pstm.setString(2, login.getDuration());
            pstm.setString(3, login.getLogin_time());
            pstm.executeUpdate();
            System.out.println("login table is updated successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //username,role_name,login_date,login_time,logout_time,duration
    @Override
    public List<Login> getLogin() {
        List<Login> list = new ArrayList<>();
        String sql = "select * from login";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Login login = new Login(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(login);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    //////////////////Login User name

    public List<Login> getLoginUsername() {
        List<Login> list = new ArrayList<>();
        String sql = "select distinct username from login";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Login login = new Login(rs.getString(1));
                list.add(login);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    //////////////////////////////////////////
    @Override
    public Login getLoginByLoginTime(String login_time) {
        Login login = null;
        String sql = "select * from login where login_time = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, login_time);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                login = new Login(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return login;
    }

}
