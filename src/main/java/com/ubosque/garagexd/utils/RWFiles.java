package com.ubosque.garagexd.utils;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Files
 */

public class RWFiles {

  Gson gson = new Gson();
  private static List<String> cars = new ArrayList<>();
  public RWFiles(){}

  public void objectToJson(Object obj, String file) {
        gson = new Gson();
        String json = gson.toJson(obj);
        System.out.println(json);

        //2. Convert object to JSON string and save into a file directly
        try (FileWriter writer = new FileWriter("./files/"+file+".json")) {

            gson.toJson(obj, writer);

        } catch (IOException e) {
            System.out.println("error "+e.getMessage());
        }
  }
  
  public void escribirArchivos(Object obj, String name) {
    //nFile folder = new File("C:\\Users\\Lenovo\\Documents\\vscode\\javaUN\\Tallerex\\archivos\\cars");
    FileWriter fichero = null;
    PrintWriter pw = null;
    try {
        gson = new Gson();
        String json = gson.toJson(obj);
       // folder.mkdir();
        fichero = new FileWriter("./files/"+name+".json", true);
        pw = new PrintWriter(fichero);
        pw.println(json);
        
    } catch (IOException e) {
        System.out.println(e.toString());
    } finally {
        try {
            // Nuevamente aprovechamos el finally para 
            // asegurarnos que se cierra el fichero.
            if (null != fichero) {
                fichero.close();
            }    
        } catch (IOException e2) {
            e2.getMessage();
        }
    }
}

  public void escribirArchivo(List<String> datos, String name) {
    //nFile folder = new File("C:\\Users\\Lenovo\\Documents\\vscode\\javaUN\\Tallerex\\archivos\\cars");
    FileWriter fichero = null;
    PrintWriter pw = null;
    try {
       // folder.mkdir();
        fichero = new FileWriter("./archivos/"+name+".txt", true);
        pw = new PrintWriter(fichero);
        for (String str : datos) {
             pw.println(str);
        }
    } catch (Exception e) {
        System.out.println(e.toString());
    } finally {
        try {
            // Nuevamente aprovechamos el finally para 
            // asegurarnos que se cierra el fichero.
            if (null != fichero) {
                fichero.close();
            }    
        } catch (Exception e2) {
            e2.getMessage();
        }
    }
}
  
//        leerarchivo();

public static List<String> leerarchivo(String archivo) {
    FileReader fr = null;
    BufferedReader br = null;
    try {
        // Apertura del fichero y creacion de BufferedReader para poder
        // hacer una lectura comoda (disponer del metodo readLine()).
        //archivo = new File("./archivos/filer.txt");
        fr = new FileReader("./files/"+archivo+".json");
        br = new BufferedReader(fr);
        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            if (!" ".equals(linea)) {
                cars.add(linea);
            }
        }
        return cars;
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta 
        // una excepcion.
        try {
            if (null != fr) {
                fr.close();
            }         
        } catch (IOException e2) {
            e2.printStackTrace();
        }
       
    }
     return cars;
}

  
}