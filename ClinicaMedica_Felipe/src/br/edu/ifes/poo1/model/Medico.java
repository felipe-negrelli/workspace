package br.edu.ifes.poo1.model;

import java.util.ArrayList;
import java.util.List;

public class Medico {
	private String nome;
	private int crm;
	private String endereco;
	private String telefone;
	HorarioAtendimento horarioPessoal = new HorarioAtendimento();
	List<Consulta> consultas = new ArrayList<Consulta>();
	List<PlanoSaude> planos = new ArrayList<PlanoSaude>();
	
	public List<PlanoSaude> obterPlanosConveniados()
	{
		List<PlanoSaude> listaFinal = new ArrayList<PlanoSaude>();
		
		//implementar
		
		return listaFinal;
	}
	
	public HorarioAtendimento obterHorario()
	{
		return horarioPessoal;
	}
	
	public List<Consulta> obterConsultas()
	{
		return consultas;
	}

}
