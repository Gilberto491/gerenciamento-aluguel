package com.entidades;

import java.util.Date;

public class Aluguel {

    double valorAcertado;
    int vencimento;
    Date validadeContrato;
    int numeroContrato;
    double pagamentosMensais;

    public Aluguel(double valorAcertado,
                   int vencimento,
                   Date validadeContrato,
                   int numeroContrato,
                   double pagamentosMensais) {
        this.valorAcertado = valorAcertado;
        this.vencimento = vencimento;
        this.validadeContrato = validadeContrato;
        this.numeroContrato = numeroContrato;
        this.pagamentosMensais = pagamentosMensais;
    }

    public double getValorAcertado() {
        return valorAcertado;
    }

    public void setValorAcertado(double valorAcertado) {
        this.valorAcertado = valorAcertado;
    }

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public Date getValidadeContrato() {
        return validadeContrato;
    }

    public void setValidadeContrato(Date validadeContrato) {
        this.validadeContrato = validadeContrato;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public double getPagamentosMensais() {
        return pagamentosMensais;
    }

    public void setPagamentosMensais(double pagamentosMensais) {
        this.pagamentosMensais = pagamentosMensais;
    }
}
