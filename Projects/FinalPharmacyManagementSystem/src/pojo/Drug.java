/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Date;

/**
 *
 * @author User
 */
public class Drug {

    private int drug_serial;
    private String drug_name;
    private String drug_type;
    private String drug_barcode;  //primary key
    private String drug_dose;
    private String drug_code;
    private double drug_buy_price;
    private double drug_sell_price;
    Company company; //foreign key 
    private Date production_date;
    private Date expire_date;
    private String expire_time;
    private double drug_tax;
    private String drug_place;
    private int drug_quantity;

    public int getDrug_serial() {
        return drug_serial;
    }

    public void setDrug_serial(int drug_serial) {
        this.drug_serial = drug_serial;
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

    public String getDrug_barcode() {
        return drug_barcode;
    }

    public void setDrug_barcode(String drug_barcode) {
        this.drug_barcode = drug_barcode;
    }

    public String getDrug_dose() {
        return drug_dose;
    }

    public void setDrug_dose(String drug_dose) {
        this.drug_dose = drug_dose;
    }

    public String getDrug_code() {
        return drug_code;
    }

    public void setDrug_code(String drug_code) {
        this.drug_code = drug_code;
    }

    public double getDrug_buy_price() {
        return drug_buy_price;
    }

    public void setDrug_buy_price(double drug_buy_price) {
        this.drug_buy_price = drug_buy_price;
    }

    public double getDrug_sell_price() {
        return drug_sell_price;
    }

    public void setDrug_sell_price(double drug_sell_price) {
        this.drug_sell_price = drug_sell_price;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Date getProduction_date() {
        return production_date;
    }

    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }

    public Date getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Date expire_date) {
        this.expire_date = expire_date;
    }

    public String getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(String expire_time) {
        this.expire_time = expire_time;
    }

    public double getDrug_tax() {
        return drug_tax;
    }

    public void setDrug_tax(double drug_tax) {
        this.drug_tax = drug_tax;
    }

    public String getDrug_place() {
        return drug_place;
    }

    public void setDrug_place(String drug_place) {
        this.drug_place = drug_place;
    }

    public int getDrug_quantity() {
        return drug_quantity;
    }

    public void setDrug_quantity(int drug_quantity) {
        this.drug_quantity = drug_quantity;
    }

    public Drug(int drug_serial, String drug_name, String drug_type, String drug_barcode, String drug_dose, String drug_code, double drug_buy_price, double drug_sell_price, Company company, Date production_date, Date expire_date, String expire_time, double drug_tax, String drug_place, int drug_quantity) {
        this.drug_serial = drug_serial;
        this.drug_name = drug_name;
        this.drug_type = drug_type;
        this.drug_barcode = drug_barcode;
        this.drug_dose = drug_dose;
        this.drug_code = drug_code;
        this.drug_buy_price = drug_buy_price;
        this.drug_sell_price = drug_sell_price;
        this.company = company;
        this.production_date = production_date;
        this.expire_date = expire_date;
        this.expire_time = expire_time;
        this.drug_tax = drug_tax;
        this.drug_place = drug_place;
        this.drug_quantity = drug_quantity;
    }

    public Drug(String drug_name, String drug_type, String drug_barcode, String drug_dose, String drug_code, double drug_buy_price, double drug_sell_price, Company company, Date production_date, Date expire_date, String expire_time, double drug_tax, String drug_place, int drug_quantity) {
        this.drug_name = drug_name;
        this.drug_type = drug_type;
        this.drug_barcode = drug_barcode;
        this.drug_dose = drug_dose;
        this.drug_code = drug_code;
        this.drug_buy_price = drug_buy_price;
        this.drug_sell_price = drug_sell_price;
        this.company = company;
        this.production_date = production_date;
        this.expire_date = expire_date;
        this.expire_time = expire_time;
        this.drug_tax = drug_tax;
        this.drug_place = drug_place;
        this.drug_quantity = drug_quantity;
    }

    public Drug() {
    }

}
