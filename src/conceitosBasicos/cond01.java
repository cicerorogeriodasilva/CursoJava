package conceitosBasicos;
import java.util.Scanner;

/**
Fazer um programa para ler um n�mero inteiro, 
e depois dizer se este n�mero � negativo ou n�o.
 */

public class cond01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
	    
		if (N < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		sc.close();
	}
}