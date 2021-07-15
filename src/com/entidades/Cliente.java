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

    public String stringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append("Nome: ")
                .append(this.nome)
                .append("\n")
                .append("Registro: ")
                .append(this.registro)
                .append("\n")
                .append("telefone: ")
                .append(this.telefone)
                .append("\n")
                .append("Seguro fiança: ")
                .append(this.seguroFianca)
                .append("\n")
                .toString();
    }
}
