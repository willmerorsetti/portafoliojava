package com.company.creational.factorymethod;

/**
 * Create by: WillmerOrsetti on 01/2023
 * Desc     : ConcreteProduct del Patron Factory Method
 */
public class GooglePayment implements Payment{
    @Override
    public void doPayment() {
        StringBuilder stringbuilder= new StringBuilder();
        stringbuilder.append("-------------------------");
        stringbuilder.append(System.getProperty("line.separator"));
        stringbuilder.append("Pagando com Google Payment");
        stringbuilder.append(System.getProperty("line.separator"));
        stringbuilder.append("-------------------------");

        System.out.println(stringbuilder.toString());
    }
}
