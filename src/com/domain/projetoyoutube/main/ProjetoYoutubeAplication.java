package com.domain.projetoyoutube.main;

import com.domain.projetoyoutube.model.Usuario;
import com.domain.projetoyoutube.model.Video;

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

		System.out.println(video[5].toString());
		System.out.println(usuario[1].toString());
	}

}
