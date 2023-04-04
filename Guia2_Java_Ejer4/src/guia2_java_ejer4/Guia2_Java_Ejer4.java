/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_java_ejer4;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia2_Java_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    Scanner leer = new Scanner(System.in);    
    int tempGC, tempGF;
    
    System.out.println("Ingresar la temperatura en grados centigrados: ");
    tempGC = leer.nextInt();
    tempGF = 32+(9*tempGC/5);
    System.out.println("La temperatura convertida en grados fahrenheit es: " + tempGF);
    
    
    
    
    }
    
}
