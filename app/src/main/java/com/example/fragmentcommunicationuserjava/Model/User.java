package com.example.fragmentcommunicationuserjava.Model;

public class User {
    private String ism;
    private String familiya;
    public User(String ism, String familiya){
        this.ism=ism;
        this.familiya=familiya;
    }

    public String getIsm() {
        return ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    @Override
    public String toString() {
        return "User{" +
                "ism='" + ism + '\'' +
                ", familiya='" + familiya + '\'' +
                '}';
    }
}
