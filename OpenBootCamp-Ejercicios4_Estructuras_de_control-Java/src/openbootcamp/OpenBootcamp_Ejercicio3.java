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
public class OpenBootcamp_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*****PRIMERA PARTE*****\n"); 
        System.out.printf("El resultado de la suma es:  %d\n\n", suma(1,5,2) );
        
        System.out.println("*****SEGUNDA PARTE*****\n");
        
        //Se crea una instancia del objeto Coche
        Coche coche1 = new Coche();
        System.out.printf("El número de puertas que tiene el coche es:  %d\n\n", coche1.incrementaPuertas());
    }
    static public int suma(int n1, int n2, int n3){
         //Se suman los número pasados como parámetros
         return n1 + n2 + n3;
    }
    
}
