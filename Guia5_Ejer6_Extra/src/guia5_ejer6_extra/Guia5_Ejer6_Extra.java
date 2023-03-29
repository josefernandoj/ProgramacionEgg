/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer6_extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia5_Ejer6_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int randomfila;
        int randomcolumna;
        String palabra;
        
        String[][] matriz = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
               matriz[i][j] = String.valueOf((int) (Math.random() * 9 + 1));
               //matriz[i][j] = ".";
            }

        }
        int cant = 0;
        do {
            
            do {
            System.out.println("Ingrese una Palabra de 3 a 5 Caracteres, palabra "+(cant+1));
            palabra = input.nextLine();
            if (palabra.length()<3 || palabra.length()>5){
                System.out.println("Palabra incorrecta");
            }
            }while(palabra.length()<3 || palabra.length()>5);
            
            cant++;
            randomfila = (int) (Math.random() * 19 + 1);
            randomcolumna = (int) (Math.random() * 14 + 1);
            
                for (int j = 0; j < palabra.length(); j++) {
                    
                    matriz[randomfila][randomcolumna+j] = palabra.substring(j, j + 1);

                }

            
        } while (cant < 5);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
