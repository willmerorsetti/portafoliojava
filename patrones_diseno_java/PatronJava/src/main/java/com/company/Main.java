package com.company;

import com.company.creational.abstractfactory.*;

import com.company.creational.factorymethod.Payment;
import com.company.creational.factorymethod.PaymentFactory;
import com.company.creational.factorymethod.TypePayment;

import com.company.creational.factorymethod2.ProductoVehiculo;
import com.company.creational.factorymethod2.TypeVehiculo;
import com.company.creational.factorymethod2.VentaVehiculoFactory;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringbuilder= new StringBuilder();
        stringbuilder.append("Patrones de diseño java!");
        stringbuilder.append("\n");
        stringbuilder.append("WILLMER! Orsetti");
        stringbuilder.append(System.getProperty("line.separator"));
        System.out.println(stringbuilder.toString());

        //probarFactoryMethod();
        //probarFactoryMethodvehiculo();
        //probarAbstractFactory();
        probarBuilder();
    }
    private static void probarAbstractFactory(){
        System.out.println("5.<Abstract Factory Patron>");

        AbstractFactory abstractFactory= FactoryProvider.getFactory("Card");
        Card tarjeta = (Card)abstractFactory.create("VISA");

        AbstractFactory abstractFactory1=FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT")  ;


        System.out.println("Una trajeta tipo"+tarjeta.getCardType()+" Con el metodo de pago :"+ paymentMethod.doPayment());

    }
    private static void probarFactoryMethod(){
        System.out.println("<4.Factory Method Patron>");
        Payment payment=PaymentFactory.buildPayment (TypePayment.CARD);
        payment.doPayment();
    }
    private static void probarFactoryMethodvehiculo(){
        System.out.println("<4.1 Factory Method Patron> ejemplo 2");
        ProductoVehiculo producto = VentaVehiculoFactory.buildVentaVehiculo(TypeVehiculo.CAMION);
        producto.doVenta();
    }
    private static void probarBuilder(){
        com.company.creational.builder.Card card=new com.company.creational.builder.Card.CardBuilder("VISA","0000 1111 2222 3333")
                .name("Willmer")
                .expire(2030)
                .credit(true)
                .build();
        System.out.println("<6.Build Patron> resultado:" +card);
        com.company.creational.builder.Card card2=new com.company.creational.builder.Card.CardBuilder("AMEX","0000 1111 2222 4444")
                .name("JOSE")
                .expire(2026)
                .credit(true)
                .build();
        System.out.println("<6.Build Patron> resultado2:" +card2);
        com.company.creational.builder.Card card3=new com.company.creational.builder.Card.CardBuilder("MASTER","0000 1111 2222 5555")
               .build();
        System.out.println("<6.Build Patron> resultado3:" +card3);    }
}