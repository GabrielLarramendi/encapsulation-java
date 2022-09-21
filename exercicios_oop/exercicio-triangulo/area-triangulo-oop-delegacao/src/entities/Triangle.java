package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
  // O public indica que a funcao / metodo pode ser usada em outro arquivo
  //restricao + tipo de retorno + nome da classe + atributos que recebe (ou nao)
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p*(p - a) * (p - b) * (p - c));
	}
}
