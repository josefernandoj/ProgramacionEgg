/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer4;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia5_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int[][] matriz= new int[4][4];
        System.out.println("Matriz original: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(int) (Math.random()*99);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println(" ");
        }
        
    }
    
}
