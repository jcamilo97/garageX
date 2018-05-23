/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.car;

import com.ubosque.garagexd.person.owner.OwnerView;

/**
 *
 * @author Lenovo
 */
public class CarPojo {
    String uuid;
    String matricula;
    String marca;
    String modelo;
    OwnerView owner;
    String owners;
    String reparaciones;

    public CarPojo(String uuid, String matricula, String marca, String modelo, String owners) {
        this.uuid = uuid;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.owners = owners;
    }

    public CarPojo(String uuid, String matricula, OwnerView owner, String reparaciones) {
        this.uuid = uuid;
        this.matricula = matricula;
        this.owner = owner;
        this.reparaciones = reparaciones;
    }
    
    public CarPojo(String uuid, String matricula, String owner, String reparaciones) {
        this.uuid = uuid;
        this.matricula = matricula;
        this.owners = owner;
        this.reparaciones = reparaciones;
    }
    
    
    
    
}
