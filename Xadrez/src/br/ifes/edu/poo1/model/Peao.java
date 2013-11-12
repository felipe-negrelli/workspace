package br.ifes.edu.poo1.model;

public class Peao extends PecaXadrez {
	
	boolean jogadaDupla;
	
	public boolean isJogadaDupla() {
		return jogadaDupla;
	}

	public void setJogadaDupla(boolean jogadaDupla) {
		this.jogadaDupla = jogadaDupla;
	}

	public Peao(Posicao posicao, boolean ehPreto)
	{		
		super(posicao, ehPreto);
	}
}
