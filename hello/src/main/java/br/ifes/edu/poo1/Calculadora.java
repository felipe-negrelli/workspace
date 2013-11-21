package br.ifes.edu.poo1;

public class Calculadora {

	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	public int somar(int a, int b)
	{
		return a-b;
	}
	
	public int dividir(int a, int b)
	{
		if(b==0) throw new ArithmeticException();
		
		return a/b;
	}
}
