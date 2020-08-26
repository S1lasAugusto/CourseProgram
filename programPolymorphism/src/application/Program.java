package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of employees: ");
		int num = sc.nextInt();

		for (int counter = 1; counter <= num; counter++) {

			System.out.print("Employee #" + counter + " data: ");

			System.out.println("Outsourced (y/n)?");
			char decision = sc.next().charAt(0);
			sc.nextLine();

			if (decision == 'y' || decision == 'Y') {

				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Hours: ");
				int hours = sc.nextInt();
				System.out.println("ValuePerHour: ");
				double valuePerHour = sc.nextDouble();
				System.out.println("Additional Charge: ");
				double additionalCharge = sc.nextDouble();

				Employee employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(employee);

			} else if (decision == 'n' || decision == 'N') {

				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Hours: ");
				int hours = sc.nextInt();
				System.out.println("ValuePerHour: ");
				double valuePerHours = sc.nextDouble();

				Employee employess = new Employee(name, hours, valuePerHours);
				
				list.add(employess);

			}
			
		}

			System.out.println("Payments: ");
			for (Employee c : list) {

				System.out.println(c.getName() + " - $ " + String.format("%.2f", c.payment()));

			}

			sc.close();
		}

	

}
