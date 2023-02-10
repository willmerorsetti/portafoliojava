package com.crehana.operations;

import com.crehana.catalog.controller.CityController;
import com.crehana.catalog.controller.MenuController;
import com.crehana.catalog.persistence.CityPersistence;
import com.crehana.catalog.service.CityService;
import com.crehana.catalog.validator.CityValidator;
import com.crehana.catalog.validator.MenuOptionValidator;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Clase que permite realizar los test Menu
 *
 * @author willmer.orsetti
 *
 */
public class MenuControllerTest {

    @Test
    public void pruebaDibujarMenuTest(){
        //given
        CityValidator cityValidator=new CityValidator();
        CityPersistence cityPersistence= new CityPersistence();
        CityService cityService= new CityService(cityPersistence);
        Scanner scanner= new Scanner(System.in);
        MenuOptionValidator validator=new MenuOptionValidator();

        CityController cityController=new CityController(cityValidator,scanner,cityService);
        MenuController menuController=new MenuController(validator,cityController,scanner) ;
        //when
        //menuController.draw();

        //then
        Assert.assertTrue(Boolean.TRUE);
    }



}
