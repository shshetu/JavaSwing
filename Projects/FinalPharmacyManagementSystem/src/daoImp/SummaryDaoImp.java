/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import Connection.CustomDBConnection;
import dao.SummaryDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Company;
import pojo.Summary;

/**
 *
 * @author shshe
 */
public class SummaryDaoImp implements SummaryDao {

    static Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists summary(drug_id int(30) auto_increment primary key,drug_name varchar(30),drug_type varchar(30),drug_barcode varchar(30),drug_dose varchar(30),drug_code varchar(30), buy_price double,sell_price double ,com_id int(30),pro_date date,exp_date date,exp_time varchar(30),validity varchar(30),drug_tax double,drug_place varchar(30),total_qty int(30),available_qty int(30),sold_qty int(30),foreign key(com_id) references company(company_id))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("summary table is created successfully!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Summary sum) {
        //drug_id int(30) auto_increment,drug_name varchar(30),drug_type varchar(30),drug_barcode varchar(30),drug_code varchar(30),double buy_price,double sell_price,com_id int(30),pro_date date,exp_date date,exp_time varchar(30),validity varchar(30),drug_tax double,drug_place varchar(30),total_qty int(30),available_qty int(30),sold_qty int(30)
        String sql = "insert into summary(drug_name,drug_type,drug_barcode,drug_dose,drug_code,buy_price,sell_price,com_id,pro_date,exp_date,exp_time,validity,drug_tax,drug_place,total_qty,available_qty,sold_qty) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, sum.getDrug_name());
            pstm.setString(2, sum.getDrug_type());
            pstm.setString(3, sum.getDrug_barcode());
            pstm.setString(4, sum.getDrug_dose());
            pstm.setString(5, sum.getDrug_code());
            pstm.setDouble(6, sum.getBuy_price());
            pstm.setDouble(7, sum.getSell_price());
            pstm.setInt(8, sum.getCompany().getCompany_id());
            pstm.setDate(9, sum.getProduction_date());
            pstm.setDate(10, sum.getExpire_date());
            pstm.setString(11, sum.getExpire_time());
            pstm.setString(12, sum.getValidity());
            pstm.setDouble(13, sum.getDrug_tax());
            pstm.setString(14, sum.getDrug_place());
            pstm.setInt(15, sum.getTotal_qty());
            pstm.setInt(16, sum.getAvailable_qty());
            pstm.setInt(17, sum.getSold_qty());
            pstm.executeUpdate();
            System.out.println("Data is inserted successfully into summary table!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Summary sum) {
        String sql = "update summary set drug_name = ?,drug_type = ?,drug_barcode = ?,drug_dose = ?,drug_code = ?,buy_price = ?,sell_price = ?,com_id = ?,pro_date = ?,exp_date = ?,exp_time = ?,validity = ?,drug_tax = ?,drug_place = ?,total_qty = ?,available_qty = ?,sold_qty = ? where drug_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, sum.getDrug_name());
            pstm.setString(2, sum.getDrug_type());
            pstm.setString(3, sum.getDrug_barcode());
            pstm.setString(4, sum.getDrug_dose());
            pstm.setString(5, sum.getDrug_code());
            pstm.setDouble(6, sum.getBuy_price());
            pstm.setDouble(7, sum.getSell_price());
            pstm.setInt(8, sum.getCompany().getCompany_id());
            pstm.setDate(9, sum.getProduction_date());
            pstm.setDate(10, sum.getExpire_date());
            pstm.setString(11, sum.getExpire_time());
            pstm.setString(12, sum.getValidity());
            pstm.setDouble(13, sum.getDrug_tax());
            pstm.setString(14, sum.getDrug_place());
            pstm.setInt(15, sum.getTotal_qty());
            pstm.setInt(16, sum.getAvailable_qty());
            pstm.setInt(17, sum.getSold_qty());
            pstm.setInt(18, sum.getDrug_id());
            pstm.executeUpdate();
            System.out.println("Data is updated successfully into summary table!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Summary sum) {
        String sql = "delete from summary where drug_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, sum.getDrug_id());
            pstm.executeUpdate();
            System.out.println("Data is successfully deleted from the summary table!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Summary getSummaryByDrugId(int id) {

        Summary sum = null;
        String sql = "select * from summary where drug_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));

            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sum;
    }

    @Override
    public Summary getSummaryByDrugName(String name) {

        Summary sum = null;
        String sql = "select * from summary where drug_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));

            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sum;
    }

    @Override
    public Summary getSummaryByDrugCode(String drug_code) {

        Summary sum = null;
        String sql = "select * from summary where drug_code = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, drug_code);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));

            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sum;
    }

    @Override
    public List<Summary> getSummary() {
        List<Summary> list = new ArrayList<>();
        String sql = "select * from summary";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                list.add(sum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;

    }

    @Override
    public List<Summary> getSummarySelectingName() {

        List<Summary> list = new ArrayList<>();
        String sql = "select * from summary order by drug_name";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                list.add(sum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public List<Summary> getSummarySelectingType() {

        List<Summary> list = new ArrayList<>();
        String sql = "select * from summary order by drug_type";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                list.add(sum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public List<Summary> getSummarySelectingExpiration() {

        List<Summary> list = new ArrayList<>();
        String sql = "select * from summary order by exp_date";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                list.add(sum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    ///for summary table
    @Override
    public void updateSum(Summary sum) {

        String sql = "update summary set total_qty = ?,available_qty = ?,sold_qty = ? where drug_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, sum.getTotal_qty());
            pstm.setInt(2, sum.getAvailable_qty());
            pstm.setInt(3, sum.getSold_qty());
            pstm.setString(4, sum.getDrug_name());
            pstm.executeUpdate();
            System.out.println("Data is updated again successfully into summary table!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Summary> getSummarySearchingName(String name) {

        List<Summary> list = new ArrayList<>();
        String sql = "select * from summary where drug_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                list.add(sum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public List<Summary> getSummarySearchingBarcode(String name) {

        List<Summary> list = new ArrayList<>();
        String sql = "select * from summary where drug_barcode = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                list.add(sum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public void updatePlace(Summary sum) {

        String sql = "update summary set drug_place = ? where drug_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, sum.getDrug_place());
            pstm.setString(2, sum.getDrug_name());
            pstm.executeUpdate();
            System.out.println("Data is updated again successfully into summary table!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updatePrice(Summary sum) {

        String sql = "update summary set sell_price =? where drug_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setDouble(1, sum.getSell_price());
            pstm.setString(2, sum.getDrug_name());
            pstm.executeUpdate();
            System.out.println("price is updated again successfully into summary table!");
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Summary> searchDrug(String name) {

        List<Summary> list = new ArrayList<>();
        //  String sql = "select * from summary where drug_name like "+"'"+name+"%"+"'";
        String sql = "select * from summary where drug_name like " + "'n%'";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                list.add(sum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(searchDrug("n").size());
    }

    @Override
    public List<Summary> getSummaryExpireDate() {

        List<Summary> list = new ArrayList<>();
        //  String sql = "select * from summary where drug_name like "+"'"+name+"%"+"'";
        String sql = "select * from summary where exp_date< curdate()";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                list.add(sum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    @Override
    public List<Summary> getSummaryAlmostFinished() {

        List<Summary> list = new ArrayList<>();
        //  String sql = "select * from summary where drug_name like "+"'"+name+"%"+"'";
        String sql = "select * from summary where available_qty<=5";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Summary sum = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8), new Company(rs.getInt(9)), rs.getDate(10), rs.getDate(11), rs.getString(12), rs.getString(13), rs.getDouble(14), rs.getString(15), rs.getInt(16), rs.getInt(17), rs.getInt(18));
                list.add(sum);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SummaryDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
}
