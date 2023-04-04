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
public class Revolver {
  private int posactual;
  private int posbala;

  public Revolver() {
    posactual=(int) (Math.random()*6+1);
    posbala=(int) (Math.random()*6+1);
  }

  public int getPosactual() {
    return posactual;
  }

  public void setPosactual(int posactual) {
    this.posactual = posactual;
  }

  public int getPosbala() {
    return posbala;
  }

  public void setPosbala(int posbala) {
    this.posbala = posbala;
  }
 
  public boolean disparar(){
    boolean disparo=false;
    if (this.posactual==this.posbala){
      disparo=true;
    }
    siguienteBala();
    return disparo;
  }
 
  public void siguienteBala(){
  
   if (posactual!=6){  
     posactual=posactual+1;
   }else{  
     posactual=1;
             }
  
  }

  @Override
  public String toString() {
    return "Revolver{" + "posactual=" + posactual + ", posbala=" + posbala + '}';
  }
  
  
  
}
