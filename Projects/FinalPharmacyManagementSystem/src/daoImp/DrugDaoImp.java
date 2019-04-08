/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import Connection.CustomDBConnection;
import dao.DrugDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Company;
import pojo.Drug;

/**
 *
 * @author User
 */
public class DrugDaoImp implements DrugDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists drug(drug_serial int(30) auto_increment primary key,drug_name varchar(30),drug_type varchar(30),drug_barcode varchar(30),drug_dose varchar(30),drug_code varchar(30),drug_buy_price double,drug_sell_price double,com_id int(20),production_date date,expire_date date,expire_time varchar(30),drug_tax double,drug_place varchar(30),drug_quantity int(30),foreign key(com_id) references company(company_id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("drug table is created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(DrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Drug drug) {
        String sql = "insert into drug(drug_name,drug_type,drug_barcode,drug_dose,drug_code,drug_buy_price,drug_sell_price,com_id,production_date,expire_date,expire_time,drug_tax,drug_place,drug_quantity) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, drug.getDrug_name());
            pstm.setString(2, drug.getDrug_type());
            pstm.setString(3, drug.getDrug_barcode());
            pstm.setString(4, drug.getDrug_dose());
            pstm.setString(5, drug.getDrug_code());
            pstm.setDouble(6, drug.getDrug_buy_price());
            pstm.setDouble(7, drug.getDrug_sell_price());

            pstm.setInt(8, drug.getCompany().getCompany_id());
            pstm.setDate(9, drug.getProduction_date());
            pstm.setDate(10, drug.getExpire_date());
            pstm.setString(11, drug.getExpire_time());
            pstm.setDouble(12, drug.getDrug_tax());
            pstm.setString(13, drug.getDrug_place());
            pstm.setInt(14, drug.getDrug_quantity());
            pstm.executeUpdate();
            System.out.println("Data is successfully inserted into drug table!");
        } catch (SQLException ex) {
            Logger.getLogger(DrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //String drug_name, String drug_type, String drug_barcode, String drug_dose, String drug_code, double drug_buy_price, double drug_sell_price, Company company, Date production_date, Date expire_date, String expire_time, double drug_tax, String drug_place, int drug_quantity)
    @Override
    public void update(Drug drug) {
        String sql = "update drug set drug_name = ?, drug_type = ?, drug_barcode = ?, drug_dose = ?, drug_code = ?, drug_buy_price = ?, drug_sell_price = ?, com_id = ?, production_date = ?,expire_date = ?, expire_time = ?, drug_tax = ?, drug_place = ?, drug_quantity = ? where drug_serial = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, drug.getDrug_name());
            pstm.setString(2, drug.getDrug_type());
            pstm.setString(3, drug.getDrug_barcode());
            pstm.setString(4, drug.getDrug_dose());
            pstm.setString(5, drug.getDrug_code());
            pstm.setDouble(6, drug.getDrug_buy_price());
            pstm.setDouble(7, drug.getDrug_sell_price());

            pstm.setInt(8, drug.getCompany().getCompany_id());
            pstm.setDate(9, drug.getProduction_date());
            pstm.setDate(10, drug.getExpire_date());
            pstm.setString(11, drug.getExpire_time());
            pstm.setDouble(12, drug.getDrug_tax());
            pstm.setString(13, drug.getDrug_place());
            pstm.setInt(14, drug.getDrug_quantity());
            pstm.setInt(14, drug.getDrug_serial());
            pstm.executeUpdate();
            System.out.println("Data is successfully updated into drug table!");
        } catch (SQLException ex) {
            Logger.getLogger(DrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Drug drug) {
        String sql = "delete from drug where drug_serial = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, drug.getDrug_serial());
            pstm.executeUpdate();
            System.out.println("Data is deleted successfully from drug table!");
        } catch (SQLException ex) {
            Logger.getLogger(DrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Drug getDrugByDrugSerial(int drug_serial) {
        Drug drug = null;
        String sql = "select * from drug where drug_serial = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, drug_serial);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                drug = new Drug(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getDouble(13), rs.getString(14), rs.getInt(15));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return drug;
    }

    @Override
    public Drug getDrugByDrugName(String drug_name) {

        Drug drug = null;
        String sql = "select * from drug where drug_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, drug_name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                drug = new Drug(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getDouble(13), rs.getString(14), rs.getInt(15));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return drug;
    }

    @Override
    public Drug getDrugByDrugType(String drug_type) {

        Drug drug = null;
        String sql = "select * from drug where drug_type = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, drug_type);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                drug = new Drug(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getDouble(13), rs.getString(14), rs.getInt(15));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return drug;
    }

    @Override
    public Drug getDrugByDrugBarcode(String drug_barcode) {

        Drug drug = null;
        String sql = "select * from drug where drug_barcode = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, drug_barcode);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                drug = new Drug(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getDouble(13), rs.getString(14), rs.getInt(15));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return drug;
    }
    //String drug_name, String drug_type, String drug_barcode, String drug_dose, String drug_code, double drug_buy_price, double drug_sell_price, Company company, Date production_date, Date expire_date, String expire_time, double drug_tax, String drug_place, int drug_quantity)

    @Override
    public List<Drug> getDrug() {
        List<Drug> list = null;
        String sql = "select * from drug";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Drug drug = new Drug(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getDouble(13), rs.getString(14), rs.getInt(15));
                list.add(drug);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

   
}
