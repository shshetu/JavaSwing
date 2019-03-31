/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.Dao;

import java.util.List;
import pharmacymanagement.Pojo.InsertMedicine;

/**
 *
 * @author User
 */
public interface InsertMedicineDao {
    //Crude Operation
    void createTable();
    void insert(InsertMedicine im);
    void update(InsertMedicine im);
    void delete(InsertMedicine im);
    
    //get data from database
    List<InsertMedicine> getInsertMedicine();
    
    //validation
    InsertMedicine getMedicineByid(int id);
    InsertMedicine getMedicineByProductCode(String productCode);
    InsertMedicine getMedicineByProductName(String productName);
}
