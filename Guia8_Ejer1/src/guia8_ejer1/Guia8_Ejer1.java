/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicios;

/**
 *
 * @author Fernando
 */
public class Guia8_Ejer1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    CuentaBancariaServicios cuentabanserv=new CuentaBancariaServicios();
    
    CuentaBancaria cuenta= cuentabanserv.crearCuenta();
    cuentabanserv.ingresar(cuenta);
    System.out.println(cuentabanserv.consultarDatos(cuenta));
    cuentabanserv.retirar(cuenta);
    System.out.println(cuentabanserv.consultarDatos(cuenta));
    cuentabanserv.extraccionRapida(cuenta);
    System.out.println(cuentabanserv.consultarDatos(cuenta));
    cuentabanserv.consultarSaldo(cuenta);
  }
   
}
