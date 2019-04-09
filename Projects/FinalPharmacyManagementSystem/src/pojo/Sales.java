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
public class Sales {

    private int salesId;
    private String barcode;
    private String name;
    private String type;
    private String dose;
    private int quantity;
    private Double buy_price;
    private Double sell_price;
    private Double amount;
    private Date date;
    private String time;
    private double profit;

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(Double buy_price) {
        this.buy_price = buy_price;
    }

    public Double getSell_price() {
        return sell_price;
    }

    public void setSell_price(Double sell_price) {
        this.sell_price = sell_price;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public Sales(int salesId, String barcode, String name, String type, String dose, int quantity, Double buy_price, Double sell_price, Double amount, Date date, String time, double profit) {
        this.salesId = salesId;
        this.barcode = barcode;
        this.name = name;
        this.type = type;
        this.dose = dose;
        this.quantity = quantity;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
        this.amount = amount;
        this.date = date;
        this.time = time;
        this.profit = profit;
    }

    public Sales(String barcode, String name, String type, String dose, int quantity, Double buy_price, Double sell_price, Double amount, Date date, String time, double profit) {
        this.barcode = barcode;
        this.name = name;
        this.type = type;
        this.dose = dose;
        this.quantity = quantity;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
        this.amount = amount;
        this.date = date;
        this.time = time;
        this.profit = profit;
    }
    
}
