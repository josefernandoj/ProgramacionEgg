/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerextra1;

/**
 *
 * @author Fernando
 */
class Persona {
  private String nombre;
    private int edad=0; 
    private int dni=0;
    private String sexo;
    private int peso=0;
    private double altura=0;

  public Persona() {
    
  }
  public Persona(String nombre, int edad, String sexo) {
    this.nombre=nombre;
    this.edad=edad;
    this.sexo=sexo;
    
  }  
  public Persona(String nombre, int edad, int dni, String sexo, int peso, double altura) {
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

  public double getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }
  
  
  public double calcularIMC(){
    double ret, imc=peso/Math.pow((altura/100), 2);
    if (imc<20){
       ret=-1;
    }else if (imc<=25){
       ret=0;
  }else ret=1;
    
    return ret;
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

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
  }
  

}
