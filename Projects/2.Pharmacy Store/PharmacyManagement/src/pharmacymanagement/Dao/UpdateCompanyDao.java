/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.Dao;

import pharmacymanagement.Pojo.UpdateCompany;

/**
 *
 * @author shshe
 */
public interface UpdateCompanyDao {
    //crude operation
    void createTable();
    void updateContact(UpdateCompany updateCompany);
    void updateEmailId(UpdateCompany updateCompany);
}
