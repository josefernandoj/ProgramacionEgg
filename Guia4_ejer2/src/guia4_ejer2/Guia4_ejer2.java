/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_ejer2;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia4_ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        datos();
        
    
    }
    
    public static void datos(){
    Scanner leer=new Scanner(System.in);
    String opc, mensaje="";    
        do{
        System.out.println("Ingrese nombre de la persona y la edad: ");
        String nombre=leer.next();
        int edad=leer.nextInt();
        if (edad>18){
            System.out.println(nombre+" "+edad+" Es legal");
        
        }else{
          System.out.println(nombre+" "+edad+" Es ilegal");
        
        }
        do{
            System.out.println("Quiere ingresar mas personas? si/no");
            opc=leer.next();
            opc=opc.toLowerCase();
            
        }while(!opc.equals("no")&&!opc.equals("si"));
        
        }while(!opc.equals("no"));
     
    }

}
