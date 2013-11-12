package br.ifes.edu.poo1.application;

import java.util.StringTokenizer;

public class Teste {
	
	void print(boolean msg, String ... objs){
		if(msg) System.out.println("Args:");
		for (int i=0;i<objs.length;i++)
			System.out.println(objs[i]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teste t = new Teste();
		//t.print(true, "Java", "Sun", "JCP");
		
		t.printf("O * é * e *", "Paulo", "legal", "pobre");

	}
	
	
	void printf(String msg, String ... valores)
	{
		String result = "";
		int contador_parametros = 0;
		
		String[] lista = msg.split(" ");
		
		for(int i=0;i<lista.length;i++)
		{
			if(lista[i] == "*")
			{
				lista[i] = valores[contador_parametros];
				contador_parametros++;			
			}			
		}
		
		for(int cont2=0;cont2<lista.length;cont2++)
		{
			if(result == "")
				result += lista[cont2];
			else
				result += " "+lista[cont2];				
		}
		
		
		
		
		System.out.println(result);
	}

}
