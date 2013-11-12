package br.edu.ifes.poo1.blackwhite.model;

public class PoSoluvel extends Ingrediente{

	public PoSoluvel ()
	{
		this.unidadeMedida = "ml";
		this.nome = "PoSoluvel";
	}
	
	public String toString()
	{
		return super.toString()+"Acorda Pedro!!";
	}
}
