package com.ilaydabykakova.oppproject;
//Absract class is extend it.
public class User extends People {
    //Property
    String name;
    String job;

    //Constructor
    public User(String nameInput, String jobInput) {
        this.name = nameInput;// This içinde bulunan class veya activitye referans ediyor.
        this.job = jobInput;
        System.out.println("User Created");
    }
}
