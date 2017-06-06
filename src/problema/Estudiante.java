/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema;

/**
 *
 * @author Gabriel
 */
public class Estudiante extends Persona{
    String universidad;
    String carrera;

    public Estudiante(String Universidad, String Carrera, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.universidad = Universidad;
        this.carrera = Carrera;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String Universidad) {
        this.universidad = Universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String Carrera) {
        this.carrera = Carrera;
    }
    
    @Override
    public String toString1() {
        return super.toString1()+"\n"
                + "Universidad=" + universidad + ", Carrera=" + carrera;
    }
    
    @Override
    public String toString2(){
        String dirs ="";
        for(Dirección d: direcciones){
            dirs+=d.getDireccion()+":";
        }
        if(!dirs.equals("")){
            dirs=dirs.substring(0,dirs.length()-1);
        }
        return "e:"+nombre+":"+apellido+":"+edad+":"+universidad+":"+carrera+":"+dirs;
    }
}
