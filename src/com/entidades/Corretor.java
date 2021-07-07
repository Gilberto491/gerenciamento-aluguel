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
}
