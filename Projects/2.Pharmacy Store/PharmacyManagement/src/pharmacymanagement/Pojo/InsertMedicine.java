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

    private int productId; //auto increment
    private String productName;
    //acts like foreign key
    private String productCode; //string
    private String medicineGroup;
    //company pojo
    InsertCompany company; //from company page

    //product category pojo
    ProductCategory productCategory; //from productCategory page

    private int productQuantity;
    private double productPrice;
    private Date expireDate;
    private String doseType;
    private String remarks;

   

    

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getMedicineGroup() {
        return medicineGroup;
    }

    public void setMedicineGroup(String medicineGroup) {
        this.medicineGroup = medicineGroup;
    }

    public InsertCompany getCompany() {
        return company;
    }

    public void setCompany(InsertCompany company) {
        this.company = company;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getDoseType() {
        return doseType;
    }

    public void setDoseType(String doseType) {
        this.doseType = doseType;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public InsertMedicine(int productId, String productName, String productCode, String medicineGroup, InsertCompany company, ProductCategory productCategory, int productQuantity, double productPrice, Date expireDate, String doseType, String remarks) {
        this.productId = productId;
        this.productName = productName;
        this.productCode = productCode;
        this.medicineGroup = medicineGroup;
        this.company = company;
        this.productCategory = productCategory;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.expireDate = expireDate;
        this.doseType = doseType;
        this.remarks = remarks;
    }

    public InsertMedicine(String productName, String productCode, String medicineGroup, InsertCompany company, ProductCategory productCategory, int productQuantity, double productPrice, Date expireDate, String doseType, String remarks) {
        this.productName = productName;
        this.productCode = productCode;
        this.medicineGroup = medicineGroup;
        this.company = company;
        this.productCategory = productCategory;
        this.productQuantity = productQuantity;
        this.productPrice = productPrice;
        this.expireDate = expireDate;
        this.doseType = doseType;
        this.remarks = remarks;
    }

    

}
