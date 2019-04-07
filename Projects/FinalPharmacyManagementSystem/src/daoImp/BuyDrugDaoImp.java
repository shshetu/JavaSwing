/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import Connection.CustomDBConnection;
import dao.BuyDrugDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.BuyDrug;
import pojo.Company;

/**
 *
 * @author shshe
 */
public class BuyDrugDaoImp implements BuyDrugDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists buydrug(serial int(30) auto_increment primary key, drug_barcode varchar(30),drug_name varchar(30),drug_type varchar(30),com_id int(20),quantity int(20),buy_price double,amount double,foreign key(com_id) references company(company_id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("buydrug table is created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(BuyDrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(BuyDrug buy_drug) {

        String sql = "insert into buydrug(drug_barcode,drug_name,drug_type,com_id,quantity,buy_price,amount) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, buy_drug.getBar_code());
            pstm.setString(2, buy_drug.getDrug_name());
            pstm.setString(3, buy_drug.getDrug_type());
            pstm.setInt(4, buy_drug.getCompany().getCompany_id());
            pstm.setInt(5, buy_drug.getQuantity());
            pstm.setDouble(6, buy_drug.getBuy_price());
            pstm.setDouble(7, buy_drug.getAmount());
            pstm.execute();
            System.out.println("Data is inserted into buydrug table successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(BuyDrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(BuyDrug buy_drug) {
        String sql = "update buydrug set drug_barcode=?,drug_name=?,drug_type=?,com_id=?,quantity=?,buy_price=?,amount=? where serial =?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, buy_drug.getBar_code());
            pstm.setString(2, buy_drug.getDrug_name());
            pstm.setString(3, buy_drug.getDrug_type());
            pstm.setInt(4, buy_drug.getCompany().getCompany_id());
            pstm.setInt(5, buy_drug.getQuantity());
            pstm.setDouble(6, buy_drug.getBuy_price());
            pstm.setDouble(7, buy_drug.getAmount());
            pstm.setInt(8, buy_drug.getSerial());
            pstm.execute();
            System.out.println("Data is updated into buydrug table successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(BuyDrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(BuyDrug buy_drug) {

        String sql = "delete from buydrug where serial =?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, buy_drug.getSerial());
            pstm.execute();
            System.out.println("Data is delete from buydrug table successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(BuyDrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public BuyDrug getBuyDrugBySerial(int serial) {

        BuyDrug buy_drug = null;
        String sql = "select * from buydrug where serial = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, serial);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                buy_drug = new BuyDrug(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), new Company(rs.getInt(5)), rs.getInt(6), rs.getDouble(7), rs.getDouble(8));

            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyDrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buy_drug;
    }

    @Override
    public BuyDrug getBuyDrugByBarcode(String barcode) {

        BuyDrug buy_drug = null;
        String sql = "select * from buydrug where drug_barcode= ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, barcode);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                buy_drug = new BuyDrug(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), new Company(rs.getInt(5)), rs.getInt(6), rs.getDouble(7), rs.getDouble(8));

            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyDrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buy_drug;
    }

    @Override
    public BuyDrug getBuyDrugByDrugName(String drug_name) {

        BuyDrug buy_drug = null;
        String sql = "select * from buydrug where drug_name= ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, drug_name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                buy_drug = new BuyDrug(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), new Company(rs.getInt(5)), rs.getInt(6), rs.getDouble(7), rs.getDouble(8));

            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyDrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buy_drug;
    }

    @Override
    public List<BuyDrug> getBuyDrug() {
        List<BuyDrug> list = null;
        String sql = "select * from buydrug";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                BuyDrug buy_drug = new BuyDrug(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), new Company(rs.getInt(5)), rs.getInt(6), rs.getDouble(7), rs.getDouble(8));
                list.add(buy_drug);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyDrugDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
