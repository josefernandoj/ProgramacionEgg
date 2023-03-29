/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3_ejer7extra;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia3_Ejer7Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad, valor, valmin, valmax, promedio, acum, aux, cont;
        aux=0;
        valmax=0;   
        valmin=0;
        acum=0;
        cont=0;
        System.out.println("Ingrese la cantidad de numeros: ");
        cantidad=leer.nextInt();
         
        while (cont<cantidad) {
             cont=cont+1;
             System.out.println("Ingrese el valor del numero "+cont);    
             valor=leer.nextInt();
             acum=acum+valor;
             if (cont==1){
             valmin=valor;
             }
             if (valor>valmax){
             valmax=valor;
             
             }else{
             if (valor<valmin){
             valmin=valor;
             }
                     
             }
             
         }
         promedio=acum/cantidad;
         System.out.println("El valor maximo ingresado es: "+valmax);
         System.out.println("El valor minimo ingresado es: "+valmin);
         System.out.println("El promedio de los numeros ingresados es: "+promedio);
    }
    
}
