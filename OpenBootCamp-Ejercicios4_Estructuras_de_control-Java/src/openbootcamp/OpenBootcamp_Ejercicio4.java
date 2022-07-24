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
public class OpenBootcamp_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //****Declaración de variablles****
        int numeroIf, numeroWhile, numeroFor;
        String estacion;

        //****Inicialización de variables****
        numeroIf = 5;
        numeroWhile = 2;
        numeroWhile = 2;
        numeroFor = 0;
        estacion = "verano";

        //PROBANDO IF
        System.out.println("****PROBANDO ESTRUCTURA IF****\n");

        if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + " es positivo\n\n");
        } else if (numeroIf == 0) {
            System.out.println("El número " + numeroIf + " es cero\n\n");
        } else {
            System.out.println("El número " + numeroIf + " es negativo\n\n");
        }

        //PROBANDO WHILE
        System.out.println("****PROBANDO ESTRUCTURA WHILE****\n");

        while (numeroWhile < 3) {
            System.out.printf("El valor de la variable numeroWhile es: %d\n", numeroWhile);
            numeroWhile++;
            System.out.printf("El valor de la variable  numeroWhile incrementada es: %d\n\n", numeroWhile);
        }

        //PROBANDO DO-WHILE
        System.out.println("****PROBANDO ESTRUCTURA DO-WHILE****\n");

        do {
            System.out.printf("El valor de la variable numeroWhile es: %d\n", numeroWhile);
            numeroWhile++;
            System.out.printf("El valor de la variable  numeroWhile incrementada es: %d\n\n", numeroWhile);
        } while (numeroWhile < 3);

        //PROBANDO FOR
        System.out.println("****PROBANDO ESTRUCTURA FOR****\n");

        for (int i = 0; i <= 3; i++) {
            numeroFor++;
            System.out.printf("El valor de la variable  numeroFor incrementada es: %d\n\n", numeroFor);
        }
        //PROBANDO SWITCH
        System.out.println("****PROBANDO ESTRUCTURA SWITCH****\n");

        switch (estacion) {
            case "primavera":
                System.out.println("La estación es primavera");
                break;
            case "verano":
                System.out.println("La estación es verano");
                break;
            case "otoño":
                System.out.println("La estación es otoño");
                break;
            case "invierno":
                System.out.println("La estación es invierno");
                break;
            default:
                System.out.println("La estación no existe");
        }

    }
}
