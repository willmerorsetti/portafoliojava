package com.company.creational.factorymethod2;

/**
 * Create by: WillmerOrsetti on 01/2023
 * Desc     : ConcreteProduct del Patron Factory Method
 */
public class Carro implements ProductoVehiculo {
    @Override
    public void doVenta() {
        System.out.println("Procedimiento Venta de Carro");
    }
}
