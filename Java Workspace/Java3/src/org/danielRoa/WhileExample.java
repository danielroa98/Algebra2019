package org.danielRoa;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 123;
		int cont = 0;
		int sum = 0;
		
		boolean greaterThanZero = true;
		
		if (n < 0) {
			n = -n;
			greaterThanZero = false;
		}
		
		while (n > 0){	
			int value = n % 10;
			
			sum += value;
			
			n /= 10;
			
			cont++;
		} 
		
		if (!greaterThanZero) {
			sum = -sum;
		}
		
		System.out.println("\nThe total addition of the numbers is "+sum+"\n");
		
		System.out.println("The number has "+cont+" digits.");
	}

}
