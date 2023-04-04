/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer6extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double cantidad, estatura, cont160=0,acum=0, acum160=0,prom160=0,promgen;
        
        System.out.println("Ingrese la cantidad de personas: ");
        cantidad=leer.nextDouble();
        
        for (int i = 1; i<cantidad+1 ; i++) {
            System.out.println("Ingrese la estatura de la persona "+i);
            estatura=leer.nextDouble();
            if (estatura<160){
             cont160=cont160+1;
             acum160=acum160+estatura;
             
            }
            acum=acum+estatura;
            
        }
        prom160=acum160/cont160;
        promgen=acum/cantidad;
        System.out.println("Promedio de estaturas debajo de 160cm: "+prom160);
        System.out.println("Promedio de todas las estaturas: "+promgen);
            
        }
        
    }
    
