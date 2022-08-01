package com.domain.projetoyoutube.main;

import com.domain.projetoyoutube.model.Usuario;
import com.domain.projetoyoutube.model.Video;
import com.domain.projetoyoutube.model.Visualizacao;

public class ProjetoYoutubeAplication {

    public static void main(String[] args) {

        Video[] video = new Video[6];

        video[0] = new Video("Aula de variaveis");
        video[1] = new Video("Aula de Estrutura condicional");
        video[2] = new Video("Aula de estrutura de controle");
        video[3] = new Video("Aula de vetores");
        video[4] = new Video("Aula de Matrizes");
        video[5] = new Video("Aula de POO");

        Usuario[] usuario = new Usuario[2];

        usuario[0] = new Usuario("Daniel de Souza", 23, "M", "daniel.souza");
        usuario[1] = new Usuario("Gabriella Santana", 32, "F", "gabriella.santana");

        System.out.println("Vídeos\n--------------------------------");
        System.out.println(video[0].toString());
        System.out.println(video[1].toString());
        System.out.println(video[2].toString());
        System.out.println(video[3].toString());
        System.out.println(video[4].toString());
        System.out.println(video[5].toString());

        System.out.println("\nUsuários\n--------------------------------");
        System.out.println(usuario[0].toString());
        System.out.println(usuario[1].toString());

        System.out.println("\nVisualizações\n--------------------------------");
        Visualizacao[] visualizacao = new Visualizacao[5];
        visualizacao[0] = new Visualizacao(usuario[0], video[1]);
        visualizacao[0].avaliar();
        System.out.println(visualizacao[0].toString());
        visualizacao[1] = new Visualizacao(usuario[0], video[5]);
        visualizacao[1].avaliar(87.0f);
        System.out.println(visualizacao[1].toString());
        visualizacao[2] = new Visualizacao(usuario[1], video[1]);
        visualizacao[2].avaliar(15);
        System.out.println(visualizacao[2].toString());
    }

}
