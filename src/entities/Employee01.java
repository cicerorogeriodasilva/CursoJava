package entities;

public class Employee01 {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		
		return grossSalary - tax;
		
	}
	public void increaseSalary(double percentage) {
		
		grossSalary = grossSalary * (1.0 + percentage / 100);
	}

}
