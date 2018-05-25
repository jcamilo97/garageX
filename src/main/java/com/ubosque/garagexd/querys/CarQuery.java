/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.querys;

import com.google.gson.Gson;
import com.ubosque.garagexd.reparation.ReparationPojo;
import com.ubosque.garagexd.utils.RWFiles;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class CarQuery {
    Gson gson = new Gson();
    public String CarReparationAll(){
        List<String> s = RWFiles.leerarchivo("reparations");
        Iterator<String> fielstxt = s.iterator();
        String result = "";
        while (fielstxt.hasNext()) {
            String next = fielstxt.next();
            ReparationPojo reparation = gson.fromJson(next, ReparationPojo.class);
            result += "vehiculo "+reparation.getCar().getMarca()+reparation.getCar().getModelo()
                    +" matricula " + reparation.getCar().getMatricula()+" propietario "
                    +reparation.getPropietario().getNombre()+" reparacion "+reparation.getReparation()+"\n";
        }
        return result;    
    }
    
}
