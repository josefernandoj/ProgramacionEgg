/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Fernando
 */
public class CuentaBancaria {
  private int numeroCuenta;
  private int dniCliente;
  private double saldoActual;

  public CuentaBancaria() {
  }

  public CuentaBancaria(int numeroCuenta, int dniCliente, double saldoActual) {
    this.numeroCuenta = numeroCuenta;
    this.dniCliente = dniCliente;
    this.saldoActual=saldoActual;
  }
  
  

  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public int getDniCliente() {
    return dniCliente;
  }

  public void setDniCliente(int dniCliente) {
    this.dniCliente = dniCliente;
  }

  public double getSaldoActual() {
    return saldoActual;
  }

  public void setSaldoActual(double saldoActual) {
    this.saldoActual = saldoActual;
  }

  @Override
  public String toString() {
    return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual=" + saldoActual + '}';
  }
  
  
  
}
