
package com.mycompany.gerenciamentoveiculos;

public abstract class Veiculos {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected double valorDiaria;
    
    public Veiculos(String placa, String marca, String modelo, double valorDiaria){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }
    
    public abstract double calculaAluguel(int dias);
}
