/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.car;

import com.ubosque.garagexd.person.owner.OwnerView;
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
    OwnerView owner;
    String owners;
    String reparaciones;

    public CarPojo(String matricula) {
        this.uuid = UUID.randomUUID();
        this.matricula = matricula;
    }

    public CarPojo(String matricula, String marca, String modelo, String owners) {
        this.uuid = UUID.randomUUID();
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.owners = owners;
    }

    public CarPojo(String matricula, OwnerView owner, String reparaciones) {
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
    
    
    
    
}
