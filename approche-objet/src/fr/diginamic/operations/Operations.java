package fr.diginamic.operations;


public class Operations {

	public static double operation(double a, double b, char x) {
		if (x == '+') {
			return a + b; 
		} else if (x == '-' ) {
			return a - b;
		} else if (x == '*' ) {
			return a * b;
		} else {
			return a / b;
		}
	}
}
