package application;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

public class TestUpCastingDownCasting {
	
	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 500.0);
		System.out.println("acc --> " + acc);
		acc.deposit(100);
		System.out.println("acc --> " + acc);
		acc.withdraw(15);
		System.out.println("acc --> " + acc);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		System.out.println("bacc --> " + bacc);
		bacc.deposit(400);
		System.out.println("bacc --> " + bacc);
		bacc.withdraw(100);
		System.out.println("bacc --> " + bacc);
		bacc.loan(300);
		System.out.println("bacc --> " + bacc);
		
		// UPCASTING
		System.out.println("// UPCASTING");
		Account acc1 = bacc;
		System.out.println("acc1--> " + acc1);
		acc1.deposit(100);
		System.out.println("acc1 --> " + acc1);
		acc1.withdraw(15);
		System.out.println("acc1 --> " + acc1);
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		System.out.println("acc2 --> " + acc2);
		acc2.deposit(100);
		System.out.println("acc2 --> " + acc2);
		acc2.withdraw(15);
		System.out.println("acc2 --> " + acc2);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		System.out.println("acc3 --> " + acc3);
		acc3.deposit(100);
		System.out.println("acc3 --> " + acc3);
		acc3.withdraw(15);
		System.out.println("acc3 --> " + acc3);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bacc5 = (BusinessAccount)acc3;
			bacc5.loan(200.0);
			System.out.println("bacc5 --> " + bacc5);
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount sacc5 = (SavingsAccount) acc3;
			sacc5.updateBalance();
			System.out.println("sacc5 --> " + sacc5);
		}
		
		System.out.println("----------------------------------------------");
		Account acc7 = new Account(1001, "Alex", 1000.0);
		System.out.println("acc7--> " + acc7);
		acc7.withdraw(200.0);
		System.out.println("acc7--> " + acc7);
		System.out.println(acc7.getBalance());
		System.out.println("acc7--> " + acc7);
		
		Account acc5 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		System.out.println("acc5--> " + acc5);
		acc5.withdraw(200.0);
		System.out.println(acc5.getBalance());
		System.out.println("acc5--> " + acc5);
		
		Account acc6= new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		System.out.println("acc6--> " + acc6);
		acc6.withdraw(200.0);
		System.out.println("acc6--> " + acc6);
		System.out.println(acc6.getBalance());
		System.out.println("acc6--> " + acc6);
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
	}


}
