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
public class Summary {

    private int productId;
    private String productName;
    private String productCode;
    private String MedicineGroup;
    InsertCompany company;
    ProductCategory productCategory;
    private int availableQty;
    private int soldQty;
    private double pricePerUnit;
    private Date date;

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
        return MedicineGroup;
    }

    public void setMedicineGroup(String MedicineGroup) {
        this.MedicineGroup = MedicineGroup;
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

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public int getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(int soldQty) {
        this.soldQty = soldQty;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Summary(int productId, String productName, String productCode, String MedicineGroup, InsertCompany company, ProductCategory productCategory, int availableQty, int soldQty, double pricePerUnit, Date date) {
        this.productId = productId;
        this.productName = productName;
        this.productCode = productCode;
        this.MedicineGroup = MedicineGroup;
        this.company = company;
        this.productCategory = productCategory;
        this.availableQty = availableQty;
        this.soldQty = soldQty;
        this.pricePerUnit = pricePerUnit;
        this.date = date;
    }

    public Summary(String productName, String productCode, String MedicineGroup, InsertCompany company, ProductCategory productCategory, int availableQty, int soldQty, double pricePerUnit, Date date) {
        this.productName = productName;
        this.productCode = productCode;
        this.MedicineGroup = MedicineGroup;
        this.company = company;
        this.productCategory = productCategory;
        this.availableQty = availableQty;
        this.soldQty = soldQty;
        this.pricePerUnit = pricePerUnit;
        this.date = date;
    }

}
