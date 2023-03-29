/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Circunferencia {
    private double radio;
    Scanner leer= new Scanner(System.in);
    
    public Circunferencia(double radio){
      this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.println("Ingrese el Radio de la circunferencia: ");
        radio=leer.nextFloat();
    }
    
    public double area(){
      double area;
      return area=Math.PI*Math.pow(radio,2);  
    }
    
    public double perimetro(){
      double perimetro;
      return perimetro=(2*Math.PI*radio);
    }
}

