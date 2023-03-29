/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer3;

import calculadora.operaciones;

/**
 *
 * @author Fernando
 */
public class Guia7_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1=0, num2=0;
        operaciones calcu=new operaciones(num1, num2);
        
        calcu.crearOperacion();
        System.out.println("El resultado de la suma es: "+calcu.sumar());
        System.out.println("El resultado de la resta es: "+calcu.restar());
        System.out.println("El resultado de la multiplicacion es: "+calcu.multiplicar());
        System.out.println("El resultado de la division es: "+calcu.dividir());
    }
    
}
