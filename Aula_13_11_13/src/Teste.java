import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		//teste1();
		teste2();
	}
	
	private static void teste2() {
		
		
	}

	public static void teste1()
	{
		Set<Integer> numeros = new HashSet<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		Set<Integer> outros = new TreeSet<Integer>();
		outros.add(3);
		outros.add(2);
		outros.add(1);
		
		Iterator<Integer> i;
		
		for(i=numeros.iterator(); i.hasNext();)
			System.out.println(i.next());
			
		for(i=outros.iterator(); i.hasNext();)
			System.out.println(i.next());
		
	}

}
