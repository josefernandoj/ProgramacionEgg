/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer13extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer13Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese el numero de escalones: ");
        num=leer.nextInt();
        
        for (int i = 0; i < num+1 ; i++) {
            for (int j = 1 ; j < i+1 ; j++) {
                System.out.print(j);
                
            }
          System.out.println(" ");
    }
    
}
}