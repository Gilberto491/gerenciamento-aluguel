package com.entidades;

public class Cliente extends Pessoa {

    double seguroFianca;

    public Cliente(String nome, String registro, String telefone, double seguroFianca) {
        super(nome, registro, telefone);
        this.seguroFianca = seguroFianca;
    }

    public double getSeguroFianca() {
        return seguroFianca;
    }

    public void setSeguroFianca(double seguroFianca) {
        this.seguroFianca = seguroFianca;
    }
}
