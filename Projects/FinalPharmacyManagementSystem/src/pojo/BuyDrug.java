/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author shshe
 */
public class BuyDrug {

    private int serial;
    private String bar_code;
    private String drug_name;
    private String drug_type;
    Company company;
    private int quantity;
    private double buy_price;
    private double amount;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public String getDrug_name() {
        return drug_name;
    }

    public void setDrug_name(String drug_name) {
        this.drug_name = drug_name;
    }

    public String getDrug_type() {
        return drug_type;
    }

    public void setDrug_type(String drug_type) {
        this.drug_type = drug_type;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BuyDrug(int serial, String bar_code, String drug_name, String drug_type, Company company, int quantity, double buy_price, double amount) {
        this.serial = serial;
        this.bar_code = bar_code;
        this.drug_name = drug_name;
        this.drug_type = drug_type;
        this.company = company;
        this.quantity = quantity;
        this.buy_price = buy_price;
        this.amount = amount;
    }

    public BuyDrug(String bar_code, String drug_name, String drug_type, Company company, int quantity, double buy_price, double amount) {
        this.bar_code = bar_code;
        this.drug_name = drug_name;
        this.drug_type = drug_type;
        this.company = company;
        this.quantity = quantity;
        this.buy_price = buy_price;
        this.amount = amount;
    }

}
