package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		r.width  = sc.nextDouble();
		r.heigth = sc.nextDouble();
		
		System.out.printf("�rea = %.2f%n",r.area());
		System.out.printf("PERIMETER = %.2f%n",r.perimeter());
		System.out.printf("DIAGONAL = %.2f%n",r.diagonal());
		
		
		sc.close();
		
	}

}
