/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejer3;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia4_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros;
        String moneda;
        System.out.println("Ingrese cantidad de Euros a convertir: ");
        euros=leer.nextDouble();
        System.out.println("Ingrese a que moneda desea convertirlos: ");
        moneda=leer.next();
        
        convertir(euros, moneda);
        
        
        
    }
    
    public static void convertir(double euros, String moneda){
    double cambio=0;
    
    switch (moneda){
        case "dolares": cambio=euros*1.28611;
            break;
        case "yenes": cambio=euros*129852;
            break;
        case "libras": cambio=euros*0.86;
            break;    
    }
        System.out.println("El monto "+euros+" convertido a "+moneda+" es: "+cambio);
        
     
    }
            
    
}
