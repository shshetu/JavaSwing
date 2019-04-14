/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;

/**
 *
 * @author shshe
 */
public class BuyDrug {

    private int serial;
    private String bar_code;
    private String drug_name;
    private String drug_type;
    private String drug_group;
    Company company;
    private int quantity;
    private double buy_price;
    private double amount;
    //buy_time and date
    private Date buy_date;
    private String buy_time;

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

    public String getDrug_group() {
        return drug_group;
    }

    public void setDrug_group(String drug_group) {
        this.drug_group = drug_group;
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

    public Date getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    public String getBuy_time() {
        return buy_time;
    }

    public void setBuy_time(String buy_time) {
        this.buy_time = buy_time;
    }

    public BuyDrug(int serial, String bar_code, String drug_name, String drug_type, String drug_group, Company company, int quantity, double buy_price, double amount, Date buy_date, String buy_time) {
        this.serial = serial;
        this.bar_code = bar_code;
        this.drug_name = drug_name;
        this.drug_type = drug_type;
        this.drug_group = drug_group;
        this.company = company;
        this.quantity = quantity;
        this.buy_price = buy_price;
        this.amount = amount;
        this.buy_date = buy_date;
        this.buy_time = buy_time;
    }

    public BuyDrug(String bar_code, String drug_name, String drug_type, String drug_group, Company company, int quantity, double buy_price, double amount, Date buy_date, String buy_time) {
        this.bar_code = bar_code;
        this.drug_name = drug_name;
        this.drug_type = drug_type;
        this.drug_group = drug_group;
        this.company = company;
        this.quantity = quantity;
        this.buy_price = buy_price;
        this.amount = amount;
        this.buy_date = buy_date;
        this.buy_time = buy_time;
    }
   

    

}
