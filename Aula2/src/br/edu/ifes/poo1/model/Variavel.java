package br.edu.ifes.poo1.model;

public class Variavel {
	public static int c = 10; //De classe
	public int i;             //De inst�ncia
	public int func()
	{
		int n=5;			  //Local
		i=2*2;
		return (i+c);
	}
}
