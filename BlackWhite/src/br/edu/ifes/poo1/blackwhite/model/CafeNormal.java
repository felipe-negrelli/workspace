package br.edu.ifes.poo1.blackwhite.model;

public class CafeNormal extends BaseCafe {

	private final int QTD_PO_SOLUVEL = 100;
	
	public CafeNormal()
	{
		for (int contador = 0; contador < QTD_PO_SOLUVEL; contador++ )
		{
			PoSoluvel cafeSoluvel = new PoSoluvel();
			ingredientes.add(cafeSoluvel);
		}
	}
	
	
}
