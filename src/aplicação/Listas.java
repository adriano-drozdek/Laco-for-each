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
		list.add(2, "Lucas");
		
		System.out.println("Total de " + list.size() + " pessoas na lista. ");
		
		for (String x : list) {
			System.out.println(x);
		};

	}

}
