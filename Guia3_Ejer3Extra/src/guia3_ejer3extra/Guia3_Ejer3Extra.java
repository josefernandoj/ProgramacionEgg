/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer3extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra: ");
        letra=leer.nextLine();
        
        if (letra.equals("a")||letra.equals("e")|| letra.equals("i")|| letra.equals("o")|| letra.equals("u") )
        {
            System.out.println("La letra es una vocal");
        }else {
        System.out.println("La letra NO es una vocal");
        }
        
        
    }
    
}
