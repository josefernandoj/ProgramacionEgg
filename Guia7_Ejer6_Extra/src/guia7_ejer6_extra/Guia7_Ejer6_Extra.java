/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer6_extra;

import Empresa.Empleado;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia7_Ejer6_Extra {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        Empleado emp1 = new Empleado();
             
        System.out.println("Ingrese su nombre");
        emp1.setNombre(sc.nextLine());
        System.out.println("Ingrese su edad");
        emp1.setEdad(sc.nextInt());
        System.out.println("Ingrese el salario");
        emp1.setSalario(sc.nextDouble());
        
        //System.out.println("El salario actual es: \\033[34mEl %.2f "+Math.round(emp1.calcular_aumento()));
        System.out.printf("\033[30mEl %.2f sale exactamente con 2 decimales.\n", 1.0);
    }
        
    
}

