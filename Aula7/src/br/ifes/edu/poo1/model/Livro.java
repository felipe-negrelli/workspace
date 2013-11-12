package br.ifes.edu.poo1.model;

public class Livro extends Produto{
	
	private String autor;
	private int paginas;
	
	public Livro(String nome, double preco, String autor, int paginas)
	{
		super(nome, preco);
		this.autor = autor;
		this.paginas = paginas;
		
		
	}

}
