package br.ifes.edu.poo1.model.pecas;

import br.ifes.edu.poo1.model.Peca;
import br.ifes.edu.poo1.model.Posicao;

public class Torre extends Peca {
	
	private boolean foiMovido;	

	public Torre(Posicao posicao, boolean ehPreto) {
		super(posicao, ehPreto);
		// TODO Auto-generated constructor stub
	}
	
	public boolean getFoiMovido() {
		return foiMovido;
	}

}
