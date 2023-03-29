/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_java_ejer8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_java_Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int nota;
        System.out.println("Ingrese una nota entre 1 y 10");
        nota = leer.nextInt();
        
        while (nota <0 || nota >11){
            System.out.println("La nota ingresada es incorrecta");
        nota = leer.nextInt();}
        
    
     
        
    }
    
}
