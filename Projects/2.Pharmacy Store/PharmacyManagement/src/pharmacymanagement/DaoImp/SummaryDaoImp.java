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
import pharmacymanagement.Dao.SummaryDao;
import pharmacymanagement.Pojo.InsertCompany;
import pharmacymanagement.Pojo.ProductCategory;
import pharmacymanagement.Pojo.Summary;

/**
 *
 * @author shshe
 */
public class SummaryDaoImp implements SummaryDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists summary(id int(20) auto_increment primary key,product_name varchar(20),product_code varchar(20),medicine_group varchar(20),com_id int(20),p_id int(20),available_qty int(20),sold_qty int(20),price_per_unit double,buy_sell_date date)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Summary table is created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Summary summary) {
        String sql = "insert into summary(product_name,product_code,medicine_group,com_id,p_id,available_qty,sold_qty,price_per_unit,buy_sell_date) values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, summary.getProductName());
            pstm.setString(2, summary.getProductCode());
            pstm.setString(3, summary.getMedicineGroup());
            pstm.setInt(4, summary.getCompany().getId());
            pstm.setInt(5, summary.getProductCategory().getProductId());
            pstm.setInt(6, summary.getAvailableQty());
            pstm.setInt(7, summary.getSoldQty());
            pstm.setDouble(8, summary.getPricePerUnit());
            pstm.setDate(9, summary.getDate());
            pstm.executeUpdate();
            System.out.println("Data is successfully inserted into summary table!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Summary getSummaryByProductCode(String productCode) {
        
        Summary summary = null;
        String sql = "select * from summary where product_code = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, productCode);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return summary;
    }

    @Override
    public List<Summary> getSummary() {
        List<Summary> list = new ArrayList<>();
        String sql = "select * from summary";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
     Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), new InsertCompany(rs.getInt(5)), new ProductCategory(rs.getString(6)), 0, 0, 0, date);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
