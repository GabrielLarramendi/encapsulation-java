package application;

import java.util.Scanner;

import entities.Triangle;

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
			
			//Agora, vamos utilizar o método que criamos dentro da classe Triangle
			//Como achar a área é papel da classe triangulo, colocamos a função dentro dela,
			//para que cada classe tenha o seu papel dentro do código
			double areaX = x.area();
			double areaY = y.area();
			
			System.out.printf("Area do triangulo X: %.4f %n", areaX);
			System.out.printf("Area do triangulo Y: %.4f %n", areaY);

			sc.close();
	}
}
