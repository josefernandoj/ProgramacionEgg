/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer4extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int num1;
     String roma ="";
     
     System.out.println("Ingrese un numero: (1-10");
     num1=leer.nextInt();
     
     switch (num1){
         case 1: roma="I";
         break;        
         case 2: roma="II";
         break;
         case 3: roma="III";
         break;
         case 4: roma="IV";
         break;
         case 5: roma="V";
         break;
         case 6: roma="VI";
         break;
         case 7: roma="VII";
         break;
         case 8: roma="VIII";
         break;
         case 9: roma="IX";
         break;
         case 10: roma="X";
         break;
         default: System.out.println("Ingrese la opcion correcta"); 
      
     
     }
     
        System.out.println("El numero en Romano es: "+roma);
     
    }
    
}
