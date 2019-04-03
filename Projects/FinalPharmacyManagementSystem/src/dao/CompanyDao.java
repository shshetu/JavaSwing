/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import pojo.Company;

/**
 *
 * @author User
 */
public interface CompanyDao {

    //crude operation
    void createTable();

    void insert(Company company);

    void update(Company company);

    void delete(Company company);

    //Verification
    Company getCompanyById(int id);

    Company getCompanyByName(String name);

    ///Get data
    List<Company> getCompany();

}
