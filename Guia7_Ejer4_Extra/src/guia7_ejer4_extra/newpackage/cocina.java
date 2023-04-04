/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer4_extra.newpackage;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class cocina {
   Scanner teclado = new Scanner (System.in);
    
  private String recetas []= new String [5];

    public cocina() {
      
    }
    
    

    public String[] getRecetas() {
        return recetas;
    }

    public void setRecetas(String[] recetas) {
        this.recetas = recetas;
    }
    
   public void rellenar (){
       for (int i = 0; i < 4; i++) {
           System.out.println("Ingrese EL Nombre de la receta numero : " + (i+1));
           recetas[i]=teclado.nextLine();
           
       }
   }
    public void buscar() {
        String buscar;
        boolean encontrado = false;
        System.out.println("Ingrese la receta a buscar ");
        buscar = teclado.nextLine();
        for (int i = 0; i < 4; i++) {
            if (buscar.equalsIgnoreCase(recetas[i])) {
              encontrado = true;
            } 

        }
        if (encontrado == true) {
            System.out.println(" La receta fue encontrada ");
        } else {
            System.out.println("La receta " + buscar + " no fue encontrada ");
        }
    }
    public void lista (){
        for (int i = 0; i < 4; i++) {
            System.out.println(recetas[i]);
            
        }
    }
}
