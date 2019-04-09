/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import pojo.Sales;

/**
 *
 * @author shshe
 */
public interface SalesDao {

    void createTable();

    void insert(Sales s);

    void update(Sales s);

    void delete(Sales s);
    //get name, id
    Sales getSalesByName(String name);
    
    //get data from the database
    List<Sales> getSales();
}
