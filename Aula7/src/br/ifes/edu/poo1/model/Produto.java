package br.ifes.edu.poo1.model;

public class Produto{
	
	protected String nome;
	protected double preco;
	
	public Produto(String nome, double preco)
	{
		this.nome = nome;
		this.preco = preco;
	}
	
	public boolean ehCaro()
	{
		return true;
	}

}
