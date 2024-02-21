package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced? (y/n): ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine(); // consumir a linha pendente
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				// declarando um funcionario tercerizado
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge)); // adicionado a lista
			} else {
				// declarando um funcionario temporario
				list.add(new Employee(name, hours, valuePerHour));
			}

		}

		// exibir a lista
		System.out.println();
		System.out.println("---------------");
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();

	}

}
