/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;
import java.util.Scanner;
/**
 *
 * @author Fernando
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private String numerodepag;

   Scanner leer=new Scanner(System.in);
   public Libro(){
   
   }
    
    public Libro(String ISBN, String titulo, String autor,String numerodepag ){
       this.ISBN=ISBN;
       this.titulo=titulo;
       this.autor=autor;
       this.numerodepag=numerodepag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNumerodepag() {
        return numerodepag;
    }

    public void setNumerodepag(String numerodepag) {
        this.numerodepag = numerodepag;
    }

    public void ingresarDatos(){
        System.out.println("Ingrese ISBN del libro: ");
        ISBN=leer.nextLine();
        System.out.println("Ingrese Titulo del libro: ");
        titulo=leer.nextLine();
        System.out.println("Ingrese el Autor del libro: ");
        autor=leer.nextLine();
        System.out.println("Ingrese numero de pag. del libro: ");
        numerodepag=leer.nextLine();
    }
    
    public void mostrarDatos(){
        System.out.println("El ISBN del libro es: "+ISBN);
        System.out.println("El Titulo del libro es: "+titulo);
        System.out.println("El Autor del libro es: "+autor);
        System.out.println("El num de pag. del libro es: "+numerodepag);
    }
    
}

