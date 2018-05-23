/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.person.owner;

import com.ubosque.garagexd.person.GenericPojo;

/**
 *
 * @author Lenovo
 */
public class OwnerPojo extends GenericPojo {
    
    String cars;
    //Car[] cars;

    public OwnerPojo(String cars, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.cars = cars;
    }
    
}
