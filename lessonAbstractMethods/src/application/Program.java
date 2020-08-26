package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of taxpayers: ");
		int n = sc.nextInt();
		
		List<Pessoa> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Taxpayer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Pessoa tp : list) {
			System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tp.imposto()));
		}
		
		System.out.println();
		double sum = 0.0;
		for (Pessoa tp : list) {
			sum += tp.imposto();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		
		
		sc.close();
	}

}
