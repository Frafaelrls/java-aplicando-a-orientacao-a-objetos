package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.printf("%s é considerado sucesso absoluto e preferido por todos!%n", audio.getTitulo() );
        }else {
            System.out.printf("%s também é um dos que todo mundo está curtindo!", audio.getTitulo());
        }
    }
}
