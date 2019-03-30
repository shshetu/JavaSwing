/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.Dao;

import java.util.List;
import pharmacymanagement.Pojo.ProductCategory;

/**
 *
 * @author shshe
 */
public interface ProductCategoryDao {

    //crude operation
    void createTable();

    void insert(ProductCategory pc);

    void update(ProductCategory pc);

    void delete(ProductCategory pc);

    //get date from database
    List<ProductCategory> getProductCategory();
    
    ///get ProductCategory Object
    ProductCategory getProductCategorybyId(int id);
    ProductCategory getProductCategorybyName(String productName);
}
