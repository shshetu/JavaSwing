/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalesManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class RoleDaoImp implements RoleDao {

    Connection conn = CustomDBConnection.getDBConnection();

    @Override
    public void save(Role role) {
      String sql = "insert into role((role_name) values(?))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, role.getRoleName());
            pstm.executeUpdate();
            System.out.println("Insert Success!");
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getRoleById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getRoleByRoleNmae(String roleName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> getRoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void createTable() {
        String sql = "create table (role int(2) auto_increment primary key,role_name varchar(20) not null unique)";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.execute();
            
            System.out.println("Table created");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
