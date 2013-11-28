package br.ifes.edu.poo1.model;

import java.util.List;

public abstract class Peca implements PecaXadrez{
	
	private Posicao posicao;
	private boolean preto;
	private int quantMovimentos;
	
	public boolean getMoveu() {
		if(this.quantMovimentos > 0)
		{
			return true;
		}
		return false;
	}

	public Peca(Posicao posicao, boolean ehPreto)
	{
		this.posicao = posicao;
		this.preto = ehPreto;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public boolean getEhPreto() {
		return preto;
	}

	public void setEhPreto(boolean ehPreto) {
		this.preto = ehPreto;
	}
	
	public void moverPeca(Posicao novaPosicao)
	{
		this.posicao = novaPosicao;
	}

	public List<CasaTabuleiro> getMovimentosPossiveis() {
		// TODO Auto-generated method stub
		return null;
	}

	public void mover(CasaTabuleiro novoPosicao) {
		// TODO Auto-generated method stub
		
	}
}
