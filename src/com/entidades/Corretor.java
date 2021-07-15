package com.entidades;

public class Corretor extends Pessoa {

    String creci;
    double taxaCorretagem;

    public Corretor(String nome,
                    String registro,
                    String telefone,
                    String creci,
                    double taxaCorretagem) {
        super(nome, registro, telefone);
        this.creci = creci;
        this.taxaCorretagem = taxaCorretagem;
    }

    public String getCreci() {
        return creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }

    public double getTaxaCorretagem() {
        return taxaCorretagem;
    }

    public void setTaxaCorretagem(double taxaCorretagem) {
        this.taxaCorretagem = taxaCorretagem;
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
                .append("Telefone: ")
                .append(this.telefone)
                .append("\n")
                .append("Creci: ")
                .append(this.creci)
                .append("\n")
                .append("Taxa corretagem")
                .append(this.taxaCorretagem)
                .append("\n")
                .toString();
    }
}
