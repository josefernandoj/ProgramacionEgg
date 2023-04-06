
package ej3_guia8.servicios;

import ej3_guia8.entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer= new Scanner(System.in);
    
    
    
    public Persona crearPersona(){
        System.out.println("Ingrese nombre de la persona: ");
        String nombre= leer.next();
        System.out.println("Ingrese la edad: ");
        short edad= leer.nextShort();
        System.out.println("Ingrese el peso: ");
        float peso= leer.nextShort();
        System.out.println("Ingrese la altura: ");
        float altura= leer.nextShort();
        
        return new Persona(nombre, edad, peso, altura);
        
    }
    
    public boolean esMayorDeEdad(Persona p1){
        boolean bandera=false;
        if(p1.getEdad()>=18){
            bandera=true;
 
        }
        return bandera;
    }
    
    public short calcularIMC(Persona p1){
        float IMC, peso, altura;
        short valor;
        peso=p1.getPeso();
        altura=(float) Math.pow((p1.getAltura()/100), 2);
        IMC=peso/altura;
        
        if(IMC<20){
          //  System.out.println(p1.getNombre()+" Esta por debajo de su peso ideal");
            valor=-1;
        }
        else if(IMC>=20 && IMC<=25){
           // System.out.println(p1.getNombre()+" Esta en su peso ideal");
            valor=0;  
        }
        else{
            //System.out.println(p1.getNombre()+" Esta por encima de su peso ideal");
            valor=1;
        }
       return valor;
    }
    
    public void calcularporcIMC(short vect[]){
    
      int ideal=0, debajo=0,arriba=0;
             for (int i = 0; i < 4; i++) {
            
            
            switch (vect[i]) {
                case -1:
                    debajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                default:
                    arriba++;
                    break;
            }
            
            
        }
            System.out.println("IMC bajo: "+(debajo*100/4)+"%");
            System.out.println("IMC ideal: "+(ideal*100/4)+"%");
            System.out.println("IMC elevado: "+(arriba*100/4)+"%");
    }
    
   public void calcularporcMyM(boolean vedad[]){
   
               int mayor=0, menor=0; 
             for (int i = 0; i <4; i++) {
                
                 if(vedad[i]){
                     mayor++;
                 }
                 else{
                     menor++;
                 }

        }
           System.out.println("Mayores: "+(mayor*100/4));
                 System.out.println("Menores: "+(menor*100/4)); 
   } 
}
