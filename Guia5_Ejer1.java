/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer1;

/**
 *
 * @author Fernando
 */
public class Guia5_Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro y creo un vector
        int[] vector = new int[100];

        //recorro la fila 
         for (int i = 0; i < vector.length; i++){
            vector[i] = i+1;

        }

        // Muestro el vector
        for (int i = vector.length-1; i>= 0; i--) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
    
}
