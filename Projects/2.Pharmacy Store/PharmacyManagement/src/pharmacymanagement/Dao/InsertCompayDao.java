/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.Dao;

import java.util.List;
import pharmacymanagement.Pojo.InsertCompany;

/**
 *
 * @author shshe
 */
public interface InsertCompayDao {
    void createTable();
    void insert(InsertCompany insertCompany);
    
    //get the list
     List<InsertCompany> getInsertCompany();
     
     //validation
     InsertCompany getInsertCompanyById(int id);
     InsertCompany getInsertCompanyByName(String companyName);
     
}
