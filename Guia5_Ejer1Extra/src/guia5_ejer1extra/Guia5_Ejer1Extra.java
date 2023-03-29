/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer1extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia5_Ejer1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma=0;
        System.out.println("Ingrese el tamaño del vector: ");
        int tam = leer.nextInt();        
        int[]vector = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el valor para la posicion "+i+":");
            vector[i]=leer.nextInt();
            suma=suma+vector[i];
        }
        System.out.println("La suma de los valores del vector es: "+suma);
    }
    
}
