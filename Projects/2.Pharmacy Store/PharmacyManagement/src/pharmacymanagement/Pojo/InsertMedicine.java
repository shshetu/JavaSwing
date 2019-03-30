/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.Pojo;

import java.sql.Date;

/**
 *
 * @author shshe
 */
public class InsertMedicine {

    private String productName;
    //acts like foreign key
    private String productCode;
    private String medicineGroup;
    //company pojo
    private String companyName;
    //product category pojo
    ProductCategory productCategory;
    private int productQuantity;
    private int productPrice;
    private Date expireDate;
    private String doseType;
    private String remarks;

}
