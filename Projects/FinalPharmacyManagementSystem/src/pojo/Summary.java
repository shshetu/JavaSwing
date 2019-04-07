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
public class Summary {

    private int drug_id;
    private String drug_name;
    private String drug_type;
    private String drug_barcode;
    private String drug_dose;
    private String drug_code;
    private double buy_price;
    private double sell_price;

    //company foreign key
    Company company;

    private Date production_date;
    private Date expire_date;
    private String expire_time;
    private String validity;
    private double drug_tax;
    private String drug_place;
    private int total_qty;
    private int available_qty;
    private int sold_qty;

    public int getDrug_id() {
        return drug_id;
    }

    public void setDrug_id(int drug_id) {
        this.drug_id = drug_id;
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

    public double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
    }

    public double getSell_price() {
        return sell_price;
    }

    public void setSell_price(double sell_price) {
        this.sell_price = sell_price;
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

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
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

    public int getTotal_qty() {
        return total_qty;
    }

    public void setTotal_qty(int total_qty) {
        this.total_qty = total_qty;
    }

    public int getAvailable_qty() {
        return available_qty;
    }

    public void setAvailable_qty(int available_qty) {
        this.available_qty = available_qty;
    }

    public int getSold_qty() {
        return sold_qty;
    }

    public void setSold_qty(int sold_qty) {
        this.sold_qty = sold_qty;
    }

    public Summary(int drug_id, String drug_name, String drug_type, String drug_barcode, String drug_dose, String drug_code, double buy_price, double sell_price, Company company, Date production_date, Date expire_date, String expire_time, String validity, double drug_tax, String drug_place, int total_qty, int available_qty, int sold_qty) {
        this.drug_id = drug_id;
        this.drug_name = drug_name;
        this.drug_type = drug_type;
        this.drug_barcode = drug_barcode;
        this.drug_dose = drug_dose;
        this.drug_code = drug_code;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
        this.company = company;
        this.production_date = production_date;
        this.expire_date = expire_date;
        this.expire_time = expire_time;
        this.validity = validity;
        this.drug_tax = drug_tax;
        this.drug_place = drug_place;
        this.total_qty = total_qty;
        this.available_qty = available_qty;
        this.sold_qty = sold_qty;
    }

    public Summary(String drug_name, String drug_type, String drug_barcode, String drug_dose, String drug_code, double buy_price, double sell_price, Company company, Date production_date, Date expire_date, String expire_time, String validity, double drug_tax, String drug_place, int total_qty, int available_qty, int sold_qty) {
        this.drug_name = drug_name;
        this.drug_type = drug_type;
        this.drug_barcode = drug_barcode;
        this.drug_dose = drug_dose;
        this.drug_code = drug_code;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
        this.company = company;
        this.production_date = production_date;
        this.expire_date = expire_date;
        this.expire_time = expire_time;
        this.validity = validity;
        this.drug_tax = drug_tax;
        this.drug_place = drug_place;
        this.total_qty = total_qty;
        this.available_qty = available_qty;
        this.sold_qty = sold_qty;
    }

    public Summary(String drug_name, int total_qty, int available_qty, int sold_qty) {
        this.drug_name = drug_name;
        this.total_qty = total_qty;
        this.available_qty = available_qty;
        this.sold_qty = sold_qty;
    }

    public Summary(String drug_name, int available_qty, int sold_qty) {
        this.drug_name = drug_name;
        this.available_qty = available_qty;
        this.sold_qty = sold_qty;
    }

    public Summary(String drug_name, String drug_place) {
        this.drug_name = drug_name;
        this.drug_place = drug_place;
    }

}
