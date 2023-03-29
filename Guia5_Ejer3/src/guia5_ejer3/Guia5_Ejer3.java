/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer3;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia5_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[]vector1 = new int[10];
       rellenar(vector1); 
       mostrar(vector1);
    }
    
    public static void rellenar(int vector1[]) {
        Scanner leer;
        leer = new Scanner(System.in);
         
        System.out.println("Rellenando el vector: ");
        for (int i = 0; i < 10; i++) {
           vector1[i] = (int) (Math.random()*10+1); 
           try { Thread.sleep(500); } catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
           
           System.out.print("- ");
        }
        System.out.println(" ");        
       
    }
    public static void mostrar(int vector1[]){
        System.out.println("Mostrando el vector: "); 
        for (int i = 0; i < 10; i++) {
            System.out.print(vector1[i]+" "); 
            try { Thread.sleep(500); } catch(InterruptedException ex) { Thread.currentThread().interrupt(); }
        }
     System.out.println(" ");
    }
}
