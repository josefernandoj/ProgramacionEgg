/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer5extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String clase;
        double costo=0; 
        double montotot=0;
        
        System.out.println("Ingrese la clase de socio: ");
        clase=leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento: ");
        costo=leer.nextFloat();
        
        switch (clase){
            case "A": montotot=costo-(costo*0.5);
            break;    
            case "B": montotot=costo-(costo*0.35);
            break;  
            case "C": montotot=costo;
            break;  
            default: System.out.println("Ingrese una opcion válida");
        }
        
        if (clase.equals("A") || clase.equals("B") || clase.equals("C")){
        
        
        
        System.out.println("El importe a pagar por clase "+clase+" es "+montotot);
        }
        
        
        
    }
    
}
