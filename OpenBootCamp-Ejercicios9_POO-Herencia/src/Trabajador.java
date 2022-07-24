/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openbootcamp;

/**
 *
 * @author Usuario
 */
public class Trabajador extends Persona  {
    double salario;

    public Trabajador(double salario, int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public Trabajador(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + "Datos del trabajador: \n" + "********************" +  "\n" + 
                "Salario = " + salario  ;
    }    
}

