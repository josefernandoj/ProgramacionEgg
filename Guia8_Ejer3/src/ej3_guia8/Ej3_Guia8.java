
package ej3_guia8;

import ej3_guia8.entidades.Persona;
import ej3_guia8.servicios.PersonaServicio;
import java.util.Scanner;

public class Ej3_Guia8 {


    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        Persona vpersona[]= new Persona[4];
        boolean vedad[]= new boolean[4];
        short vimc[]= new short[4];
        
            PersonaServicio servicio= new PersonaServicio();

            for (int i = 0; i < 4; i++) {
                vpersona[i]=servicio.crearPersona();
                
            }
            
             //----------------------------------------------
             for (int i = 0; i < 4; i++) {
                vedad[i]=servicio.esMayorDeEdad(vpersona[i]);
                vimc[i]= servicio.calcularIMC(vpersona[i]);
             }
        servicio.calcularporcIMC(vimc);
        servicio.calcularporcMyM(vedad);
        
        }
 
}
