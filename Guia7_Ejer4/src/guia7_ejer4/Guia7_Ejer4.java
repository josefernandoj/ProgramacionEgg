/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer4;

import figuras.Rectangulo;

/**
 *
 * @author Fernando
 */
public class Guia7_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double base=0, altura=0;
      Rectangulo rect1=new Rectangulo(base, altura);  
      rect1.crearRectangulo();
        System.out.println("La superficie del rectangulo es: "+rect1.superficie());
        System.out.println("El perimetro del rectangulo es: "+rect1.perimetro());
        rect1.dibujarRectangulo();
    }
    
}
