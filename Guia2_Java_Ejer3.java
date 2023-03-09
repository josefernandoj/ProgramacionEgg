/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_java_ejer3;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia2_Java_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.println("Convertida a minuscula: ");
        System.out.println(frase.toLowerCase());
        System.out.println("Convertida a mayusculas: ");
        System.out.println(frase.toUpperCase());
        
        
        
    }
    
}
