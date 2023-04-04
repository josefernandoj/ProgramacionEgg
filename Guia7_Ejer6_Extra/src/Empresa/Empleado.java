/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author Fernando
 */
public class Empleado {
  private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }
    
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public double calcular_aumento(){
        
        if(edad>30){
            this.salario = 1.3 * this.salario;
           
            
        } else{
             this.salario = 1.1 * this.salario;
        }
        return this.salario;
    }
    
    
}
