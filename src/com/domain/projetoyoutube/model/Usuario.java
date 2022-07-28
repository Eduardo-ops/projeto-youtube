package com.domain.projetoyoutube.model;

public class Usuario extends Pessoa {

	private String login;
	private int toAssistido;

	public Usuario(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.toAssistido = 0;
	}

	public Usuario() {

	}

	public void viuMaisUm() {

	}

	@Override
	public String toString() {
		return "Usuario: [" + super.toString() + "login=" + login + ", toAssistido=" + toAssistido + "]";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getToAssistido() {
		return toAssistido;
	}

	public void setToAssistido(int toAssistido) {
		this.toAssistido = toAssistido;
	}

}
