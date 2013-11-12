package br.ifes.edu.poo1.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JPanel;

import br.ifes.edu.poo1.application.GUI;

public class Tabuleiro extends JPanel {
	
	CasaTabuleiro[][] casasTabuleiro;

	public Tabuleiro(GUI pai) {
		
		super(new GridLayout(8,8));
		
		Dimension tamanho = new Dimension();
		tamanho.height = (int) Math.round(pai.getSize().height*0.8);
		tamanho.width = (int) Math.round(pai.getSize().width*0.5);
		this.setSize(tamanho);
		
		casasTabuleiro = new CasaTabuleiro[8][8];
		
		setBackground(Color.black);		
	}
}
