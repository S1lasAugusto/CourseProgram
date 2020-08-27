package application;

import java.util.Locale;
import java.util.Scanner;

import model.Exception.ExceptionDomain;
import model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		try {
			System.out.println("Enter account data: ");
			System.out.println("Number: ");
			Integer number = sc.nextInt();
			System.out.println("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.println("Balance: ");
			double balance = sc.nextDouble();
			System.out.println("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();

			Account account = new Account(number, holder, balance, withdrawLimit);

			System.out.println("Enter the Withdraw value: ");
			double amount = sc.nextDouble();
			account.withDraw(amount);
			
			System.out.println("New Balance: "+ account.getBalance());
			
		} catch (ExceptionDomain e) {

			System.out.println(e.getMessage());

		}

		
		sc.close();
	}

}
