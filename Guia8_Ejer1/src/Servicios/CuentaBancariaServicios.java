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
public class CuentaBancariaServicios {
   Scanner leer= new Scanner(System.in);
    
   public CuentaBancaria crearCuenta(){
      System.out.println("INGRESE NUM DE CUENTA DEL CLIENTE: ");
      int numcta= leer.nextInt();
      System.out.println("INGRESE DNI DEL CLIENTE: ");
      int dni= leer.nextInt();
      double saldo=0; 
      return new CuentaBancaria(numcta, dni, saldo);
     
    }
   
   public void ingresar(CuentaBancaria cuenta){
     System.out.println("INGRESE CANTIDAD DE DINERO A DEPOSITAR: ");
     double saldo= leer.nextDouble();
     saldo=cuenta.getSaldoActual()+saldo;
     cuenta.setSaldoActual(saldo);
   }
   
   public String consultarDatos(CuentaBancaria cuenta){
     
     return cuenta.toString();
   }
   
   public void retirar(CuentaBancaria cuenta){
     System.out.println("INGRESE CANTIDAD DE DINERO A RETIRAR: ");
     double saldo= leer.nextDouble();
     if (cuenta.getSaldoActual()==0){
        System.out.println("EL SALDO ACTUAL ES 0, NO PUEDE RETIRAR DINERO");
        saldo=0;
     }else if (cuenta.getSaldoActual()>0 && cuenta.getSaldoActual()<saldo)  {
         saldo=0;
     }else{
       saldo=cuenta.getSaldoActual()-saldo;}
     cuenta.setSaldoActual(saldo);
     }
   
   public void extraccionRapida(CuentaBancaria cuenta){
     double saldo;
     saldo=(cuenta.getSaldoActual()*20)/100;
     if (cuenta.getSaldoActual()==0){
        System.out.println("EL SALDO ACTUAL ES 0, NO PUEDE RETIRAR DINERO");
        saldo=0;
     }else if (cuenta.getSaldoActual()>0 && cuenta.getSaldoActual()<saldo)  {
         saldo=0;
     }else{
       System.out.println("EXTRACCION RAPIDA, SE EXTRAJO EL 20% DEL SALDO");
       saldo=cuenta.getSaldoActual()-saldo;}
     cuenta.setSaldoActual(saldo);
   }
   
   public void consultarSaldo(CuentaBancaria cuenta){
      System.out.println("EL SALDO ACTUAL DE SU CUENTA ES: "+cuenta.getSaldoActual());
   
   }
}
