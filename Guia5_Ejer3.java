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
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero n");
        int n=leer.nextInt();
        
        int[] vector =new int[n];
        int d1=0, d2=0, d3=0, d4=0, d5=0;
        
        for (int i = 0; i < vector.length; i++) {
           vector[i] = (int) (Math.random() * 99999);
           
                
        }
        
            for (int elemento : vector) {                   //forma mejorada
            System.out.print("[" + elemento + "]");
            
                if(elemento>9 && elemento<100){
                    d2++;
                }
                else if(elemento>99 && elemento<1000){
                   d3++;
                }
                else if(elemento>999 && elemento<10000){
                   d4++;
                }
                else if(elemento>9999 && elemento<100000){
                    d5++;
                }
                else{
                    d1++;
                }   
            }
           
            System.out.println("\n Se encontraron "+ d1 +" numeros de 1 digito"+ "\n Se encontraron "+ d2 +" numeros de 2 digitos"+ "\n Se encontraron "+ d3 +" numeros de 3 digitos"+"\n Se encontraron "+ d4 +" numeros de 4 digitos"+"\n Se encontraron "+ d5 +" numeros de 5 digitos");
   
 
    }

}
