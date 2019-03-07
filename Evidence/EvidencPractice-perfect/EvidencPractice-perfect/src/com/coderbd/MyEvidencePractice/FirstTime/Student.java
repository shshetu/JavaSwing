/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.MyEvidencePractice.FirstTime;

/**
 *
 * @author shshe
 */
public class Student {
    private int id;
    private String name;
    private int age;
     private String gender;

    

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    private String email;
    private String course;
    private String round;
    private String comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    //Parameterized costructor
    public Student(int id, String name, int age, String email, String gender, String course, String round, String comments) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
        this.round = round;
        this.comments = comments;
    }
    //Default constructor
    public Student(){}
}
