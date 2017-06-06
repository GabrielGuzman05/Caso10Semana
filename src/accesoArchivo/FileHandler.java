package accesoArchivo;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import problema.*;

public class FileHandler {

    public ArrayList<String> lectura() {

        ArrayList<String> datos = new ArrayList<>();

        // Fichero del que queremos leer
        File fichero = new File(System.getProperty("user.dir") + "/Archivos/datos.txt");
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            s = new Scanner(fichero);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                datos.add(linea);
            }

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }

        /*
        for(Persona p : datos){
            System.out.println(p.toString1());
        }
         */
        return datos;
    }

    public void escritura(ArrayList<String> strings) {
        /**
         * FORMA 1 DE ESCRITURA *
         */
        FileWriter fichero = null;
        try {

            fichero = new FileWriter(System.getProperty("user.dir") + "/Archivos/datos.txt");

            // Escribimos linea a linea en el fichero
            for (String str : strings) {
                fichero.write(str + "\n");
            }

            fichero.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }
}
