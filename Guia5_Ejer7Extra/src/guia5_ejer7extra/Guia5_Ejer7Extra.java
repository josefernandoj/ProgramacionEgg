/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer7extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia5_Ejer7Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int a=1;
        int b=1;
        int c=0;
        System.out.println("Ingrese el numero para calcular la serie de fibonacci: ");
        n=leer.nextInt();
        int vector[] = new int [n];
        for (int i = 0; i < n; i++) {
           vector[i]=a;
           c=a+b;
           a=b;
           b=c;           
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i]+" ");
        }
    }
    
}
