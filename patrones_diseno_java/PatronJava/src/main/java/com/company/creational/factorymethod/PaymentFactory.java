package com.company.creational.factorymethod;


import static com.company.creational.factorymethod.TypePayment.GOOGLEPAY;
import static com.company.creational.factorymethod.TypePayment.CARD;

/**
 * Create by: WillmerOrsetti on 01/2023
 * Desc     : Creator del Patron Factory Method
 */
public class PaymentFactory {
    public static Payment buildPayment (TypePayment typePayment){
        switch (typePayment){
            case GOOGLEPAY:
                return new GooglePayment();
            case CARD :
                return new CardPayment();
            default :
                return new CardPayment();
        }
    }
}
