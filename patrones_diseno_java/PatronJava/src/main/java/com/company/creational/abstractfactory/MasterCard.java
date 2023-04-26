package com.company.creational.abstractfactory;

public class MasterCard implements  Card{
    @Override
    public String getCardType() {
        return "Es Tarjeta Master card";
    }

    @Override
    public String getCardNumber() {
        return "4321 MASTER";
    }
}
