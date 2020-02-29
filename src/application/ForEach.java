package application;

public class ForEach {

	public static void main(String[] args) {
		/**
		 * Demo Leitura: "para cada objeto 'obj' contido em vect, faça:"
		 * 
		 */
        System.out.println("**********  For Convencional *****************");
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println();
		System.out.println("**********  For Each *****************");
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
