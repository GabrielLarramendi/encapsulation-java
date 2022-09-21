import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as 3 medidas do triangulo 1: ");
		double t1a = sc.nextDouble();
		double t1b = sc.nextDouble();
		double t1c = sc.nextDouble();
		System.out.println("Digite as 3 medidas do triangulo 2: ");
		double t2a = sc.nextDouble();
		double t2b = sc.nextDouble();
		double t2c = sc.nextDouble();
		
		double area1 = area(t1a, t1b, t1c);
		double area2 = area(t2a, t2b, t2c);
		
		System.out.println(area1);
		System.out.println(area2);
		
		int maior = maiorValor(area1, area2);
		System.out.println(maior);
		
		sc.close();
	}
	
	public static double area(double a, double b, double c) {
		double p = (a + b + c)/2;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
	
	public static int maiorValor(double value1, double value2) {
		int maior = 0;
		if (value1 > value2) {
			maior = 1;
		} else {
			maior = 2;
		}
		return maior;
	}
	
}
