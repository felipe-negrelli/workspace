package br.ifes.edu.poo1.model;

public class PecaXadrez {
	
	private Posicao posicao;
	private boolean preto;
	private boolean emJogo;
	
	public boolean getEmJogo() {
		return emJogo;
	}

	public void setEmJogo(boolean emJogo) {
		this.emJogo = emJogo;
	}

	public PecaXadrez(Posicao posicao, boolean ehPreto)
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

}
