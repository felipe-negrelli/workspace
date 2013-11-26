package br.ifes.edu.poo1.model;

import java.util.ArrayList;
import java.util.List;


public class CasaTabuleiro {
	
	private int coluna;
	private int linha;	
	private Peca pecaAtual;

	public CasaTabuleiro(int coluna, int linha) {
		// TODO Auto-generated constructor stub
		this.coluna = coluna;
		this.linha = linha;
		
		List<Peca> lista = new ArrayList<Peca>(); 
	}

	public int getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	public Peca getPecaAtual() {
		return pecaAtual;
	}

	public void setPecaAtual(Peca pecaAtual) {
		this.pecaAtual = pecaAtual;
	}
	
	public boolean ocupado(){
		
		if(this.pecaAtual == null)
			return false;
		return true;
	}

}
