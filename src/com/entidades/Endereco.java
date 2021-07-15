package com.entidades;

public class Endereco {

    String logradouro;
    int numero;
    String complemento;
    String bairro;
    String cidade;
    String cep;

    public Endereco(String logradouro,
                    int numero,
                    String complemento,
                    String bairro,
                    String cidade,
                    String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String stringBulder() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append("Logradouro: ")
                .append(this.logradouro)
                .append("\n")
                .append("Numero: ")
                .append(this.numero)
                .append("\n")
                .append("Complemento: ")
                .append(this.complemento)
                .append("\n")
                .append("Bairro: ")
                .append(this.bairro)
                .append("\n")
                .append("Cidade: ")
                .append(this.cidade)
                .append("\n")
                .append("Cep: ")
                .append(this.cep)
                .append("\n")
                .toString();
    }
}
