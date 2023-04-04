/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer4;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
      String frase, aux;
      
        System.out.println("Ingrese una frase: ");
        frase=leer.nextLine();
        aux=frase.substring(0,1);
        if (aux.equals("A")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }

   
    }
    

