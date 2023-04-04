/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class CafeteraServicio {
  Scanner leer= new Scanner (System.in);
      // metodos
  public void llenarCafetera(Cafetera caf1){
    caf1.setCantidadActual(1000);
    caf1.setCapacidadMáxima(1000);
    System.out.println("La cafetera ha sido llenada con 1000 cm3"); 
    System.out.println("Presione una tecla para continuar...");
    leer.nextLine();

  }
  
  public void servirTaza(Cafetera caf1, int tamanio){
     if (caf1.getCantidadActual()>=tamanio){
        System.out.println("Llenando taza con "+tamanio+"cm3 de café");
        int dif=caf1.getCantidadActual()-tamanio;
        caf1.setCantidadActual(dif);
        System.out.println("Queda en la cafetera "+caf1.getCantidadActual()+"cm3 de café");
     }else if (caf1.getCantidadActual()>0){
         System.out.println("Llenando taza con "+caf1.getCantidadActual()+"cm3 de café");  
         caf1.setCantidadActual(0);
         System.out.println("Queda en la cafetera "+caf1.getCantidadActual()+"cm3 de café");
     }else{
       System.out.println("No hay cafe en la cafetera");
     }
     System.out.println("Presione una tecla para continuar...");
     leer.nextLine();
  }
  
  public void vaciarCafetera(Cafetera caf1){ //pone la cantidad de cafe actual en cero
    caf1.setCantidadActual(0);
    System.out.println("Se ha vaciado la cafetera");
    System.out.println("Presione una tecla para continuar...");
     leer.nextLine();
  }
  
  public void agregarCafe(Cafetera caf1, int cantidad){ //añade a la cafetera la cantidad de café indicada.
    if (caf1.getCapacidadMáxima()>=cantidad){
       if ((caf1.getCantidadActual()+cantidad)<=caf1.getCapacidadMáxima()){
          caf1.setCantidadActual(cantidad+caf1.getCantidadActual());
          System.out.println("La cafetera se ha llenado");
       }else
         System.out.println("Ingrese una cantidad menor de cafe");
    }
    System.out.println("Presione una tecla para continuar...");
    leer.nextLine();
  }
  public void estadoCafetera(Cafetera caf1){
     System.out.println("La cafetera tiene "+caf1.getCantidadActual()+"cm3 de cafe");
     System.out.println("Presione una tecla para continuar...");
     leer.nextLine();
  }
  
}
