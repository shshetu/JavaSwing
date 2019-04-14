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
public class User {
    private int userID;
    private String roleName;
    private String userName;
    private Date dob;
    private String Address;
    private int phone;
    private double salary;
    private String pass;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public User(int userID, String roleName, String userName, Date dob, String Address, int phone, double salary, String pass) {
        this.userID = userID;
        this.roleName = roleName;
        this.userName = userName;
        this.dob = dob;
        this.Address = Address;
        this.phone = phone;
        this.salary = salary;
        this.pass = pass;
    }

    public User(String roleName, String userName, Date dob, String Address, int phone, double salary, String pass) {
        this.roleName = roleName;
        this.userName = userName;
        this.dob = dob;
        this.Address = Address;
        this.phone = phone;
        this.salary = salary;
        this.pass = pass;
    }

    public User(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
    }

    public User(int userID) {
        this.userID = userID;
    }

 

    

    

   
    
    
    
}
