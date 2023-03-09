
package Prueba;

import java.util.Scanner;

/**
 *
 * @author Temporal
 */
public class prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lee  = new Scanner(System.in);
        
        int var1, var2 , suma;
        
        System.out.println("Escriba dos números : ");
        var1 = lee.nextInt();
        var2 = lee.nextInt();
        suma = var1 + var2 ;
        System.out.println("Los núneros ingresados son " + var1 + " " + var2);
        
          System.out.println("Los núneros ingresados son " +( var1 +  var2 + suma));
          
                
    }

}
