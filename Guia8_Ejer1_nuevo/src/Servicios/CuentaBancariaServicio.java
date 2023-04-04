/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class CuentaBancariaServicio {
    Scanner leer=new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
      System.out.println("Ingrese el numero de cuenta: ");
      int num = leer.nextInt();
      System.out.println("Ingrese DNI del cliente: ");
      long dni = leer.nextLong();
      double saldo=0;
    return new CuentaBancaria(num, dni,saldo); 
    }
    
    public void ingresar(CuentaBancaria cuenta){
      System.out.println("Ingrese el monto a depositar: ");
      double monto=leer.nextDouble();
      cuenta.setSaldoActual(cuenta.getSaldoActual()+ monto);
      
    }  
    
    public void retirar(CuentaBancaria cuenta){
      System.out.println("Ingrese el monto a retirar: ");
      double monto=leer.nextDouble();
      if (cuenta.getSaldoActual()>=monto ){
          cuenta.setSaldoActual(cuenta.getSaldoActual()- monto);
      }else if (cuenta.getSaldoActual()>0){
          cuenta.setSaldoActual(0);
      }else{
         System.out.println("No hay fondos disponibles");
      }
    }  
    
    public void extraccionRapida(CuentaBancaria cuenta){
      System.out.println("Extraccion rapida, que monto desea retirar: "); 
      double extraer=leer.nextDouble();
      if ((cuenta.getSaldoActual()*0.20)>=extraer){
         cuenta.setSaldoActual(cuenta.getSaldoActual()-extraer);
      }else 
        System.out.println("Usted puede extraer solo el 20%");
      
    }
 
    public void consultarSaldo(CuentaBancaria cuenta){
       System.out.println("Su saldo actual es: "+cuenta.getSaldoActual());
    
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
      String tecla;
      System.out.println(cuenta.toString());
      System.out.println("Desea salir?");
      tecla=leer.nextLine();
      while (!"s".equals(tecla)){
         System.out.println("Ingrese la opcion correcta");  
         tecla=leer.nextLine();
      }
      
    }
    
}
