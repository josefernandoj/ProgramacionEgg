/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_java_ejer5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia2_Java_Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner Leer = new Scanner(System.in);
    int doble, triple;
    double raiz;
    System.out.println("Ingrese un numero entero: ");
    int numero = Leer.nextInt();
    doble=numero*2; 
    System.out.println("El doble del numero es: " + doble);
    triple=numero*3;
    System.out.println("El triple del numero es: " + triple);
    raiz=Math.sqrt(numero);
    System.out.println("La raiz cuadrada del numero es: " + raiz);
        
    }
    
}
