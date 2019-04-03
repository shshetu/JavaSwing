/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.Dao;

import java.util.List;
import pharmacymanagement.Pojo.InsertMedicine;
import pharmacymanagement.Pojo.Sales;

/**
 *
 * @author User
 */
public interface SalesDao {
    //Crude Operation
    void createTable();
    void insert(Sales s);
    void update(Sales s);
    void delete(Sales s);
    
    //get data from database
    List<Sales> getSales();
   
    //validation
    Sales  getSalesByid(int id);
    Sales  getSalesByProductCode(String productCode);
    Sales  getSalesByProductName(String productName);
    
    
}
