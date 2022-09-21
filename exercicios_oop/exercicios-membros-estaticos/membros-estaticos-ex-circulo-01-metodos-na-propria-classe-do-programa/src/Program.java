import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor para o raio: ");
		double radious = sc.nextDouble();
		
		double c = circunference(radious);
		double v = volume(radious);
		
		System.out.printf("Circunferencia: %.2f %n", c);
		System.out.printf("Volume: %.2f %n", v);
		System.out.printf("PI = %.2f %n", PI);
		
		sc.close();

	}
	
	public static double circunference(double radious) {
		return 2 * PI * radious;
	}
	
	public static double volume(double radious) {
		return 4 * PI * Math.pow(radious, 3) / 3;
	}

}
