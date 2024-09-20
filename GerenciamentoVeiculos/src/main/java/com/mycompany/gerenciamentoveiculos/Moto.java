/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gerenciamentoveiculos;

/**
 *
 * @author Laboratorio
 */
public class Moto extends Veiculos implements IPassageiro {
    
    protected boolean temSideCar;
    
    public Moto(String placa, String marca, String modelo, double valorDiaria) {
        super(placa, marca, modelo, valorDiaria);
    }

    @Override
    public double calculaAluguel(int dias) {
        if (dias > 7) {
            return 0.90 *(dias * valorDiaria);
        }
        return dias * valorDiaria;
    }

    @Override
    public int calcularCapacidade() {
        if(temSideCar){
            return 3;
        }
        return 2;
    }
    
}
