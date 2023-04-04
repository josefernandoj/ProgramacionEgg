/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer2extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       int A,B,C,D,aux;
        System.out.println("Ingrese un mumero para A:");
        A=leer.nextInt();
        System.out.println("Ingrese un mumero para B:");
        B=leer.nextInt();
        System.out.println("Ingrese un mumero para C:");
        C=leer.nextInt();
        System.out.println("Ingrese un mumero para D:");
        D=leer.nextInt();
        
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("El valor de A es: "+A);
        
        System.out.println("El valor de B es: "+B);
        
        System.out.println("El valor de C es: "+C);
        
        System.out.println("El valor de D es: "+D);
        
       
    }
    
}
