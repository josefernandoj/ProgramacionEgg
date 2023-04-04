/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Fernando
 */
public class Cafetera {
    private int capacidadMáxima;  //atributos
    private int cantidadActual;

  public Cafetera() {  //constructor vacio
  }

  public Cafetera(int capacidadMáxima, int cantidadActual) {  //constructor con parametros
    this.capacidadMáxima = capacidadMáxima;
    this.cantidadActual = cantidadActual;
  }

  public int getCapacidadMáxima() {  //getters & setters
    return capacidadMáxima;
  }

  public void setCapacidadMáxima(int capacidadMáxima) {
    this.capacidadMáxima = capacidadMáxima;
  }

  public int getCantidadActual() {
    return cantidadActual;
  }

  public void setCantidadActual(int cantidadActual) {
    this.cantidadActual = cantidadActual;
  }
    
    
    
}
