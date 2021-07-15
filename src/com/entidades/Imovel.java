package com.entidades;

public class Imovel {

    boolean Status;
    double valorAluguel;
    String registro;
    Endereco endereco;

    public Imovel(boolean status, double valorAluguel, String registro, Endereco endereco) {
        Status = status;
        this.valorAluguel = valorAluguel;
        this.registro = registro;
        this.endereco = endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String stringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append("Status: ")
                .append(this.Status)
                .append("\n")
                .append("Valor aluguel: ")
                .append(this.valorAluguel)
                .append("\n")
                .append("Registro: ")
                .append(this.registro)
                .append("\n")
                .append("Endereço: ")
                .append("\n")
                .append("Logradouro: ")
                .append(this.endereco.getLogradouro())
                .append("\n")
                .append("Numero: ")
                .append(this.endereco.getNumero())
                .append("\n")
                .append("Complemento: ")
                .append(this.endereco.getComplemento())
                .append("\n")
                .append("Bairro: ")
                .append(this.endereco.getBairro())
                .append("\n")
                .append("Cidade: ")
                .append(this.endereco.getCidade())
                .append("\n")
                .append("Cep: ")
                .append(this.endereco.getCep())
                .append("\n")
                .toString();
    }
}
