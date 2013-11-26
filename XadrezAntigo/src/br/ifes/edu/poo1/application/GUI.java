package br.ifes.edu.poo1.application;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class GUI extends JFrame implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public GUI()
	{
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		screen.height -= 40;
		this.setSize(screen);
		
		Menu menu = new Menu(this);
		setJMenuBar(menu);
		
		//setLayout(new );
		montarTabuleiro();
	}
	
	public void montarTabuleiro()
	{		

	}

}
