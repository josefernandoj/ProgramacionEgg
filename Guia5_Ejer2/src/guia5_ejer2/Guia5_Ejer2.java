/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia5_Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int cont=0;
        System.out.println("Ingrese el tamaño de los vectores: ");
        int tam = leer.nextInt();        
        int[]vector1 = new int[tam];
        int[]vector2 = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el valor para la posicion "+i+" del vector 1:");
            vector1[i]=leer.nextInt();
        }
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el valor para la posicion "+i+" del vector 2:");
            vector2[i]=leer.nextInt();
        }
        for (int i = 0; i < tam; i++) {
           if (vector2[i]==vector1[i]){
              cont=cont+1;
           }else{
               System.out.println("Los vectores no son iguales");
               break;
           }
        }
        if (cont==tam){
            System.out.println("Los vectores son iguales");
        }
        
    }
}
