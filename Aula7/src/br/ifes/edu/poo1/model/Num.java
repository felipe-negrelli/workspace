package br.ifes.edu.poo1.model;

public class Num {
	
	private int i=5;
	
	public Num somar(int j)
	{
		setI(getI() + j);
		return this;		
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}

}
