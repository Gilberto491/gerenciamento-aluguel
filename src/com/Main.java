package com;

import com.entidades.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Corretor anderson = new Corretor("Anderson", "012", "(51)983754923", "10002016", 6);
        Cliente rodrigo = new Cliente("Rodrigo", "032", "(51)985328500", 2000);
        Endereco endereco = new Endereco(
                "rua b",
                120,
                "casa",
                "algarve",
                "cidade",
                "4355345"
        );

        Imovel imovel = new Imovel(false, 20.000, "021", endereco);

        Anuncio anuncio = new Anuncio(1.000, LocalDate.of(2021, 12, 4));
        anuncio.setCorretor(anderson);
        anuncio.setLocatario(rodrigo);
        anuncio.setImovel(imovel);

        Aluguel aluguel = new Aluguel();
        aluguel.alugarImovel(imovel);
        aluguel.setarValorAluguel(imovel, 2000, LocalDate.of(2021, 12, 6), 12, 4421, 500);

        //Result

        System.out.println("Corretor: \n" + anderson.stringBuilder());
        System.out.println("Cliente: \n" + rodrigo.stringBuilder());
        System.out.println("Imovel: \n" + imovel.stringBuilder());
        System.out.println("Anuncio: \n" + anuncio.stringBuilder());
        System.out.println("Aluguel: \n" + aluguel.stringBuilder());
    }
}
