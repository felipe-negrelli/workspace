package br.ifes.edu.poo1.model;

public class ListaDupla {
	
	private int quantNos = 0;
	private NoListaDupla primeiroNo;
	private NoListaDupla ultimoNo;	
	
	public ListaDupla()
	{
		
	}
	
	public int getQuantidadeNos()
	{
		return this.quantNos;		
	}
	
	public String toString()
	{
		String result = "";
		NoListaDupla noAtual = this.primeiroNo;
		
		while(noAtual != null)	
		{
			result += noAtual.getObjeto().toString()+", ";
			
			noAtual = noAtual.getProx();
		}		
		return result;		
	}
	
	
	public void addFim(Object novoObjeto)
	{
		NoListaDupla novoNo = new NoListaDupla(novoObjeto);
		if(this.primeiroNo == null)
		{
			this.primeiroNo =  novoNo;
			this.ultimoNo = novoNo;
			
		}
		else if(this.primeiroNo == this.ultimoNo)
		{
			
			this.primeiroNo.setProx(novoNo);
			novoNo.setAnt(getPrimeiro());
			this.ultimoNo = novoNo;
		}
		else
		{
			this.ultimoNo.setProx(novoNo);
			novoNo.setAnt(getUltimo());
			this.ultimoNo = novoNo;			
		}
		
		this.quantNos++;
	}
	
	public void addPrimeira(Object novoObjeto)
	{
		NoListaDupla novoNo = new NoListaDupla(novoObjeto);
		if(this.primeiroNo == null)
		{
			this.primeiroNo =  novoNo;
			this.ultimoNo = novoNo;	
			
		}
		else if(this.primeiroNo == this.ultimoNo)
		{			
			this.primeiroNo.setAnt(novoNo);			
			novoNo.setProx(getPrimeiro());
			this.primeiroNo = novoNo;			
		}
		else
		{
			getPrimeiro().setAnt(novoNo);	
			novoNo.setProx(getPrimeiro());;
			setPrimeiro(novoNo);
		}
		
		this.quantNos++;
	}
	
	public void add(Object novoObjeto, int pos)
	{
		//Se tiver dentro da faixa adiciona na posicao
		if(pos < getQuantidadeNos()){		
			
			NoListaDupla novoNo = new NoListaDupla(novoObjeto);
			NoListaDupla noAtual = this.primeiroNo;	
			
			for(int posAtual=0 ; posAtual<getQuantidadeNos() ; posAtual++)
			{
				if(posAtual == pos)
				{
					if(noAtual.getAnt() == null)
					{
						this.primeiroNo.setAnt(novoNo);			
						novoNo.setProx(getPrimeiro());
						this.primeiroNo = novoNo;
					}
					else
					{
						novoNo.setProx(noAtual);
						novoNo.setAnt(noAtual.getAnt());
	
						noAtual.getAnt().setProx(novoNo);
						noAtual.setAnt(novoNo);	
					}				
				}				
				//consertar
				if(noAtual != null)
				{
					noAtual = noAtual.getProx();
				}
			}
		}
		//Se tiver no final
		else if(pos == getQuantidadeNos())
		{
			addFim(novoObjeto);
		}
	
	}
	
	public NoListaDupla getPrimeiro()
	{
		return this.primeiroNo;
	}
	
	public void setPrimeiro(NoListaDupla novoNo)
	{
		this.primeiroNo = novoNo;		
	}
	
	public NoListaDupla getUltimo()
	{
		return this.ultimoNo;
	}
	
	public void setUltimo(NoListaDupla novoNo)
	{
		this.ultimoNo = novoNo;		
	}
	
	public boolean listaVazia()
	{
		if(this.quantNos == 0)
			return true;
		else	
			return false;		
	}
	
	public void excluir(int pos)
	{		
		NoListaDupla noAtual = this.primeiroNo;	
		
		for(int posAtual=0 ; posAtual<=pos ; posAtual++)
		{
			if(posAtual == pos)
			{
				if(noAtual.getAnt() == null)
				{
					setPrimeiro(noAtual.getProx());
				}
				else if(noAtual.getProx() == null)
				{
					setUltimo(noAtual.getAnt());
				}
				else
				{
					noAtual.getAnt().setProx(noAtual.getProx());
					noAtual.getProx().setAnt(noAtual.getAnt());
				}				
			}
			noAtual = noAtual.getProx();
		}		
	}
	
	public void excluir(Object objeto){
		
		NoListaDupla noAtual;
		boolean achou = false;
		
		if(!listaVazia())
		{
			noAtual = getPrimeiro();			
			while(noAtual != null)	
			{			
				if(objeto == noAtual.getObjeto())
				{
					noAtual.getAnt().setProx(noAtual.getProx());
					noAtual.getProx().setAnt(noAtual.getAnt());
					noAtual = null;
					achou = true;
				}
				if(!achou)
				{
					noAtual = noAtual.getProx();
				}
			}		
		}		
	}
}
