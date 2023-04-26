package com.company.creational.abstractfactory;

public class PaymentMethodFactory <PPaymentMethod> implements AbstractFactory{
    @Override
    public Object create(String type) {
        if ("CREDIT".equals(type)){
            return new Credit();
        }else if("DEBIT".equals(type)){
            return new Debit();
        }
        return null;
    }
}
