package com.company.creational.abstractfactory;

public class CardFactory implements AbstractFactory<Card> {

    @Override
    public Card create(String type) {
        switch (type){
            case "VISA":
                return  new Visa();
            case "MASTER":
                return  new MasterCard();
            default:
                return null;
        }
    }
}
