package br.edu.ifes.poo1.model;

public class Pessoa {
	private String nome;
	
	public String retornaNome()
	{
		return this.nome;	
	}
	
	public void cadastraNome(String novoNome)
	{
		nome = novoNome;
	}

}
