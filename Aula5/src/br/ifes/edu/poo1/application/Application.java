package br.ifes.edu.poo1.application;

import br.ifes.edu.poo1.model.ListaDupla;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testeLista();

	}
	
	public static void testeLista()
	{
		ListaDupla lista = new ListaDupla();
		lista.addFim(0);		
		lista.addFim(1);
		lista.addFim(2);		
		lista.addFim(3);
		lista.addFim(4);
		lista.addFim(5);
		lista.addFim(6);
		lista.addFim(7);
		lista.addFim(8);
		lista.addFim(9);
		
		System.out.println(lista.toString());				
		lista.excluir(6);		
		System.out.println(lista.toString());				
		lista.add(6,9);		
		System.out.println(lista.toString());
		
		
		
	}

}
