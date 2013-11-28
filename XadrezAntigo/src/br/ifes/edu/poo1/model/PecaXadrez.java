package br.ifes.edu.poo1.model;

import java.util.List;


public interface PecaXadrez {
	
	public boolean getEhPreto();
	
	public List<CasaTabuleiro> getMovimentosPossiveis();
	
	public void mover(CasaTabuleiro novoPosicao);
	
	public boolean getMoveu();

}
