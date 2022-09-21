package entities;

public class Student {
	
	public String name;
	public double nota1,
				  nota2,
				  nota3;
	
	public double finalNota() {
		return nota1 + nota2 + nota3;
	}
	
	/*
	 * public String passOrNot() { if (finalNota() >= 60.00) { return "PASS"; } else { return "FAILED"; } }
	 */
	
	public double missingNote() {
		if (finalNota() < 60.0) {
			return 60 - finalNota();
		} else {
			return 0.0;
		}
	}
	
	/*
	 * public String toString() { return "NOTA FINAL = " + String.format("%.2f %n",
	 * finalNota()) + passOrNot(); }
	 */
}
