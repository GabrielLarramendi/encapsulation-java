package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f %n", student.finalNota());
		
		if (student.finalNota() >= 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("AINDA FALTA(M) " + student.missingNote() + " PONTO(S)");
		}
		
		sc.close();
	}
}
