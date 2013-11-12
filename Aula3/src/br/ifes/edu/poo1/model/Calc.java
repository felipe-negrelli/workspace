package br.ifes.edu.poo1.model;

public class Calc {
	
	public int Somar(int valor1, int valor2)
	{		
		int result = valor1 + valor2;		
		return result;	
	}
	
	public int Subtrair(int valor1, int valor2)
	{
		int result = valor1 - valor2;
		return result;
	}
	
	public int Dividir(int valor1, int valor2)
	{		
		int result = 0;
		
		if(valor2 != 0)
		{
			result = valor1/valor2;
		}
		return result;
	}
	
	public int Multiplicar(int valor1, int valor2)
	{
		int result = valor1 * valor2;
		return result;	
	}
	
	public int Expressao(String expressao)
	{
		int result = 0, valor1, valor2;
		char operador;
		
		valor1 = Integer.parseInt(expressao.substring(0, 1));
		valor2 = Integer.parseInt(expressao.substring(1, 2));
		operador = expressao.charAt(2);
		
		switch (operador) 
		{
			case '+':
				result = Somar(valor1, valor2);
			case '-':
				result = Subtrair(valor1, valor2);
			case '*':
				result = Multiplicar(valor1, valor2);
			case '/':
				result = Dividir(valor1, valor2);				
		}
		
		return result;		
	}
	
}
