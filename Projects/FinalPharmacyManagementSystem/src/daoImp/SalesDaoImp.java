/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import Connection.CustomDBConnection;
import dao.SalesDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Sales;

/**
 *
 * @author shshe
 */
public class SalesDaoImp implements SalesDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists sales(sales_id int(20) auto_increment,barcode varchar(30),name varchar(30),type varchar(30),dose varchar(30),quantity int(30),buy_price double,sell_price double,amount double,buy_date date,buy_time varchar(30),profit double)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Sales s) {

        String sql = "insert into sales(barcode,name,type,dose ,quantity ,buy_price ,sell_price ,amount ,buy_date ,buy_time ,profit) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, s.getBarcode());
            pstm.setString(2, s.getName());
            pstm.setString(3, s.getType());
            pstm.setString(4, s.getDose());
            pstm.setInt(5, s.getQuantity());
            pstm.setDouble(6, s.getBuy_price());
            pstm.setDouble(7, s.getSell_price());
            pstm.setDouble(8, s.getAmount());
            pstm.setDate(9, s.getDate());
            pstm.setString(10, s.getTime());
            pstm.setDouble(9,s.getProfit());
            pstm.executeUpdate();
            System.out.println("Data is inserted successfully into sales table!");
          
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Sales s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Sales s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sales getSalesByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sales> getSales() {
        List<Sales> list = new ArrayList<>();
        String sql = "select * from sales";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                //id,barcode,name,type,dose ,quantity ,buy_price ,sell_price ,amount ,buy_date ,buy_time ,profit
            Sales sales = new Sales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDouble(7),rs.getDouble(8), rs.getDouble(9),rs.getDate(10), rs.getString(11), rs.getDouble(12));
           list.add(sales);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }

}
