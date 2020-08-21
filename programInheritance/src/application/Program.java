package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 1000.0);
		Account bacc = new SavingsAccount(1002, "Maria", 1000,0.0);

		// UPCASTING

		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 1000, 0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//TEST OVERRIDE
		
		acc.withdraw(200);
		System.out.println(acc.getBalance());
		bacc.withdraw(200);
		System.out.println(bacc.getBalance());
		acc2.withdraw(200);
		System.out.println(acc2.getBalance());

	}

}
