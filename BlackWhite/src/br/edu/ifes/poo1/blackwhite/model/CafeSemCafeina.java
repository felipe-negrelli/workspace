package br.edu.ifes.poo1.blackwhite.model;

public class CafeSemCafeina extends BaseCafe {

	private final int QTD_PO_SEM_CAFEINA = 100;
	
	public CafeSemCafeina()
	{
		for (int contador = 0; contador < QTD_PO_SEM_CAFEINA; contador++ )
		{
			PoSemCafeina poSemCafeina = new PoSemCafeina();
			ingredientes.add(poSemCafeina);
		}
	}	
}
