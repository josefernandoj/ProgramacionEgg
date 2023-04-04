/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después 
de realizar una transacción de retiro.

 */
package cuenta;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Ccuenta {
   private double saldo;
   private String titular;
   
   Scanner leer= new Scanner(System.in);
   
  public Ccuenta(){
  
  } 

  public Ccuenta(double saldo, String titular) {
    this.saldo = saldo;
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }
   
  public void retirarDinero(){
    
    if (this.saldo>0){
    System.out.println("Ingrese el monto de dinero a retirar: ");
        this.saldo=this.saldo-leer.nextDouble();
    }else{
      System.out.println("Su cuenta esta vacia");
    } 
      
  } 
   
}
