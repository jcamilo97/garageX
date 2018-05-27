package com.ubosque.garagexd.car;

import com.google.gson.Gson;
import com.ubosque.garagexd.person.owner.OwnerPojo;
import com.ubosque.garagexd.reparation.ReparationPojo;
import com.ubosque.garagexd.utils.RWFiles;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public class CarServices {

    Gson gson = new Gson();
   
    public String CarAll() {
        List<String> cars = RWFiles.leerarchivo("cars");
        List<String> owners = RWFiles.leerarchivo("owners");
        String result = "";
        OwnerPojo owner = gson.fromJson(owners.get(0), OwnerPojo.class); 
        for(int j=0; j<= cars.size() -1; j++) {
            String next = cars.get(j);         
            CarPojo car = gson.fromJson(next, CarPojo.class);
            for (int i = 0; i <= owners.size() - 1; i++) {
                owner = gson.fromJson(owners.get(i), OwnerPojo.class);
                if (car.getOwner().getNombre().equals(owner.getNombre()))
                        i = owners.size();
                
            }
            result += " | vehiculo: " + car.getMarca()+" "+ car.getModelo() + " | matricula: " + car.getMatricula()
                    + " | propietario: "+owner.getNombre()+" "+owner.getApellido()+" | direccion: "
                    +owner.getDireccion()+" |\n";
        }
        return result;
    }
}
