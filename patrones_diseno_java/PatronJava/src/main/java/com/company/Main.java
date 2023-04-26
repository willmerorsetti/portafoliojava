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
        probarAbstractFactory();
    }
    private static void probarAbstractFactory(){
        System.out.println("<Abstract Factory Patron>");

        AbstractFactory abstractFactory= FactoryProvider.getFactory("Card");
        Card tarjeta = (Card)abstractFactory.create("VISA");

        AbstractFactory abstractFactory1=FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT")  ;


        System.out.println("Una trajeta tipo"+tarjeta.getCardType()+" Con el metodo de pago :"+ paymentMethod.doPayment());

    }
    private static void probarFactoryMethod(){
        System.out.println("<Factory Method Patron>");
        Payment payment=PaymentFactory.buildPayment (TypePayment.CARD);
        payment.doPayment();
    }
    private static void probarFactoryMethodvehiculo(){
        System.out.println("<Factory Method Patron> ejemplo 2");
        ProductoVehiculo producto = VentaVehiculoFactory.buildVentaVehiculo(TypeVehiculo.CAMION);
        producto.doVenta();
    }
}