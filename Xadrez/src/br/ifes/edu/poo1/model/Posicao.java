package br.ifes.edu.poo1.model;

public class Posicao {
	
	private int coluna;
	private int linha;
	
	public Posicao()
	{
		this(0,0);
	}
	
	public Posicao(int coluna, int linha)
	{
		this.coluna = coluna;
		this.linha = linha;
	}
	
	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}	

}
