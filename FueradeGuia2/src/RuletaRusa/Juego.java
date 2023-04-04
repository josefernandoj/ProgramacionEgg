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
public class Juego {
  private Jugador[] jugadores;
  private Revolver revolver;      

  public Jugador[] getJugadores() {
    return jugadores;
  }

  public void setJugadores(Jugador[] jugadores) {
    this.jugadores = jugadores;
  }

  public Revolver getRevolver() {
    return revolver;
  }

  public void setRevolver(Revolver revolver) {
    this.revolver = revolver;
  }

  
  
  public Juego(int numjugadores) {
    
   // if (!(numjugadores>=1 && numjugadores<=6)){
   //    numjugadores=6;  
   //}
    this.jugadores = new Jugador[numjugadores];
    for (int i = 0; i < jugadores.length; i++) {
      jugadores[i]=new Jugador(i+1);
    
    }
    this.revolver = new Revolver();
  }


  public boolean finJuego(){
     for (int i = 0; i < jugadores.length; i++) {
       if (!(jugadores[i].isVivo())){
          return true;
       }
    }
   return false; 
  } 

  public void ronda() {
    for (int i = 0; i < jugadores.length; i++) {
       jugadores[i].disparar(revolver);
    }
    
}

}
