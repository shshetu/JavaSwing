/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pharmacymanagement.Connection.CustomDBConnection;
import pharmacymanagement.Dao.InsertCompayDao;
import pharmacymanagement.Pojo.InsertCompany;

/**
 *
 * @author shshe
 */
public class InsertCompanyDaoImp implements InsertCompayDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists insertcompany(companyName varchar(20) primary key,companyCountry varchar(20),companyEmail varchar(20),companyContactNo varchar(20),companyAddress varchar(20))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("insertcompany table Created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(InsertCompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(InsertCompany insertCompany) {
        String sql = "insert into insertcompany values(?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, insertCompany.getCompanyName());
            pstm.setString(2, insertCompany.getCompanyCountry());
            pstm.setString(3, insertCompany.getCompanyEmail());
            pstm.setString(4, insertCompany.getCompanyContactNo());
            pstm.setString(5, insertCompany.getCompanyAddress());
            pstm.executeUpdate();
            System.out.println("Data inserted into insertCompany table successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(InsertCompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
