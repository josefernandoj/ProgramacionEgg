/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int numero=0;
      int cont=0;
      int suma=0;
      do {System.out.println("Ingrese un numero: ");
      numero = leer.nextInt();
      cont=cont+1;
      if (numero>=0){
      suma=suma+numero;}
      if (cont==20){
      break; }
      } while (numero!=0);
      if (numero==0){
          System.out.println("Se ha capturado el 0");}
          System.out.println("La suma de los numeros es : "+suma);
      
    }
    
}
