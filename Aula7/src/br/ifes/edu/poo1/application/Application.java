package br.ifes.edu.poo1.application;

import br.ifes.edu.poo1.model.Num;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Num m = new Num();
		 m.somar(10).somar(5).somar(1);
		 System.out.println(m.getI());		
		
	}
}
