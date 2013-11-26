package br.ifes.edu.poo1.model.pecas;

import br.ifes.edu.poo1.model.Peca;
import br.ifes.edu.poo1.model.Posicao;

public class Rei extends Peca {
	
	private boolean foiMovido, emXeque;

	public Rei(Posicao posicao, boolean ehPreto) {
		super(posicao, ehPreto);
		
		this.foiMovido = false;
		this.emXeque = false;
		// TODO Auto-generated constructor stub
	}

	public boolean getFoiMovido() {
		return foiMovido;
	}

	public boolean getEmXeque() {
		return emXeque;
	}

	public void setEmXeque(boolean emXeque) {
		this.emXeque = emXeque;
	}

}
