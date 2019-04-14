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
public class Login {

    private int login_id;
    private String username;
    private String role_name;
    private Date login_date;
    private String login_time;
    private String  logout_time;
    private String duration;
    
    public int getLogin_id() {
        return login_id;
    }

    public void setLogin_id(int login_id) {
        this.login_id = login_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Date getLogin_date() {
        return login_date;
    }

    public void setLogin_date(Date login_date) {
        this.login_date = login_date;
    }

    public String getLogin_time() {
        return login_time;
    }

    public void setLogin_time(String login_time) {
        this.login_time = login_time;
    }

    public String getLogout_time() {
        return logout_time;
    }

    public void setLogout_time(String logout_time) {
        this.logout_time = logout_time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Login(int login_id, String username, String role_name, Date login_date, String login_time, String logout_time, String duration) {
        this.login_id = login_id;
        this.username = username;
        this.role_name = role_name;
        this.login_date = login_date;
        this.login_time = login_time;
        this.logout_time = logout_time;
        this.duration = duration;
    }

    public Login(String username, String role_name, Date login_date, String login_time, String logout_time, String duration) {
        this.username = username;
        this.role_name = role_name;
        this.login_date = login_date;
        this.login_time = login_time;
        this.logout_time = logout_time;
        this.duration = duration;
    }

    public Login(String login_time, String logout_time, String duration) {
        this.login_time = login_time;
        this.logout_time = logout_time;
        this.duration = duration;
    }

    public Login(String username) {
        this.username = username;
    }

   

   

}
