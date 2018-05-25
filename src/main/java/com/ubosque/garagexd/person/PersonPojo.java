/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.person;
import java.util.UUID;
/**
 *
 * @author Lenovo
 *
 */
public class PersonPojo {
    UUID uuid;
    String nombre;
    String apellido;
    String direccion;
    
    public PersonPojo(String nombre, String apellido, String direccion) {
        this.uuid = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
     
    public PersonPojo(UUID uuid, String nombre, String apellido, String direccion) {
        this.uuid = uuid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

      public UUID getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public PersonPojo(String nombre) {
        this.nombre = nombre;
    }
   
    
}
