/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer5;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia5_Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cont=0;
        int matriz[][]=new int [3][3];
        int matriz2[][]=new int [3][3];
        
        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=leer.nextInt();
            }
        }
        System.out.println("Matriz ingresada: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz transpuesta: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j]=matriz[j][i];
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
 
                if (matriz[i][j]==-matriz2[i][j]){
 
                cont=cont+1;
                }
            }
        }
    if (cont==9){
        System.out.println("La matriz es antisimetrica");
    }else{
    System.out.println("La matriz no es antisimetrica");
    }    
        
    }
    
}
