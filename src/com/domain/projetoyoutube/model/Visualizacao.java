package com.domain.projetoyoutube.model;

public class Visualizacao {

    private Usuario espectador;
    private Video filme;

    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setToAssistido(espectador.getToAssistido() + 1);
        this.filme.setVisualizacoes(filme.getVisualizacoes() + 1);
        this.filme.setReproduzindo(true);
    }

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porcentagem) {
        int total = 0;

        if (porcentagem <= 20) {
            total = 3;
        } else if (porcentagem <= 50) {
            total = 5;
        } else if (porcentagem <= 90) {
            total = 8;
        } else {
            total = 10;
        }
        
        this.filme.setAvaliacao(total);
    }

    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
}
