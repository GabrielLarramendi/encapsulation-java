package application;

import entities.Product;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* A instanciação pode ser feita como:
         * Product produto = new Product(); */

        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine(); //Atribuindo valor ao atributo name da classe Product
        System.out.print("Digite o preço desse produto: RS ");
        double price = sc.nextDouble(); //Atribuindo valor ao atributo price da classe Product
        System.out.print("Digite a quantidade inicial desse produto no estoque: ");
        System.out.println();

        Product produto = new Product(name, price); //Construtor recebendo os valores e dando valor aos atributos

        System.out.println("Dados iniciais: " + produto);
        System.out.println();

        System.out.print("Agora, digite a quantidade de itens que você deseja adicionar ao estoque: ");
        int adicionar = sc.nextInt();
        produto.addProduct(adicionar); //Utilizando o metodo adicionar e fazendo o valor de quantity mudar, adicionando o numero informado para aumentar o estoque.
        System.out.println("Dados atualizados: " + produto);

        System.out.println();

        System.out.print("Agora, digite a quantidade de itens que você deseja remover do estoque: ");
        int remover = sc.nextInt(); //Guardando nessa variável o valor que quero remover
        produto.removeProduct(remover); //Utilizando o método remover da classe Product. Fazendo o a quantidade que ja tinha - a quantidade que quero tirar.
        // Agora, o atibuto quantity mudou de valor e possui a quantidade a menos que foi retirada.
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}
