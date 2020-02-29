package conceitosBasicos;
import java.util.Scanner;

/**
Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar
uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando
se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros
devem poder ser digitados em ordem crescente ou decrescente.
 */


public class uri1044 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}
