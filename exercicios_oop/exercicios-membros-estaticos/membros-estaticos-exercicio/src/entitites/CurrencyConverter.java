package entitites;

public class CurrencyConverter {
	
	public static final double IOF = 6.0/100;
	
	public static double totalPayment(double dolarPrice, double dolarQuantity) {
		return dolarPrice * dolarQuantity  + (dolarPrice * dolarQuantity * IOF);
	}
	
	
}
