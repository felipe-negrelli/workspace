package hello;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import br.ifes.edu.poo1.Calculadora;

public class CalcTest {
	
	Calculadora c;
	
	@Before
	public void before()
	{
		 c = new Calculadora();
	}
	
	@Test
	public void somar()
	{
		Integer resultado = c.somar(10, 20);
		Assert.assertSame(30, resultado);
	}
	
	@Test(expected = ArithmeticException.class)
	public void dividir()
	{
		Integer result = c.dividir(30, 0);
	}

}
