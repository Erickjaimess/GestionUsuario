/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;


public class Alumno {
   String Nombre;
String Apepat;
String ApeMat;
String CURP;
String Carrera;
//se obtiene los datos de un atribito
    public Alumno(String Nombre, String Apepat, String ApeMat, String CURP, String Carrera) {
        this.Nombre = Nombre;
        this.Apepat = Apepat;
        this.ApeMat = ApeMat;
        this.CURP = CURP;
        this.Carrera = Carrera;
    }
    
public Alumno(){
    
}
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApepat() {
        return Apepat;
    }

    public void setApepat(String Apepat) {
        this.Apepat = Apepat;
    }

    public String getApeMat() {
        return ApeMat;
    }

    public void setApeMat(String ApeMat) {
        this.ApeMat = ApeMat;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

}
