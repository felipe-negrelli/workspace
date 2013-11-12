package br.edu.ifes.poo1.blackwhite.model;

public class PoSemCafeina extends Ingrediente{

	public PoSemCafeina ()
	{
		this.unidadeMedida = "ml";
		this.nome = "PoSemCafeina";
	}
	
	public String toString()
	{
		return super.toString()+"Acorda Pedro!!";
	}
}
