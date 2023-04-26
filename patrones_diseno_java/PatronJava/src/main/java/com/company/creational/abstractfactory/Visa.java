package com.company.creational.abstractfactory;

public class Visa  implements  Card{

        @Override
        public String getCardType() {
            return "Tarjeta Visa";
        }

        @Override
        public String getCardNumber() {
            return "1234 VISA";
        }
}
