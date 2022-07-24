/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openbootcamp;

/**
 *
 * @author MARIA DEL CARMEN BUENESTADO FERNÁNDEZ
 */
public class Persona {
   private int edad;
   private String nombre;
   private String telefono;
   
   
   //constructor con parámetros

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    //constructor sin parámetros
    public Persona() {
        this.edad = 25;
        this.nombre = "Juan";
        this.telefono = "698656565";
    }
   
   //setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //getters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Datos de la persona: \n" + "********************" +  "\n" +  "edad = " + edad + "\n" + "nombre = " + nombre +  "\n" + "telefono = " + telefono +  "\n" ;
    }
   
   
}
