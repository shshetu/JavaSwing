package com.coderbd.swingEvidence;


public class Student {

    private int id;
    private String name;
    private int age;
    private String email;
    private String gender;
    private String course;
    private String round;
    private String comment;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getRound() {
        return round;
    }

    public String getComment() {
        return comment;
    }

    public Student(int id, String name, int age, String email, String gender, String course, String round, String comment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.course = course;
        this.round = round;
        this.comment = comment;
    }

    public Student() {
    }

}
