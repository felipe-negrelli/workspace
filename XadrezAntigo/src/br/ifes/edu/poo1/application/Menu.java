package br.ifes.edu.poo1.application;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JMenuBar {

	public Menu(GUI pai) {
		// TODO Auto-generated constructor stub
		
		//File Menu
				JMenu file = new JMenu("Aplicativo");
				JMenuItem exit = new JMenuItem("Sair");
				exit.setActionCommand("-11");
				exit.addActionListener(pai);
				file.add(exit);
				this.add(file);

				//Game Menu
				JMenu game = new JMenu("Jogo");
				JMenuItem newGame = new JMenuItem("Novo jogo");
				newGame.setActionCommand("-10");
				newGame.addActionListener(pai);
				game.add(newGame);
				this.add(game);				
				
	}

}
