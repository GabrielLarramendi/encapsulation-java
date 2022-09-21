package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite a altura do triângulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("Digite a largura do triângulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f %n", retangulo.area());
		System.out.printf("PERÍMETRO = %.2f %n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f %n", retangulo.diagonal());
		
		sc.close();

	}
}
