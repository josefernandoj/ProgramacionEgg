/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer2_extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia7_Ejer2_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Punto p1 = new Punto();
        Scanner read = new Scanner(System.in); //.useDelimiter("\n");
        
        System.out.print("Ingrese coordenada X1: ");
        p1.setX1(read.nextInt());
        System.out.print("Ingrese coordenada y1: ");
        p1.setY1( read.nextInt());
        System.out.print("Ingrese coordenada X2: ");
        p1.setX2(read.nextInt());
        System.out.print("Ingrese coordenada y2: ");
        p1.setY2( read.nextInt());
        
        System.out.println("La distancia entre puntos es "+ p1.distancia());

    }

    }
 
    

