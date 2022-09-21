package entities;

public class Funcionario {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double porcentagem) {
		grossSalary += (porcentagem/100) * grossSalary;
	}
	
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f %n", netSalary());
	}
}
