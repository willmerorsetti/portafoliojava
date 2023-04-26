package com.company.creational.abstractfactory;
/**
 * Created By:Willmer Orsetti on 25/04/2023
 * Desc:      Patron de diseño AstractFactory
 */

public interface AbstractFactory<T> {
    T create(String type);
}
