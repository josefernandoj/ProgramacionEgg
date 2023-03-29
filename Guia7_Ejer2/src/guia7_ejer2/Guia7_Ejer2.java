/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer2;

import figuras.Circunferencia;



/**
 *
 * @author Fernando
 */
public class Guia7_Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Scanner leer= new Scanner(System.in);
      double radio=0;
      
      Circunferencia circulo=new Circunferencia(radio);
        circulo.crearCircunferencia();
        System.out.println("El area del circulo es: "+circulo.area());
        System.out.println("El perimetro del circulo es: "+circulo.perimetro());
      
    }
    
}
