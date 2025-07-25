package com.exemplo;

public class Calculadora {
    
    private double valor_compra; //real
    private double distancia; // km
    private double valor_frete; // real

    public Calculadora(double valor_compra, double distancia) {
        this.valor_compra = valor_compra;
        this.distancia = distancia;
    }
    public double calcularFrete(double valor_compra, double distancia) {
        if (valor_compra <= 0) {
            throw new IllegalArgumentException("O valor da compra deve ser maior que zero.");
        }
        else if (distancia < 0) {
            throw new IllegalArgumentException("A distância não pode ser negativa.");
        }
        else if (valor_compra>100){
            return valor_frete = 0.00;

        } else if (valor_compra <= 100 && valor_compra >= 70) {
            return valor_frete = (10.0 + (0.5 * distancia))*0.5;

        } else if (valor_compra < 70 ) {
            return valor_frete= 10.0 + (0.5 * distancia);
        }
        throw new IllegalArgumentException("Erro no cálculo do frete.");
    }
    public double getValor_compra() {
        return valor_compra;
    }
    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public double getValor_frete() {
        return valor_frete;
    }
    public void setValor_frete(double valor_frete) {
        this.valor_frete = valor_frete;
    }

}