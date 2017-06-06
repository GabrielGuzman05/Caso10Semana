package problema;

import java.util.ArrayList;

public class Persona {

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected ArrayList<Dirección> direcciones;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direcciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Dirección> getDirecciones() {
        return direcciones;
    }

    public void addDirecciones(Dirección dir) {
        this.direcciones.add(dir);
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad;
    }

    public String toString1() {
        String dirs = "";
        if (!direcciones.isEmpty()) {
            for (Dirección d : direcciones) {
                dirs += d.getDireccion() + "-";
            }
            dirs = dirs.substring(0, dirs.length() - 1);
        }
        return toString() + "\n"
                + "Direcciones =" + dirs;
    }

    public String toString2() {
        String dirs = "";
        if (!direcciones.isEmpty()) {
            for (Dirección d : direcciones) {
                dirs += d.getDireccion() + ":";
            }
            dirs = dirs.substring(0, dirs.length()-1);
        }
        return "p:" + nombre + ":" + apellido + ":" + edad + ":" + dirs;
    }
}
