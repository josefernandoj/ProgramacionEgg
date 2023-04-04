/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer5_extra;

import cuenta.Ccuenta;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia7_Ejer5_Extra {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner leer= new Scanner(System.in);
    
    Ccuenta cliente = new Ccuenta();
    
    System.out.println("Ingrese el nombre del cliente: ");
    cliente.setTitular(leer.nextLine());
    System.out.println("Ingrese el monto del saldo: ");
    cliente.setSaldo(leer.nextDouble());
    cliente.retirarDinero();
    
    System.out.println("El saldo disponible es: "+cliente.getSaldo());
  }
  
}
