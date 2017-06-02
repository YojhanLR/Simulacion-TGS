/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Yojhan
 */
public class Variable {
    
   private String descripcion;
   private int id;
   double valor;
   double valorInicial;

    public Variable(String descripcion, int id){
        this.descripcion = descripcion;
        this.id = id;
        this.valor = 0;
        this.valorInicial = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = Math.max(0, valor);
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = Math.max(0, valorInicial);
    }
    
}
