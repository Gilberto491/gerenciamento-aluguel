package com.entidades;

import java.time.LocalDate;

public class Aluguel {

    double valorAcertado;
    int dataVencimento;
    Imovel imovel;
    LocalDate validadeContrato;
    int numeroContrato;
    double pagamentosMensais;

    public Aluguel() {
    }

    public double getValorAcertado() {
        return valorAcertado;
    }

    public void setValorAcertado(double valorAcertado) {
        this.valorAcertado = valorAcertado;
    }

    public int getVencimento() {
        return dataVencimento;
    }

    public void setVencimento(int vencimento) {
        this.dataVencimento = vencimento;
    }

    public LocalDate getValidadeContrato() {
        return validadeContrato;
    }

    public void setValidadeContrato(LocalDate validadeContrato) {
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

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public void alugarImovel(Imovel imovel) {
        imovel.setStatus(true);
    }

    public void setarValorAluguel(Imovel imovel, double valorAluguel, LocalDate validadeContrato, int dataVencimento, int numeroContrato, double pagamentosMensais) {
        if (imovel.isStatus()) {
            imovel.setValorAluguel(valorAluguel);
            setValidadeContrato(validadeContrato);
            setDataVencimento(dataVencimento);
            setNumeroContrato(numeroContrato);
            setPagamentosMensais(pagamentosMensais);
        } else {
            System.out.println("imovel desocupado");
        }
    }

    public String stringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append("Número contrato: ")
                .append(this.numeroContrato)
                .append("\n")
                .append("Validade contrato: ")
                .append(this.validadeContrato)
                .append("\n")
                .append("Data vencimento: ")
                .append(this.dataVencimento)
                .append("\n")
                .append("Pagementos Mensais: ")
                .append(this.pagamentosMensais)
                .append("\n")
                .toString();
    }


}
