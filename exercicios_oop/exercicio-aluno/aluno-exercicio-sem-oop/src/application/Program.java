package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		String name;
		double nota1, nota2, nota3, notaFinal, missingNota;
		
//		name = sc.nextLine();
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		notaFinal = nota1 + nota2 + nota3;
		
		System.out.printf("NOTA FINAL = %.2f %n", notaFinal);
		
		if (notaFinal >= 60) {
			System.out.println("PASS");
		} else {
			 System.out.println("FAILED");
			 missingNota = 60 - notaFinal;
			 System.out.printf("AINDA FALTAM %.2f PONTOS. %n", missingNota);
		}
		
		sc.close();
	}
}
