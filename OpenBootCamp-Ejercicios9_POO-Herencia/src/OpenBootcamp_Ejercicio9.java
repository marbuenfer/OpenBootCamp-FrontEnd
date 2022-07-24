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
public class OpenBootcamp_Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //creando un objeto Cliente que hereda de la clase Persona los datos edad, nombre y teléfono

        Cliente cliente1 = new Cliente(1500, 48, "Mar","969999999");
    
        //se muestran los datos del cliente
        System.out.println(cliente1.toString());
        
        //Creando un objeto trabajador
        Trabajador trabajador1 = new Trabajador(2500, 25 , "Alberto" , "589565656");
        
        //creando un objeto trabajador que hereda de la clase Persona los datos edad, nombre y teléfono
      
        System.out.println(trabajador1.toString()); 
    }
    
}
