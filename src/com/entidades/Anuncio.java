package com.entidades;

import java.time.LocalDate;

public class Anuncio {

    Pessoa locatario;
    Imovel imovel;
    Corretor corretor;
    double valor;
    LocalDate data;

    public Anuncio(double valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    public Pessoa getLocatario() {
        return locatario;
    }

    public void setLocatario(Pessoa locatario) {
        this.locatario = locatario;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String stringBuilder() {
        StringBuilder stringBuider = new StringBuilder();
        return stringBuider
                .append("Valor anuncio: ")
                .append(this.valor)
                .append("\n")
                .append("Data anuncio: ")
                .append(this.data)
                .append("\n")
                .toString();
    }
}
