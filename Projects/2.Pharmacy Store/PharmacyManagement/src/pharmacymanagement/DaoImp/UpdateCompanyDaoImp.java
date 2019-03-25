/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.DaoImp;

import pharmacymanagement.Dao.UpdateCompanyDao;
import pharmacymanagement.Pojo.UpdateCompany;

/**
 *
 * @author shshe
 */
public class UpdateCompanyDaoImp implements UpdateCompanyDao{

    @Override
    public void createTable() {
        String sql = "create table if not exists updatecompany(productName varchar(30),Contact varchar(30),EmailId varchar(30),foreign key(productName) references )";
    }

    @Override
    public void updateContact(UpdateCompany updateCompany) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateEmailId(UpdateCompany updateCompany) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
