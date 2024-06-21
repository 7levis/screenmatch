package br.com.screenmatch.modelos;

public class Serie extends Titulo{
    private int minutosPorEpisodio;
    private int temporadas;
    private boolean ativa;
    private int epsodioPorTemporada;

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodioPorTemporada() {
        return epsodioPorTemporada;
    }

    public void setEpsodioPorTemporada(int epsodioPorTemporada) {
        this.epsodioPorTemporada = epsodioPorTemporada;
    }
    @Override
    public int getDuracaoEmMinutos(){
        return  temporadas * epsodioPorTemporada * minutosPorEpisodio;
    }

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    @Override
    public String toString() {
        return "Série: " +this.getNome() + "(" +this.getAnoDeLancamento() + ")";
    }
}
