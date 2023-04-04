/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer4_extra;

import guia7_ejer4_extra.newpackage.cocina;

/**
 *
 * @author Fernando
 */
public class Guia7_Ejer4_Extra {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
       cocina menu  = new cocina ();
       menu.rellenar();
       menu.lista();
       menu.buscar();
  }
  
}
