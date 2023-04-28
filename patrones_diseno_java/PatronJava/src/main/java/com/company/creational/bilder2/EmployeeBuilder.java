package com.company.creational.bilder2;

public class EmployeeBuilder {
    // Atributes for the Builder of object Employee
    private int id_user = 0;
    private String name = "";
    private String surname = "";

    // Constructor empty
    public EmployeeBuilder() {

    }

    //Setters EmployeeBuilder with return this
    public EmployeeBuilder setId_user(int id_user) {
        this.id_user = id_user;
        return this;
    }

    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    //Employee constructor
    public Employee build() {
        return new Employee(id_user, name, surname);
    }
}
