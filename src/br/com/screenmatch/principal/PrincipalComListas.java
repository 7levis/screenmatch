package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Titulo;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefao", 1980);
        meuFilme.dandoNota(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        meuFilme.dandoNota(7);
        var nossoFilme = new Filme("Kung Fu Panda", 2010);
        nossoFilme.dandoNota(10);
        Serie serie = new Serie("Lost", 2010);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(nossoFilme);
        lista.add(serie);

        for (Titulo item : lista){
            System.out.println("Nome: "+item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificacao " +filme.getClassificacao());
            }
        }
        Collections.sort(lista);
        System.out.println("Lista ordenadada!");
        System.out.println(lista);
    }
}
