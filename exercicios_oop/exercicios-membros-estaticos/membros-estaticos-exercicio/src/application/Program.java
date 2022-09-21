package application;

import java.util.Scanner;

import entitites.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço do Dolar: ");
		double dollarPrice = sc.nextDouble();
		System.out.print("Quantidade de Dolares comprados: ");
		double dollarQuantity = sc.nextDouble();
		double result = CurrencyConverter.totalPayment(dollarPrice, dollarQuantity);
		System.out.printf("Total para pagar em reais: R$ %.2f %n", result);

		sc.close();
	}
}
