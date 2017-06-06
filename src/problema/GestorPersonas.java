package problema;

import accesoArchivo.FileHandler;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class GestorPersonas {

    private ArrayList<Persona> personas;

    public GestorPersonas() {
        FileHandler f = new FileHandler();
        this.personas = getDatosArchivo();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void removePersona(Persona p) {
        personas.remove(p);
    }

    public Estudiante modificarEstudiante(int selected) {
        boolean error;
        Estudiante est = null;
        String nombre = JOptionPane.showInputDialog("Ingrese "
                + "el nuevo nombre del estudiante");
        if (nombre != null) {
            String apellido = JOptionPane.showInputDialog("Ingrese "
                    + "el nuevo apellido del estudiante");
            if (apellido != null) {
                String age;
                int edad = 0;
                do {
                    error = false;
                    age = JOptionPane.showInputDialog("Ingrese la nueva edad del estudainte");
                    try {
                        edad = Integer.parseInt(age);
                    } catch (NumberFormatException exc) {
                        error = true;
                        if (age != null) {
                            JOptionPane.showMessageDialog(null, "Error - Formato de Entrada Invalido", "Error", 0);
                        }
                    }
                } while (error && age != null);
                if (edad != 0) {
                    String universidad = JOptionPane.showInputDialog(null, "Ingrese "
                            + "la nueva universidad del estudiante");
                    if (universidad != null) {
                        String carrera = JOptionPane.showInputDialog(null, "Ingrese "
                                + "la nueva carrera del estudiante");
                        if (carrera != null) {
                            est = new Estudiante(universidad, carrera, nombre, apellido, edad);
                        }
                    }
                }
            }
        }
        if (est != null) {

            if (0 == JOptionPane.showConfirmDialog(null, "¿El estudiante tiene al menos una direccion?", "Preguntar", 0)) {
                do {
                    Dirección d = new Dirección(JOptionPane.showInputDialog("Ingrese una direccion"));
                    if (d != null) {
                        est.addDirecciones(d);
                    }
                } while (0 == JOptionPane.showConfirmDialog(null, "¿El estudiante tiene otra direccion?", "Preguntar", 0));
            }
            personas.remove(est);
            //((DefaultListModel) jList1.getModel()).remove(selected);
            personas.add(selected, est);
            //((DefaultListModel) jList1.getModel()).add(selected, est);

        }
        return est;
    }

    public Persona modificarPersona(int selected) {
        boolean error = false;
        Persona p = null;
        String nombre = JOptionPane.showInputDialog("Ingrese "
                + "el nuevo nombre de la persona");
        if (nombre != null) {
            String apellido = JOptionPane.showInputDialog("Ingrese "
                    + "el nuevo apellido de la persona");
            if (apellido != null) {
                String age;
                do {
                    error = false;
                    int edad = -1;
                    age = JOptionPane.showInputDialog("Ingrese la nueva edad de la persona");
                    try {
                        edad = Integer.parseInt(age);
                        p = new Persona(nombre, apellido, edad);
                    } catch (NumberFormatException exc) {
                        error = true;
                        if (age != null) {
                            JOptionPane.showMessageDialog(null, "Error - Formato de Entrada Invalido", "Error", 0);
                        }
                    }
                } while (error && age != null);
            }
        }
        if (p != null) {
            if (0 == JOptionPane.showConfirmDialog(null, "¿La persona tiene al menos una direccion?", "Preguntar", 0)) {
                do {
                    Dirección d = new Dirección(JOptionPane.showInputDialog("Ingrese una direccion"));
                    if (d != null) {
                        p.addDirecciones(d);
                    }
                } while (0 == JOptionPane.showConfirmDialog(null, "¿La persona tiene otra direccion?", "Preguntar", 0));
            }
            personas.remove(p);
            //((DefaultListModel) jList1.getModel()).remove(selected);
            personas.add(selected, p);
            //((DefaultListModel) jList1.getModel()).add(selected, p);

        }
        return p;
    }

    public Persona agregarPersona() {
        boolean error = false;
        Persona p = null;
        String nombre = JOptionPane.showInputDialog("Ingrese "
                + "el nombre de la nueva persona");
        if (nombre != null) {
            String apellido = JOptionPane.showInputDialog("Ingrese "
                    + "el apellido de la nueva persona");
            if (apellido != null) {
                String age;
                do {
                    error = false;
                    int edad = -1;
                    age = JOptionPane.showInputDialog("Ingrese la edad de la nueva persona");
                    try {
                        edad = Integer.parseInt(age);
                        p = new Persona(nombre, apellido, edad);
                    } catch (NumberFormatException exc) {
                        error = true;
                        if (age != null) {
                            JOptionPane.showMessageDialog(null, "Error - Formato de Entrada Invalido", "Error", 0);
                        }
                    }
                } while (error && age != null);
            }
        }
        if (p != null) {
            if (0 == JOptionPane.showConfirmDialog(null, "¿La persona tiene al menos una direccion?", "Preguntar", 0)) {
                do {
                    Dirección d = new Dirección(JOptionPane.showInputDialog("Ingrese una direccion"));
                    if (d != null) {
                        p.addDirecciones(d);
                    }
                } while (0 == JOptionPane.showConfirmDialog(null, "¿La persona tiene otra direccion?", "Preguntar", 0));
            }
            personas.add(p);
        }
        return p;
    }

    public Estudiante agregarEstudiante() {
        boolean error;
        Estudiante est = null;
        String nombre = JOptionPane.showInputDialog("Ingrese "
                + "el nombre del nuevo estudiante");
        if (nombre != null) {
            String apellido = JOptionPane.showInputDialog("Ingrese "
                    + "el apellido del nuevo estudiante");
            if (apellido != null) {
                String age;
                int edad = 0;
                do {
                    error = false;
                    age = JOptionPane.showInputDialog("Ingrese la edad del nuevo estudiante");
                    try {
                        edad = Integer.parseInt(age);
                    } catch (NumberFormatException exc) {
                        error = true;
                        if (age != null) {
                            JOptionPane.showMessageDialog(null, "Error - Formato de Entrada Invalido", "Error", 0);
                        }
                    }
                } while (error && age != null);
                if (edad != 0) {
                    String universidad = JOptionPane.showInputDialog("Ingrese "
                            + "la universidad del nuevo estudiante");
                    if (universidad != null) {
                        String carrera = JOptionPane.showInputDialog("Ingrese "
                                + "la carrera del nuevo estudiante");
                        if (carrera != null) {
                            est = new Estudiante(universidad, carrera, nombre, apellido, edad);
                        }
                    }
                }
            }
        }
        if (est != null) {

            if (0 == JOptionPane.showConfirmDialog(null, "¿El estudiante tiene al menos una direccion?", "Preguntar", 0)) {
                do {
                    Dirección d = new Dirección(JOptionPane.showInputDialog("Ingrese una direccion"));
                    if (d != null) {
                        est.addDirecciones(d);
                    }
                } while (0 == JOptionPane.showConfirmDialog(null, "¿El estudiante tiene otra direccion?", "Preguntar", 0));
            }
            personas.add(est);
        }
        return est;
    }

    public ArrayList<Persona> getDatosArchivo() {
        FileHandler f = new FileHandler();
        return interpretador(f.lectura());
    }

    public void setDatosArchivo() {
        FileHandler f = new FileHandler();
        f.escritura(dataToWrite());
    }

    public ArrayList<Persona> interpretador(ArrayList<String> datos) {
        ArrayList<Persona> data = new ArrayList<>();
        for (String linea : datos) {
            String[] dat = linea.split(":");

            if (dat[0].equals("p")) {
                Persona p = new Persona(dat[1], dat[2], Integer.parseInt(dat[3]));
                if (dat.length > 4) {
                    for (int i = 4; i < dat.length; i++) {
                        Dirección dir = new Dirección(dat[i]);
                        p.addDirecciones(dir);
                    }
                }
                data.add(p);
            } else {
                Estudiante e = new Estudiante(dat[4], dat[5], dat[1], dat[2], Integer.parseInt(dat[3]));
                if (dat.length > 6) {
                    for (int i = 6; i < dat.length; i++) {
                        Dirección dir = new Dirección(dat[i]);
                        e.addDirecciones(dir);
                    }
                }
                data.add(e);
            }
        }
        return data;
    }

    public ArrayList<String> dataToWrite() {
        ArrayList<String> text=new ArrayList<>();
        for(Persona p : personas){
            text.add(p.toString2());
        }
        return text;
    }
}
