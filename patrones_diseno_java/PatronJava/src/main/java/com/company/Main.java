package com.company;

import com.company.creational.factorymethod.Payment;
import com.company.creational.factorymethod.PaymentFactory;
import com.company.creational.factorymethod.TypePayment;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringbuilder= new StringBuilder();
        stringbuilder.append("Patrones de diseño java!");
        stringbuilder.append("\n");
        stringbuilder.append("WILLMER! Orsetti");
        stringbuilder.append(System.getProperty("line.separator"));
        stringbuilder.append(">");
        System.out.println(stringbuilder.toString());

        probarFactoryMethod();
    }
    private static void probarFactoryMethod(){
        Payment payment=PaymentFactory.buildPayment (TypePayment.CARD);
        payment.doPayment();
    }
}