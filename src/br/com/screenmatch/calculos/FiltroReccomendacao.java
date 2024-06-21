package br.com.screenmatch.calculos;

public class FiltroReccomendacao {
    public void filtrar(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("\nEstá nos favoritos do momento.");
        }else {
            System.out.println("\nColoque na lista pra assitir");
        }
    }
}
