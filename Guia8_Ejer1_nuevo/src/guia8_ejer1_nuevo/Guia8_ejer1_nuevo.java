/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer1_nuevo;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author Fernando
 */
public class Guia8_ejer1_nuevo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    CuentaBancariaServicio ctaserv = new CuentaBancariaServicio();
    CuentaBancaria cliente = ctaserv.crearCuenta();
    
    ctaserv.ingresar(cliente);
    ctaserv.consultarSaldo(cliente);
    ctaserv.retirar(cliente);
    ctaserv.consultarSaldo(cliente);
    ctaserv.extraccionRapida(cliente);
    ctaserv.consultarSaldo(cliente);
    ctaserv.consultarDatos(cliente);
    
  }
  
}
