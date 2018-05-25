/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.person.owner;

import com.ubosque.garagexd.car.CarPojo;
import com.ubosque.garagexd.person.GenericPojo;
import java.util.UUID;

/**
 *
 * @author Lenovo
 */
public class OwnerPojo extends GenericPojo {

    String car;
    CarPojo[] cars;
    //Car[] cars;

    /**
     * Creates a Owner with name specified
     * and uuid for default
     * @param    name name of owner of the car
     */
    public OwnerPojo(String name) {
        super(name);
    }
    /**
     * Creates a Owner with name, lastname and addres specified
     * and uuid for default
     * @param    name Name of owner of the car
     * @param    lastname Lastname of owner
     * @param    address Address of owner 
     * @param    cars --In a future will change
     */
    public OwnerPojo(String name, String lastname, String address, String cars) {
        super(name, lastname, address);
        this.car = cars;
    }

    public OwnerPojo(CarPojo[] cars, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.cars = cars;
    }

    public OwnerPojo(CarPojo[] cars, UUID uuid, String nombre, String apellido, String direccion) {
        super(uuid, nombre, apellido, direccion);
        this.cars = cars;
    }

    public OwnerPojo(CarPojo[] cars, String nombre) {
        super(nombre);
        this.cars = cars;
    }

}
