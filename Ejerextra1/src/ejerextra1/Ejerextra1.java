/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra1;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ejerextra1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    String nombre=" ", sexo=" ";
    int dni=0, edad=0,peso=0;
    double altura;
    altura = 0;
    Persona per=new Persona(nombre, edad, dni, sexo, peso, altura);
    
    System.out.println("Ingrese el nombre de la persona: ");
    per.setNombre(leer.nextLine());
    System.out.println("Ingrese la edad: ");
    per.setEdad(leer.nextInt());
    System.out.println("Ingrese el sexo: ");
    per.setSexo(leer.nextLine());
    System.out.println("Ingrese la altura: ");
    per.setAltura(leer.nextInt());
    System.out.println("Ingrese el peso: ");
    per.setPeso(leer.nextInt());
    
    System.out.println("El dni es: "+per.generaDNI());
    if (per.esMayorDeEdad()){
    System.out.println("La persona es mayor de edad ");
    }else System.out.println("La persona es menor de edad");
    switch ((int)per.calcularIMC()) {
      case -1:
        System.out.println("La persona tiene bajo peso");
        break;
      case 0:
        System.out.println("La persona esta en su peso ideal");
        break;
      case 1:
        System.out.println("La persona tiene sobrepeso");
        break;
    }
    
  }
  
}
