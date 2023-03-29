/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer1extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float aux, tiempohs, tiempom, dias; 
        aux=0;
        System.out.println("Ingrese los minutos: ");
        tiempom=leer.nextInt();
        
        tiempohs=tiempom/60;
        dias=tiempohs/24;
        dias=(int)dias;
        
        if (tiempohs>24){
        
            aux=tiempohs%24;
            aux=(int)aux;
        }
        
        
        System.out.println("Son : "+dias+" dias y "+aux+" horas" );
    }
    
}
