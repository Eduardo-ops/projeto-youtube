package com.domain.projetoyoutube.model;

import com.domain.projetoyoutube.controller.AcoesVideo;

public class Video implements AcoesVideo {

	private String titulo;
	private int avaliacao;
	private int visualizacoes;
	private int curtidas;
	private boolean reproduzindo;

	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.visualizacoes = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	public Video() {

	}

	@Override
	public void play() {

	}

	@Override
	public void pause() {

	}

	@Override
	public void like() {

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getVisualizacoes() {
		return visualizacoes;
	}

	public void setVisualizacoes(int visualizacoes) {
		this.visualizacoes = visualizacoes;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean getReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

}
