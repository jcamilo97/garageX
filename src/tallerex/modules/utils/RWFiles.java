package tallerex.modules.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 * Files
 */

public class RWFiles {

  public RWFiles(){}

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

public void leerarchivo(String archivo) {
    FileReader fr = null;
    BufferedReader br = null;
    try {
        // Apertura del fichero y creacion de BufferedReader para poder
        // hacer una lectura comoda (disponer del metodo readLine()).
        //archivo = new File("./archivos/filer.txt");
        fr = new FileReader("./archivos/"+archivo+".txt");
        br = new BufferedReader(fr);

        // Lectura del fichero
        String linea;
        while ((linea = br.readLine()) != null) {
            if (!" ".equals(linea)) {
                System.out.println(linea);                              
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // En el finally cerramos el fichero, para asegurarnos
        // que se cierra tanto si todo va bien como si salta 
        // una excepcion.
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

  
}