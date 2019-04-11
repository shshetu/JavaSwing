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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
}
