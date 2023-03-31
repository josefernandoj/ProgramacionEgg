/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe_eje1;

/**
 *
 * @author Fernando
 */
public class POE_Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      System.out.print("\033[33m mandarina");
      System.out.print("\033[32m hierba");
      System.out.print("\033[31m tomate");
      System.out.print("\033[37m sábanas");
      System.out.print("\033[36m cielo");
      System.out.print("\033[35m nazareno");
      System.out.print("\033[34m mar");
      System.out.println("");
      
      System.out.printf("El número %d no tiene decimales.\n", 21);
      System.out.printf("El número %f sale con decimales.\n", 21.0);
      System.out.printf("\033[34mEl %.2f sale exactamente con 2 decimales.\n", 21.0);
    }
    
}
