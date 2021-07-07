package com.entidades;

public class Imovel {

    boolean Status;
    double valorAluguel;
    String registro;

    public Imovel(boolean status, double valorAluguel, String registro) {
        Status = status;
        this.valorAluguel = valorAluguel;
        this.registro = registro;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
