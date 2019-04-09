/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import Connection.CustomDBConnection;
import dao.SalesDao;
import static daoImp.SummaryDaoImp.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Company;
import pojo.Sales;

/**
 *
 * @author shshe
 */
public class SalesDaoImp implements SalesDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {

        String sql = "create table if not exists sales(sales_id int(30) auto_increment,drug_name varchar(30),drug_type varchar(30),drug_barcode varchar(30),drug_dose varchar(30),drug_code varchar(30), buy_price double,sell_price double ,com_id int(30),pro_date date,exp_date date,exp_time varchar(30),validity varchar(30),drug_tax double,drug_place varchar(30),total_qty int(30),available_qty int(30),sold_qty int(30),sell_date date,sell_time varchar(30),foreign key(com_id) references company(company_id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("sales table is created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Sales s) {
        //drug_id int(30) auto_increment,drug_name varchar(30),drug_type varchar(30),drug_barcode varchar(30),drug_code varchar(30),double buy_price,double sell_price,com_id int(30),pro_date date,exp_date date,exp_time varchar(30),validity varchar(30),drug_tax double,drug_place varchar(30),total_qty int(30),available_qty int(30),sold_qty int(30)
        String sql = "insert into sales(drug_name,drug_type,drug_barcode,drug_dose,drug_code,buy_price,sell_price,com_id,pro_date,exp_date,exp_time,validity,drug_tax,drug_place,total_qty,available_qty,sold_qty,sell_date,sell_time) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, s.getDrug_name());
            pstm.setString(2, s.getDrug_type());
            pstm.setString(3, s.getDrug_barcode());
            pstm.setString(4, s.getDrug_dose());
            pstm.setString(5, s.getDrug_code());
            pstm.setDouble(6, s.getBuy_price());
            pstm.setDouble(7, s.getSell_price());
            pstm.setInt(8, s.getCompany().getCompany_id());
            pstm.setDate(9, s.getProduction_date());
            pstm.setDate(10, s.getExpire_date());
            pstm.setString(11, s.getExpire_time());
            pstm.setString(12, s.getValidity());
            pstm.setDouble(13, s.getDrug_tax());
            pstm.setString(14, s.getDrug_place());
            pstm.setInt(15, s.getTotal_qty());
            pstm.setInt(16, s.getAvailable_qty());
            pstm.setInt(17, s.getSold_qty());
            pstm.setDate(18, s.getSell_date());
            pstm.setString(19, s.getSell_time());
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
            while (rs.next()) {
                //id,barcode,name,type,dose ,quantity ,buy_price ,sell_price ,amount ,buy_date ,buy_time ,profit
                   
//                String sql = "create table if not exists sales(sales_id int(30) auto_increment,drug_name varchar(30),drug_type varchar(30),drug_barcode varchar(30),drug_dose varchar(30),drug_code varchar(30), buy_price double,sell_price double ,com_id int(30),pro_date date,exp_date date,exp_time varchar(30),validity varchar(30),drug_tax double,drug_place varchar(30),total_qty int(30),available_qty int(30),sold_qty int(30),sell_date date,sell_time varchar(30),foreign key(com_id) references company(company_id))";
    //    public Sales(int drug_id, String drug_name, String drug_type, String drug_barcode, String drug_dose, String drug_code, double buy_price, double sell_price, Company company, Date production_date, Date expire_date, String expire_time, String validity, double drug_tax, String drug_place, int total_qty, int available_qty, int sold_qty, Date sell_date, String sell_time) {

Sales sales = new Sales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), 0, 0, company, production_date, expire_date, sql, sql, 0, sql, 0, 0, 0, sell_date, sql);
                list.add(sales);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

}
