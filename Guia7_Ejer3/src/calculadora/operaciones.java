/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class operaciones {
    private double numero1;
    private double numero2;
    
    Scanner leer= new Scanner(System.in);
    
    public operaciones(){
     
    }

    public operaciones(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese dos numeros: ");
        numero1=leer.nextDouble();
        numero2=leer.nextDouble();
    }
    
    public double sumar(){
        double sumar;
        sumar=numero1+numero2;
        return sumar;
    }
    public double restar(){
        double restar;
        restar=numero1-numero2;
        return restar;
    }
    public double multiplicar(){
        double multiplicar;
        if (numero1!=0 && numero2!=0){
        multiplicar=numero1*numero2;
        }else{
            System.out.println("Multiplicacion por 0");
            multiplicar=0;
        }
        return multiplicar;
    }
    public double dividir(){
        double dividir;
        if (numero1!=0 && numero2!=0){
        dividir=numero1/numero2;
        }else{
            System.out.println("Division por 0");
            dividir=0;
        }
        return dividir;
    }
}
