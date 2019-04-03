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
import pharmacymanagement.Dao.SalesDao;
import pharmacymanagement.Pojo.InsertCompany;
import pharmacymanagement.Pojo.ProductCategory;
import pharmacymanagement.Pojo.Sales;

/**
 *
 * @author User
 */
public class SalesDaoImp implements SalesDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {

        String sql = "create table if not exists sales(product_id int auto_increment primary key,product_name varchar(30),product_code varchar(30),medicine_group varchar(30),com_id int(20) ,p_id int(20) ,product_qty int(20),product_price double,expire_date date,dose_type varchar(30),remarks varchar(30),foreign key(com_id) references company(company_id),foreign key(p_id) references productcategory(product_id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("sales table is created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(InsertMedicineDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Sales im) {

        String sql = "insert into sales (product_name ,product_code,medicine_group,com_id,p_id,product_qty ,product_price,expire_date,dose_type,remarks) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, im.getProductName());
            pstm.setString(2, im.getProductCode());
            pstm.setString(3, im.getMedicineGroup());
            pstm.setInt(4, im.getCompany().getId());
            pstm.setInt(5, im.getProductCategory().getProductId());
            pstm.setInt(6, im.getProductQuantity());
            pstm.setDouble(7, im.getProductPrice());
            pstm.setDate(8, im.getExpireDate());
            pstm.setString(9, im.getDoseType());
            pstm.setString(10, im.getRemarks());
            pstm.executeUpdate();
            System.out.println("Data is successfully inserted into sales table!");

        } catch (SQLException ex) {
            Logger.getLogger(InsertMedicineDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Sales im) {

        String sql = "update sales set product_name = ? , product_code = ?,medicine_group=?,com_id=?,p_id=?,product_qty=?,product_price=?,expire_date=?,dose_type=?,remarks=? where product_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, im.getProductName());
            pstm.setString(2, im.getProductCode());
            pstm.setString(3, im.getMedicineGroup());
            pstm.setInt(4, im.getCompany().getId());
            pstm.setInt(5, im.getProductCategory().getProductId());
            pstm.setInt(6, im.getProductQuantity());
            pstm.setDouble(7, im.getProductPrice());
            pstm.setDate(8, im.getExpireDate());
            pstm.setString(9, im.getDoseType());
            pstm.setString(10, im.getRemarks());
            pstm.setInt(11, im.getProductId());
            pstm.executeUpdate();
            System.out.println("Data is successfully updated into sales table!");

        } catch (SQLException ex) {
            Logger.getLogger(InsertMedicineDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Sales im) {

        String sql = "delete from sales where product_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, im.getProductId());
            pstm.executeUpdate();
            System.out.println("Data is successfully deleted from sales table!");

        } catch (SQLException ex) {
            Logger.getLogger(InsertMedicineDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Sales> getSales() {
        List<Sales> list = new ArrayList<>();
        String sql = "select * from sales";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Sales im = new Sales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), new InsertCompany(rs.getInt(5)), new ProductCategory(rs.getInt(6)), rs.getInt(7), rs.getDouble(8), rs.getDate(9), rs.getString(10), rs.getString(11));
                list.add(im);
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertMedicineDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public Sales getSalesByid(int id) {
        Sales im = null;
        String sql = "select * from sales where product_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                im = new Sales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), new InsertCompany(rs.getInt(5)), new ProductCategory(rs.getInt(6)), rs.getInt(7), rs.getDouble(8), rs.getDate(9), rs.getString(10), rs.getString(11));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertMedicineDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return im;
    }

    @Override
    public Sales getSalesByProductCode(String productCode) {
        Sales im = null;
        String sql = "select * from sales where product_code = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, productCode);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                im = new Sales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), new InsertCompany(rs.getInt(5)), new ProductCategory(rs.getInt(6)), rs.getInt(7), rs.getDouble(8), rs.getDate(9), rs.getString(10), rs.getString(11));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertMedicineDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return im;
    }

    @Override
    public Sales getSalesByProductName(String productName) {

        Sales im = null;
        String sql = "select * from sales where product_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, productName);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                im = new Sales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), new InsertCompany(rs.getInt(5)), new ProductCategory(rs.getInt(6)), rs.getInt(7), rs.getDouble(8), rs.getDate(9), rs.getString(10), rs.getString(11));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InsertMedicineDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return im;
    }

}
