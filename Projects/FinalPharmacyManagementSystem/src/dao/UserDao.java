/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import pojo.User;

/**
 *
 * @author shshe
 */
public interface UserDao {
    //crude
    void createTable();
    void insert(User us);
    void update(User us);
    void delete(User us);
    ///Verify
    User getUserById(int id);
    User getUserByUserName(String name);
    User getUserByPhone(int phone);
    
    //get data from database
    List<User> getUser();
    
    
}
