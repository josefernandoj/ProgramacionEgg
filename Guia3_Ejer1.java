/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer1;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero :");
        numero = leer.nextInt();
        
        if (numero%2==0){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
        
    }
    
}
