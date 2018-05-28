/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubosque.garagexd.utils;

/**
 *
 * @author Lenovo
 */
public class Validation {

    private static boolean isNumber(String n) {
        try {
            Integer.parseInt(n);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    private static boolean isEmpy(String n){
        return !(n.trim().isEmpty());
    }
    
    private static boolean validateFormEmpy(String[] fiels){
        boolean v = false;
        for (String fiel : fiels) {
            v = isEmpy(fiel);
        }
        return v;
    }

}
