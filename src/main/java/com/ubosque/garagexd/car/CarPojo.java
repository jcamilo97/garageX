/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.car;

import com.ubosque.garagexd.person.owner.OwnerPojo;
import java.util.UUID;

/**
 *
 * @author Lenovo
 */
public class CarPojo {
    UUID uuid;
    String matricula;
    String marca;
    String modelo;
    OwnerPojo owner;
    String owners;
    String reparaciones;

    public CarPojo(String matricula) {
        this.uuid = UUID.randomUUID();
        this.matricula = matricula;
    }

    public CarPojo(String matricula, String marca, String modelo, OwnerPojo owner) {
        this.uuid = UUID.randomUUID();
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.owner = owner;
    }

    public CarPojo(String matricula, OwnerPojo owner, String reparaciones) {
        this.uuid = UUID.randomUUID();
        this.matricula = matricula;
        this.owner = owner;
        this.reparaciones = reparaciones;
    }
    
    public CarPojo(String matricula, String owner, String reparaciones) {
        this.uuid = UUID.randomUUID();
        this.matricula = matricula;
        this.owners = owner;
        this.reparaciones = reparaciones;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public OwnerPojo getOwner() {
        return owner;
    }

    public String getOwners() {
        return owners;
    }

    public String getReparaciones() {
        return reparaciones;
    }
    
    
    
    
}
