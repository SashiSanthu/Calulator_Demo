package com.bridgelabz.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PersonModel {

   @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String fanme;

   private String lname;
    @Column(name="pr_age")
   private int age;
    @Column(name="pr_add")
   private String address;
    @Column(name="pr_gender")
   private String gender;

    public String getFanme() {
        return fanme;
    }

    public void setFanme(String fanme) {
        this.fanme = fanme;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
