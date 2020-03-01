package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca.entities.Employee;
import heranca.entities.OutsourcedEmployee;

public class TestEmployeeOutsourcedEmployeeList {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");

		int numberEmployee = sc.nextInt();
		List<Employee> employee = new ArrayList<Employee>();

		for (int i = 0; i < numberEmployee; i++) {
			System.out.printf("Employee #%d data:%n", (i+1));
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();
			if (outsourced == 'y') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employee.add(new OutsourcedEmployee(name, hours, valuePerHour,additionalCharge));

			} else if (outsourced == 'n') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				employee.add(new Employee(name, hours, valuePerHour));

			} else {
				System.out.println("Op��o Invalida!!!");
				System.out.println("Entre novamente");
				i--;

			}
		}
		System.out.println("\nPAYMENTS:");
		for (Employee e : employee) {
			System.out.printf("%s - %.2f\n",e.getName(),e.payment());
		}


		sc.close();


	}

}
