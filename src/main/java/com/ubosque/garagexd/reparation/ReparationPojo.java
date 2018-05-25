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
    OwnerPojo propietario;
    CarPojo car;
    String reparation;
    int kilometros;

    public ReparationPojo(UUID uuid) {
        this.uuid = uuid;
    }

    /**
     * @param repairman Repairman of car    
     * @param owner Owner of the car to repair
     * @param car  Car to repair
     * @param reparation  Description og reparation
     * @param km  Km of car
     */
    public ReparationPojo(GenericPojo repairman, OwnerPojo owner, CarPojo car, String reparation, int km) {
        this.uuid = UUID.randomUUID();
        this.repairman = repairman;
        this.propietario = owner;
        this.car = car;
        this.reparation = reparation;
        this.kilometros = km;
    }

    public UUID getUuid() {
        return uuid;
    }

    public GenericPojo getRepairman() {
        return repairman;
    }

    public OwnerPojo getPropietario() {
        return propietario;
    }

    public CarPojo getCar() {
        return car;
    }

    public String getReparation() {
        return reparation;
    }

    public int getKilometros() {
        return kilometros;
    }

}
