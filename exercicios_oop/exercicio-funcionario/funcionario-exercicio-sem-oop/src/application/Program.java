package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name;
		double grossSalary, tax, netSalary, aumento, newSalary;
		
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Gross Salary: ");
		grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		tax = sc.nextDouble();
		
		netSalary = grossSalary - tax;
		
		System.out.println("Employee " + name + ", " + netSalary);
		
		System.out.print("Qual porcentagem você quer aumentar ao salário? ");
		aumento = sc.nextDouble();
		newSalary = netSalary + (aumento/100) * grossSalary;
		
		System.out.println("Updated data: " + name + ", " + newSalary);
		
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Gross Salary: ");
		grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		tax = sc.nextDouble();
		
		netSalary = grossSalary - tax;
		
		System.out.println("Employee " + name + ", " + netSalary);
		
		System.out.print("Qual porcentagem você quer aumentar ao salário? ");
		aumento = sc.nextDouble();
		newSalary = netSalary + (aumento/100) * grossSalary;
		
		System.out.println("Updated data: " + name + ", " + newSalary);
		
		sc.close();
	}
}
