/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        String sql = "create table if not exists insertcompany(id int(5) auto_increment  primary key,companyName varchar(20),companyCountry varchar(20),companyEmail varchar(20),companyContactNo varchar(20),companyAddress varchar(20))";
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
        String sql = "insert into insertcompany(companyName,companyCountry,companyEmail,companyContactNo,companyAddress) values(?,?,?,?,?)";
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

    @Override
    public List<InsertCompany> getInsertCompany() {
        List<InsertCompany> list = new ArrayList<InsertCompany>();
        String sql = "select * from insertcompany";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                InsertCompany ic = new InsertCompany(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                list.add(ic);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertCompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
