/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fueradeguia2;

import RuletaRusa.Juego;

/**
 *
 * @author Fernando
 */
public class FueradeGuia2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Juego juego=new Juego(6);
    
    while(!juego.finJuego()){
       juego.ronda();
    }
    System.out.println("El juego ha terminado");
  }
  
}
