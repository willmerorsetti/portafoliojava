package com.company.creational.bilder2;

public class Employee {
    // Atributes of object Employee
    private int id_user = 0;
    private String name = "";
    private String surname = "";

    // Constructor with All atributes
    public Employee(int id_user, String name, String surname) {
        this.id_user = id_user;
        this.name = name;
        this.surname = surname;
    }

    //Getters
    public int getId_user() {
        return id_user;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //Setters
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee [id_user=" + id_user + ", name=" + name + ", surname=" + surname + "]";
    }
}