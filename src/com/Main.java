package com;

import com.entidades.Anuncio;
import com.entidades.Corretor;
import com.entidades.Imovel;
import com.entidades.Pessoa;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Corretor corretor = new Corretor("Anderson", "012", "(51)983754923", "10002016", 25);
        Imovel imovel = new Imovel(false, 20.000, "021");
        Pessoa pessoa = new Pessoa("Rodrigo", "032", "(51)985328500");

        //Sets

        Anuncio anuncio = new Anuncio(1.000, LocalDate.of(2021, 12, 4));
        anuncio.setLocatario(pessoa);
        anuncio.setImovel(imovel);
        anuncio.setCorretor(corretor);

        //Result

        System.out.println(anuncio.getValor());
        System.out.println(anuncio.getData());
        System.out.println(
                anuncio.getLocatario().getNome() + " " +
                        anuncio.getLocatario().getRegistro() + " " +
                        anuncio.getLocatario().getTelefone());
        System.out.println(
                anuncio.getImovel().getRegistro() + " " +
                        anuncio.getImovel().getValorAluguel() + " " +
                        anuncio.getImovel().isStatus());
        System.out.println(
                anuncio.getCorretor().getCreci() + " " +
                        anuncio.getCorretor().getNome() + " " +
                        anuncio.getCorretor().getTelefone() + " " +
                        anuncio.getCorretor().getTaxaCorretagem() + " " +
                        anuncio.getCorretor().getRegistro());
    }
}
