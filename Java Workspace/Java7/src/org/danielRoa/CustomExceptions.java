package org.danielRoa;

public class CustomExceptions {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 0;
		
		double res = divide(a, b);
		
		System.out.println(res);
		
	}//fin MAIN

	private static double divide(double a, double b) {
		// TODO Auto-generated method stub
		if (b == 0) {
			throw new DivideWithZeroException();
		}
		
		return a / b;
	}
	
}//fin CLASS
