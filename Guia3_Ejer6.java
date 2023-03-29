/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer6;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer6 {

    public static void limpia(int n) {
    for (int i = 0; i < n; i ++)
    System.out.println();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
      Scanner leer=new Scanner(System.in);
      float num1, num2, resultado;
      int opcion;
 
      resultado=0;
        System.out.println("Ingrese dos numeros: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
       
        do {
           
        System.out.println("Ingrese una opcion:  ");
        System.out.println("1-SUMAR: ");
        System.out.println("2-RESTAR: ");
        System.out.println("3-MULTIPLICAR: ");
        System.out.println("4-DIVIDIR: ");
        System.out.println("5-SALIR: ");
        opcion=leer.nextInt();
        
        switch (opcion){
            case 1: resultado=num1+num2;
                    break;
            case 2: resultado=num1-num2;
                    break;                 
            case 3: resultado=num1*num2; 
                    break;
            case 4: resultado=num1/num2;
            
            case 5: break;
                
            default: System.out.println("Ingrese la opcion correcta");
           
        }
           if (opcion!=5) {
               System.out.println("El resultado es: " + resultado);
               
            }
              
        
       } while (opcion!=5);        
              
    }
    
}
