/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_ejer4;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia5_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[][]matriz = new int[10][5];
       int nota1, nota2, nota3, nota4;
       nota1=0;
       nota2=0;
       nota3=0;
       nota4=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese la nota "+(j+1)+" del alumno "+(i+1));
                matriz[i][j]=leer.nextInt();
                switch (j){
                    case 0: nota1=matriz[i][j]*10/100;
                      break;
                    case 1: nota2=matriz[i][j]*15/100;
                      break;
                    case 2: nota3=matriz[i][j]*25/100;
                      break;  
                    case 3: nota4=matriz[i][j]*50/100;
                      break;  
            }
            
            if (3==j){
              matriz[i][4]=nota1+nota2+nota3+nota4;
            }
           }
        }
        int contap=0;
        int contdes=0;
        for (int i = 0; i < 10; i++) {
            if (matriz[i][4]>70){
              contap=contap+1;
            }else{
            contdes=contdes+1;
            }
        }
  
        System.out.println("La cantidad de alumnos aprobados es "+contap);
        System.out.println("La cantidad de alumnos desaprobados es "+contdes);
    }
}    

