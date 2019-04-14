/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import pojo.Login;
import pojo.User;

/**
 *
 * @author User
 */
public interface LoginDao {
    User findByUsernameAndPassword(String username, String password);
    //crude operation
    void createTable();
    void insert(Login login);
    void update(Login login);
//get data from the database
    List<Login> getLogin(); 
    List<Login> getLoginUsername(); 
    
    //validation
    Login getLoginByLoginTime(String login_time);
}
