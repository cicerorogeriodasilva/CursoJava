package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee01;

public class TestEmployee01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee01 emp = new Employee01();
				
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee01: %s, $ %.2f\n",emp.name, emp.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double p = sc.nextDouble();
		emp.increaseSalary(p);
		System.out.printf("\nUpdated data: %s, $ %.2f\n", emp.name, emp.netSalary());
		
		sc.close();

	}

}
