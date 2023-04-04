/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusa;

/**
 *
 * @author Fernando
 */
public class Jugador {
   private int id;
   private String nombre;
   private boolean vivo;

  public Jugador(int id) {
    this.id=id;
    this.vivo=true;
    this.nombre="Jugador "+id;        
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean isVivo() {
    return vivo;
  }

  public void setVivo(boolean vivo) {
    this.vivo = vivo;
  }
   
  public void disparar(Revolver r){
     System.out.println("El "+nombre+" se apunta con la pistola");
     
     if (r.disparar()){
       this.vivo=false; //el jugador muere
       System.out.println("El "+nombre+" ha muerto");
     }else{
       System.out.println("El "+nombre+" se ha salvado");
     }
  }
  
}
