package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Dados do funcionário: " + funcionario);
		System.out.println();
		
		System.out.print("Qual porcentagem você quer aumentar no salário? ");
		double porcentagem = sc.nextDouble();
		funcionario.increaseSalary(porcentagem);
		System.out.println();
		
		System.out.println("Dados atualizados: " + funcionario);
		
		sc.close();
	}
}
