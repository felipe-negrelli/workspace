package br.edu.ifes.poo1.application;

import br.edu.ifes.poo1.model.Pessoa;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoaTeste = new Pessoa();
		pessoaTeste.cadastraNome("Felipe");
		System.out.println("Nome: "+pessoaTeste.retornaNome());
	}

}
