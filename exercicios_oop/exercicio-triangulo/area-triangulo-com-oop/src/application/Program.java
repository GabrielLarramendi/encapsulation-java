package application;

import java.util.Scanner;
import entities.Triangle; 
/* Importanto a classe Triangle do pacote entities. Assim, tudo que existe na classe 
 * triangle, eu trago para a classe Main e posso usar os métodos e atributos com os 
 * valores inseridos nesse escopo*/

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; //Aqui foram criadas 2 variáveis do tipo Triangle.
			
		/*Para que eu possa usar o objeto / Para que ele exista, eu devo instanciar
		 * ele em alguma variável desse tipo. */
		x = new Triangle();
		y = new Triangle();
		
		/*Para atribuir os valores de X, não precisa criar uma variável para todos os lados, 
		 * basta chamar o objeto X que já foi instanciado e chamar um de seus atributos que 
		 * vai ser definido :) */
		
		System.out.println("Digite os valores dos lados do Triangulo X: ");
		x.a = sc.nextDouble(); //Definindo o lado A do triangulo X, apenas chamando o atributo da classe.
		x.b = sc.nextDouble(); //Definindo o lado B do triangulo X, apenas chamando o atributo da classe.
		x.c = sc.nextDouble(); //Definindo o lado C do triangulo X, apenas chamando o atributo da classe.
		System.out.println("Digite os valores dos lados do Triangulo Y: ");
		y.a = sc.nextDouble(); //Mesma coisa dos lados de X.
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		/* Quando instanciamos o objeto, ja nao precisamos nos preocupar em criar variáveis para Todos
		 * os lados. */
		
		double p = (x.a + x.b + x.c)/2; //Peguei cada valor JA DEFINIDO  nos atributos de X;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2; //Peguei cada valor JA DEFINIDO nos atributos de Y;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Area do triangulo X: %.4f %n", areaX);
		System.out.printf("Area do triangulo Y: %.4f %n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: Triangulo X");
		} else {
			System.out.println("Maior área: Triangulo Y");
		}
		
		sc.close();
	}
}
