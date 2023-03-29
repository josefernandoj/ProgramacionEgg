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
public class Rectangulo {
    private double base;
    private double altura;

     Scanner leer= new Scanner(System.in);
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    
    public void crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo: ");
        base=leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura=leer.nextDouble();
    }
    public double superficie(){
      double superficie;
        superficie=base*altura;
      return superficie;  
    }
    public double perimetro(){
      double perimetro;
        perimetro=base*2+altura*2;
      return perimetro;  
    }
    public void dibujarRectangulo(){
       
       String matriz[][]=new String[(int) base][(int) altura];  
       
       for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
              matriz[i][j]=" " ; 
            }
       }
       
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
            
                  if (i==0){
                    matriz[i][j]="*";
                  }
                  if (i>0 && j==0){
                    matriz[i][j]="*";
                  }
                  if (j==altura-1){
                    matriz[i][j]="*";
                  }
                  if (i==base-1){
                    matriz[i][j]="*";
                }
              }
        } 
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
            }
            
            
        }
