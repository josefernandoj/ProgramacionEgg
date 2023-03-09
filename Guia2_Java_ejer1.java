/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_java_ejer1;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia2_Java_ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Escriba dos numeros enteros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1+num2;
        System.out.println("La suma de los numeros es: " + suma);
        
    }
    
}
