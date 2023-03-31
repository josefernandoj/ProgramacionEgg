/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe_eje1.newpackage;

/**
 *
 * @author Fernando
 */
public class Persona {
  private String nombre=" ";
    private int edad=0; 
    private int dni=0;
    private String sexo="Hombre";
    private int peso=0;
    private int altura=0;

  public Persona() {
    
  }
  public Persona(String nombre, int edad, String sexo) {
    this.nombre=nombre;
    this.edad=edad;
    this.sexo=sexo;
    
  }  
  public Persona(String nombre, int edad, int dni, String sexo, int peso, int altura) {
    this.nombre=nombre;
    this.edad=edad;
    this.sexo=sexo;
    this.dni=dni;
    this.peso=peso;
    this.altura=altura;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getDni() {
    return dni;
  }

  public void setDni(int dni) {
    this.dni = dni;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }
  
  
  public double calcularIMC(){
    double imc=peso*Math.pow(altura, 2);
    return imc;
  }
  
  public boolean esMayorDeEdad(){
    boolean mayor=false;
      if (edad>=18){
        mayor=true;
      }
    return mayor;
  }
  
  public int generaDNI(){
     int gendni;
     gendni=(int) (Math.random()*99999999);
     return gendni;
  }
  
}
