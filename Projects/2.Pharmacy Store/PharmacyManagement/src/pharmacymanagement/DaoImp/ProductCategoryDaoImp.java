/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.DaoImp;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pharmacymanagement.Connection.CustomDBConnection;
import pharmacymanagement.Dao.ProductCategoryDao;
import pharmacymanagement.Pojo.ProductCategory;

/**
 *
 * @author shshe
 */
public class ProductCategoryDaoImp implements ProductCategoryDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists productcategory(product_id int(11) auto_increment primary key,product_name varchar(20))";
        try {
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("productcategory table is created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void insert(ProductCategory pc) {

        String sql = "insert into productcategory(product_name) values(?)";
        try {
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, pc.getProductCategoryName());
            pstm.executeUpdate();
            System.out.println("Data inserted into productCategory table successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(ProductCategory pc) {

        String sql = "update productcategory set product_name=? where product_id = ?";
        try {
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, pc.getProductCategoryName());
            pstm.setInt(2, pc.getProductId());
            pstm.executeUpdate();
            System.out.println("Data updated into productCategory table successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(ProductCategory pc) {

        String sql = "delete from productcategory where product_id=?";
        try {
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, pc.getProductId());
            pstm.executeUpdate();
            System.out.println("Data inserted into productCategory table successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<ProductCategory> getProductCategory() {
        List<ProductCategory> list = new ArrayList<>();

        String sql = "select * from productcategory";
        try {
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ProductCategory pc = new ProductCategory(rs.getInt(1), rs.getString(2));
                list.add(pc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public ProductCategory getProductCategorybyId(int id) {

        ProductCategory pc = null;

        String sql = "select * from productcategory where product_id=?";
        try {
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                pc = new ProductCategory(rs.getInt(1), rs.getString(2));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pc;
    }

    @Override
    public ProductCategory getProductCategorybyName(String productName) {

        ProductCategory pc = null;

        String sql = "select * from productcategory where product_name=?";
        try {
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, productName);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                pc = new ProductCategory(rs.getInt(1), rs.getString(2));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductCategoryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pc;
    }

}
