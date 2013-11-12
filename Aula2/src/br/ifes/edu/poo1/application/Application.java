package br.ifes.edu.poo1.application;

import br.edu.ifes.poo1.model.Variavel;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		/*
		Variavel a = new Variavel();
		a.c = 20;
		System.out.println(a.c);
		
		Variavel b = new Variavel();
		System.out.println(b.c);
		b.c = 10;
		System.out.println(a.c);
		*/
		
		//Constantes();
		Scanner();
		
	}
	
	public void Casting()
	{
		byte b=2;
		short s=4;
		int i=8;
		long l=16;
		float f=1.1f;
		double d=9.9;
		
		d=s+l+d;
		
		
		//i+b resulta em int, convertendo para long;
		l=i+b;
		
		//erro: b+s resulta em int!
		s=(short) (b+s);
	}
	
	public static void Constantes()
	{
		final double CM_POR_POLEGADA = 2.54;
		//CM_POR_POLEGADA = 2.55; //Erro!
		
		double larguraPol = 13.94;
		double larguraCm = larguraPol*CM_POR_POLEGADA;
		
		System.out.println(larguraCm);
	
	}
	
	public static void Scanner()
	{
		Scanner input = new Scanner(System.in);
		String frase = null;
		System.out.print("Digite uma frase:");
		frase = input.next();
		System.out.println("Frase digitada: "+frase);	
		
	}

}
