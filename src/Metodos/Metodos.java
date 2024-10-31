/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

// metodo para ir guardando 

import Alumno.Alumno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
// se agurdo un  alumno en el vector principal
public class Metodos {
  Vector vPrincipal = new Vector();
  
  public void guardar (Alumno unAlumno ){
    vPrincipal.addElement(unAlumno);
      
  }  
  public void guardarArchivo(Alumno Alumno){
      try{
        // creamos un archivo de texto
     FileWriter fw = new FileWriter("Alumnos.txt", true);     
   BufferedWriter bw = new BufferedWriter(fw);
     PrintWriter pw = new PrintWriter  (bw);
     pw.print(Alumno.getNombre());
     pw.print(" | " +Alumno.getApepat());
      pw.print(" | " +Alumno.getApeMat());
       pw.print(" | " +Alumno.getCURP());
        pw.println(" | " +Alumno.getCarrera());
        pw.close();
      }catch(Exception e){
          
          JOptionPane.showMessageDialog(null, e);
    
      }
      // tabla en una interfaz grafica
  }
  public DefaultTableModel listaAlumnos(){ 
      Vector cabeceras = new Vector();// columnas  
      cabeceras.addElement("Nombre");
      cabeceras.addElement("Apelldo Paterno");
      cabeceras.addElement("Apelldo Materno");
      cabeceras.addElement("CURP");
      cabeceras.addElement("Carrera");
      DefaultTableModel  mdTabla= new DefaultTableModel (cabeceras, 0);
      try{ // 
          FileReader  fr= new FileReader("Alumnos.txt");
          BufferedReader br= new BufferedReader(fr);
          String d; //  mientras que d se a igual
           while((d=br.readLine())!=null){
          
          StringTokenizer dato = new StringTokenizer(d,"|");
        Vector x = new Vector ();
        while( dato.hasMoreTokens()){
          x.addElement(dato.nextToken());
              } 
        
        mdTabla.addRow(x);
          }
          }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
                  
               
                  }
          return mdTabla;
      }
    
  }
  

