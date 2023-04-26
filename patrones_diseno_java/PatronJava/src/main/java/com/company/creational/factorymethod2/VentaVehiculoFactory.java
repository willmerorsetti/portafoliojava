package com.company.creational.factorymethod2;


/**
 * Create by: WillmerOrsetti on 01/2023
 * Desc     : Creator del Patron Factory Method
 */
public class VentaVehiculoFactory {
    public static ProductoVehiculo buildVentaVehiculo (TypeVehiculo typeVehiculo){
        switch (typeVehiculo){
            case CARRO:
                return new Carro();
            case CAMION :
                return new Camion();
            case MOTO :
                return new Moto();
            default :
                return new Camion();
        }
    }
}
