package com.ubosque.garagexd.reparation;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.ubosque.garagexd.car.CarPojo;
import com.ubosque.garagexd.person.GenericPojo;
import com.ubosque.garagexd.person.owner.OwnerPojo;
import java.util.UUID;

/**
 *
 * @author Lenovo
 */
public class ReparationPojo {
    UUID uuid;
    GenericPojo repairman;
    OwnerPojo dueño;
    CarPojo car;
    String reparation;
    int kilometros;

    public ReparationPojo(UUID uuid) {
        this.uuid = uuid;
    }

    public ReparationPojo(GenericPojo repairman, OwnerPojo dueño, CarPojo car, String reparation, int kilometros) {
        this.uuid = UUID.randomUUID();
        this.repairman = repairman;
        this.dueño = dueño;
        this.car = car;
        this.reparation = reparation;
        this.kilometros = kilometros;
    }
    
    
}
