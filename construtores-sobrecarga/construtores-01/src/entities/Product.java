package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product() {
        //Construtor padrão explícito e criado manualmente.
    }

    public Product(String name, double price, int quantity) {
        //Esse construtor obriga, quando o objeto é instanciado, já passar os 3 valores para os atributos de uma vez só.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        /* Sobrecarga => Um construtor com o mesmo nome, mas com parâmetros diferentes.
        * Dessa vez só quero que, no programa, sejam passados os valores para o atributo name e price,
        * assim, o atributo quantity fica com o valor de um contrutor padrao (Zero) quando não necessita passar parâmetros */
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
