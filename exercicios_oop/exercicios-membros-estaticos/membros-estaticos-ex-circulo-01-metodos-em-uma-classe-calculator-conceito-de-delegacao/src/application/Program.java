package application;

import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor para o raio: ");
		double radious = sc.nextDouble();
		
		double c = Calculator.circunference(radious);
		double v = Calculator.volume(radious);
		
		System.out.printf("Circunferencia: %.2f %n", c);
		System.out.printf("Volume: %.2f %n", v);
		System.out.printf("PI = %.2f %n", Calculator.PI);
		
		sc.close();
		
		/* Nesse programa, a classe teve que ser instanciada por não
		 * possuir o restritor STATIC */
	}
}



