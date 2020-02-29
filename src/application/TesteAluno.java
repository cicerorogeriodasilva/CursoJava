package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno a = new Aluno();
		
		a.nome  = sc.nextLine();
		a.nota1 = sc.nextDouble();
		a.nota2 = sc.nextDouble();
		a.nota3 = sc.nextDouble();
		
		System.out.println(a);
		
		
		sc.close();
	}

}
