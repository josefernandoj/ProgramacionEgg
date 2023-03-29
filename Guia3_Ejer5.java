/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma, num, lim; 
        suma=0;
        System.out.println("Ingrese el limite de numeros: ");
        lim=leer.nextInt();
        
        do
        {
            System.out.println("Ingrese un numero: ");
            num = leer.nextInt();
            suma=suma+num;
        }
        while (suma<lim);
    }
    
}
