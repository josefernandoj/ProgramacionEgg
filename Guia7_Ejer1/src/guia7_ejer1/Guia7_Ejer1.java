/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ejer1;

import Biblioteca.Libro;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Guia7_Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String ISBN="";
       String titulo="";
       String autor="";
       String numerodepag="";
       Libro libro1=new Libro(ISBN, titulo, autor, numerodepag);
       
      libro1.ingresarDatos();
      libro1.mostrarDatos();
       
        System.out.println(libro1.getISBN());
          
    }

}
