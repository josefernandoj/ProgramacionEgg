/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejer2;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia8_Ejer2 {

  /**
   * @param args the command line arguments
   * @throws java.io.IOException
   * @throws java.lang.InterruptedException
   */
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner leer=new Scanner(System.in);
    CafeteraServicio cafserv= new CafeteraServicio();
    Cafetera cafetera1= new Cafetera();
    int op;
    do {
    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
    System.out.println("MENU CAFETERA");
    System.out.println("1-Llenar cafetera");
    System.out.println("2-Servir taza");
    System.out.println("3-Vaciar cafetera");
    System.out.println("4-Agregar cafe");
    System.out.println("5-Estado cafetera");
    System.out.println("6-Salir");
    System.out.println("Ingrese una opcion del menú: ");
   
    op=leer.nextInt();
    
    switch (op){
      case 1: cafserv.llenarCafetera(cafetera1);
      break;
      case 2: System.out.println("Ingrese el tamaño de la taza de café (en cm3):");
              int taza=leer.nextInt();
              cafserv.servirTaza(cafetera1, taza); 
      break;
      case 3: cafserv.vaciarCafetera(cafetera1);
      break;
      case 4: System.out.println("Ingrese cantidad de cafe a ingresar en la cafetera (en cm3):");
              int cant=leer.nextInt();
              cafserv.agregarCafe(cafetera1, cant);
      case 5: cafserv.estadoCafetera(cafetera1);
      break;        
    
    }  
    }while (op!=6);
    
    
    
   
    
  }
  
}
