package aplica��o;

public class Programa {

	public static void main(String[] args) {
		
		String[] vect = new String[] { "Ana", "Maria", "Jo�o"}; 
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		};
		
		System.out.println("----------");
		
		for (String obj : vect) {
			System.out.println(obj);
		};
			
	}

}
