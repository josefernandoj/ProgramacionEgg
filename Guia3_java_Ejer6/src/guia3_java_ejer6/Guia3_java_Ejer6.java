/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_java_ejer6;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_java_Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un numero entero :");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero entero :");
        num2 = leer.nextInt();
        if (num1>25) {
            System.out.println("El primer numero es mayor a 25");
        }   
        if (num2>25) {
            System.out.println("El segundo numero es mayor a 25");      
                    }
        }
    }
    
