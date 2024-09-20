/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoveiculos;


public class Carro extends Veiculos implements IPassageiro {
    
    protected int numeroPortas;
    
    public Carro(String placa, String marca, String modelo, double valorDiaria) {
        super(placa, marca, modelo, valorDiaria);
    }

    @Override
    public double calculaAluguel(int dias) {
        if (dias > 7) {
            return 0.95 *(dias * valorDiaria);
        }
        return dias * valorDiaria; 
    }

    @Override
    public int calcularCapacidade() {
        return numeroPortas + 1;
    }
    
}
