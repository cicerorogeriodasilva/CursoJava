package application;

import heranca.entities.BusinessAccount;

public class TestBusinessAccount {

	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

		System.out.println(account.getBalance());
		account.loan(200);
		System.out.println(account.getBalance());
		account.loan(600);
		System.out.println(account.getBalance());
		
		
	}
}