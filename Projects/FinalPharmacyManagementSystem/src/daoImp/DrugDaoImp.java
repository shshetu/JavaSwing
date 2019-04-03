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
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Drug drug) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Drug drug) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Drug getDrugByDrugSerial(int drug_serial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Drug getDrugByDrugName(String drug_name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Drug getDrugByDrugType(String drug_type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Drug getDrugByDrugBarcode(String drug_barcode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Drug> getDrug() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
