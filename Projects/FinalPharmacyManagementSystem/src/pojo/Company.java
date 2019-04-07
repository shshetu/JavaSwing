/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author User
 */
public class Company {
 private int company_id;
 private String company_name;
 private String company_country;
 private String comapany_email;
 private int comapany_contact;
 private String comapany_address;

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_country() {
        return company_country;
    }

    public void setCompany_country(String company_country) {
        this.company_country = company_country;
    }

    public String getComapany_email() {
        return comapany_email;
    }

    public void setComapany_email(String comapany_email) {
        this.comapany_email = comapany_email;
    }

    public int getComapany_contact() {
        return comapany_contact;
    }

    public void setComapany_contact(int comapany_contact) {
        this.comapany_contact = comapany_contact;
    }

    public String getComapany_address() {
        return comapany_address;
    }

    public void setComapany_address(String comapany_address) {
        this.comapany_address = comapany_address;
    }

    public Company(int company_id, String company_name, String company_country, String comapany_email, int comapany_contact, String comapany_address) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.company_country = company_country;
        this.comapany_email = comapany_email;
        this.comapany_contact = comapany_contact;
        this.comapany_address = comapany_address;
    }

    public Company(String company_name, String company_country, String comapany_email, int comapany_contact, String comapany_address) {
        this.company_name = company_name;
        this.company_country = company_country;
        this.comapany_email = comapany_email;
        this.comapany_contact = comapany_contact;
        this.comapany_address = comapany_address;
    }

    public Company(int company_id) {
        this.company_id = company_id;
    }

    

}
