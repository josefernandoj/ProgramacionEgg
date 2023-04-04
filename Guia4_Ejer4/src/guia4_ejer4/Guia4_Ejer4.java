/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejer4;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia4_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int num;
       
        System.out.println("Ingrese un numero: ");
        num=leer.nextInt();
        
        if(primo(num)){
            System.out.println("El numero ingresado es primo");
        }else{
            System.out.println("El numero ingresado no es primo");
        }
        
    }
    
    public static boolean primo(int num){
    int resto, cont=0;
    boolean resultado; 
        for (int i = 1; i <= num; i++) {
               resto=num%i;
               if (resto==0 && num!=1){
                  cont++;
            }
            
            }
            if (cont==2){
            resultado=true;
            }else{
            resultado=false;
            }
            return resultado;
        }
    
    }
        
