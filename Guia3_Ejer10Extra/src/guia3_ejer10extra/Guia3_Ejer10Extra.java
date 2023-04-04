/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer10extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer10Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
        int numero,conta=0;
        
        System.out.println("Ingrese un numero y contaremos los digitos que contiente");
        numero=leer.nextInt();
        
        do{
            numero=numero/10;
                    conta++;
        }while(numero>0);
            
        System.out.println("El numero ingresado tiene: "+conta+" digitos.");
        
    }
    }
    

