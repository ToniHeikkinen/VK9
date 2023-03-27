package com.example.studentregister;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class User implements Serializable {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String degreeProgram;


    public User(String name, String lastName, String email,String degreeProgram) {
        this.firstName = name;
        this.lastName = lastName;
        this.email=email;
        this.degreeProgram=degreeProgram;
    }
    /*
    public void setName(String name) {
        this.name = name;
    }

    public void setName(int name) {
        this.name = String.valueOf(name);
    }

    public void setMass(int mass) {
        this.m = mass;
    }
    */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public String getEmail() {
        return email;
    }



    /*
    public String toString() {
        return name;
    }
    */
}