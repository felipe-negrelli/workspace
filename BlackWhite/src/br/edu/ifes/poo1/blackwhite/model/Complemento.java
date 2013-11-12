package br.edu.ifes.poo1.blackwhite.model;

public class Complemento {
		
	protected String unidadeMedida;

	protected String nome;
	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}	
	
	public String toString()
	{
		return nome+":"+unidadeMedida;
	}	

}
