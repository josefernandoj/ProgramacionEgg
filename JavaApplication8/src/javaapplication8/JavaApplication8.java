/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1, num2;
        System.out.println("Ingrese el primer numero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextInt();
        if (num1>25) {
            System.out.println("El primer numero es mayor a 25");
        }else{
            System.out.println("El primer numero es menor a 25");
        }
        if (num2>25) {
            System.out.println("El segundo numero es mayor a 25");
        }else{
            System.out.println("El segundo numero es menor a 25");
        }
    }
    
}
