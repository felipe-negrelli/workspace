package br.ifes.edu.poo1.model;

public class NoListaDupla {
	
	private Object dado;
	private NoListaDupla anterior;
	private NoListaDupla proximo;	
	
	public NoListaDupla(Object novoObjeto)
	{
		dado = novoObjeto;
	}
	
	public Object getObjeto()
	{
		return this.dado;
	}
	
	public void setObjeto(Object novoObjeto)
	{
		this.dado = novoObjeto;
	}
	
	public NoListaDupla getProx()	
	{
		return this.proximo;	
	}
	
	public void setProx(NoListaDupla novoProx)
	{
		this.proximo = novoProx;
	}
	
	public NoListaDupla getAnt()
	{
		return this.anterior;
	}
	
	public void setAnt(NoListaDupla novoAnt)
	{
		this.anterior = novoAnt;
	}
	
	

}
