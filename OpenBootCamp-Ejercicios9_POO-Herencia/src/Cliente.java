/*
 * Clase Cliente que hereda de la clase Persona
 */
package openbootcamp;

/**
 * @author MARIA DEL CARMEN BUENESTADO FERNANDEZ
 */

public class Cliente extends Persona {
    int credito;

    public Cliente(int credito, int edad, String nombre, String telefono) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public Cliente(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

   
    @Override
    public String toString() {
        return super.toString() + "Datos del cliente: \n" + "********************" +  "\n" + "Crédito: " + this.getCredito() + "\n" + "\n" + "-------------------\n\n" ;
    }
}
