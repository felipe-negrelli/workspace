package br.ifes.edu.poo1.model.pecas;

import br.ifes.edu.poo1.model.Peca;
import br.ifes.edu.poo1.model.Posicao;

public class Peao extends Peca {
	
	boolean primeiroMovimento;
	
	public boolean getPrimeiroMovimento() {
		return primeiroMovimento;
	}

	public void setPrimeiroMovimento(boolean primeiroMovimento) {
		this.primeiroMovimento = primeiroMovimento;
	}

	public Peao(Posicao posicao, boolean ehPreto)
	{
		super(posicao, ehPreto);
	}
}
