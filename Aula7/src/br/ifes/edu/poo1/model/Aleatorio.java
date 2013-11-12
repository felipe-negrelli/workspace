package br.ifes.edu.poo1.model;

import java.util.Random;

public class Aleatorio {
	
	static int numero;
	
	static {
		
		Random rand = new Random();
		numero = rand.nextInt(20);
	}
	
	
	

}
