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
public class GenericPojo {
    UUID uuid;
    String nombre;
    String apellido;
    String direccion;
    
     public GenericPojo(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }
    
    public GenericPojo(UUID uuid, String nombre, String apellido, String direccion) {
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

    public GenericPojo(String nombre) {
        this.nombre = nombre;
    }
   
    
}
