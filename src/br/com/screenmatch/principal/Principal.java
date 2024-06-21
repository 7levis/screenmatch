package br.com.screenmatch.principal;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroReccomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Primeiro Filme
        Filme meuFilme = new Filme("O Poderoso Chefao", 1980);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setInclusoNoPlano(true);

        meuFilme.dandoNota(9.5);
        meuFilme.dandoNota(6.5);
        meuFilme.dandoNota(7.2);

        meuFilme.exibeFichaTecnica();
        System.out.format("A média é de %.1f ", meuFilme.pegaMedia());

        //Segundo Filme
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setInclusoNoPlano(true);

        //Serie
        Serie serie = new Serie("Lost", 2010);
        serie.setTemporadas(10);
        serie.setEpsodioPorTemporada(10);
        serie.setMinutosPorEpisodio(25);
        //Calculadora
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.format("\nVocê precisará de %d minutos para assistir tudo.", calculadora.getTempoTotal());
        //Episodio
        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(300);

        FiltroReccomendacao filtro = new FiltroReccomendacao();
        filtro.filtrar(meuFilme);
        filtro.filtrar(outroFilme);
        filtro.filtrar(primeiro);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " +listaDeFilmes.size());
        System.out.println("Primeiro Filme: " +listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
    }
}
