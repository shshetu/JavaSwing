/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImp;

import Connection.CustomDBConnection;
import dao.CompanyDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.Company;

/**
 *
 * @author User
 */
public class CompanyDaoImp implements CompanyDao {

    Connection conn = CustomDBConnection.getConnection();

    @Override
    public void createTable() {
        String sql = "create table if not exists company(company_id int(20) auto_increment primary key,company_name varchar(30),company_country varchar(30),company_email varchar(30),company_contact int(30),company_address varchar(30))";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("company table is successfully created!");
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void insert(Company company) {
        //String company_name, String company_country, String comapany_email, String comapany_contact, String comapany_address
        String sql = "insert into company(company_name,company_country,company_email,company_contact,company_address) values(?,?,?,?,?)";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, company.getCompany_name());
            pstm.setString(2, company.getCompany_country());
            pstm.setString(3, company.getComapany_email());
            pstm.setInt(4, company.getComapany_contact());
            pstm.setString(5, company.getComapany_address());
            pstm.executeUpdate();
            System.out.println("Data is successfully inserted into company table!");

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Company company) {

        //String company_name, String company_country, String comapany_email, String comapany_contact, String comapany_address
        String sql = "update company set company_name=?,company_country=?,company_email=?,company_contact=?,company_address=? where company_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, company.getCompany_id());
            pstm.executeUpdate();
            System.out.println("Data is successfully updated into company table!");

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Company company) {

        //String company_name, String company_country, String comapany_email, String comapany_contact, String comapany_address
        String sql = "delete from company where company_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, company.getCompany_id());
            pstm.executeUpdate();
            System.out.println("Data is successfully deleted from company table!");

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Company getCompanyById(int id) {

        Company com = null;
        String sql = "select * from company where company_id = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                com = new Company(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return com;
    }

    @Override
    public Company getCompanyByName(String name) {

        Company com = null;
        String sql = "select * from company where company_name = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, name);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                com = new Company(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return com;
    }

    @Override
    public List<Company> getCompany() {
        List<Company> list = new ArrayList<>();
        String sql = "select * from company";
        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Company com = new Company(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(5));
                list.add(com);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
