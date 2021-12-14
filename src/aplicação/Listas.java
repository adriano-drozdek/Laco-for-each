package aplicação;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Ana");
		list.add("Pedro");
		list.add("João");
		list.add(2, "Marcio");
		
		System.out.println("Total de " + list.size() + " pessoas na lista. ");
		//list.remove(1);
		
		for (String x : list) {
			System.out.println(x);
		};
		
		System.out.println("---------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		};
		
		System.out.println("---------------");
		System.out.println("Pedro está na posição: " + list.indexOf("Pedro"));
		
		

	}

}
