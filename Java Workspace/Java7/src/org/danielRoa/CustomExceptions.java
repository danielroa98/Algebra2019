package org.danielRoa;

public class CustomExceptions {

	public static void main(String[] args) {
		
		double a = 1;
		double b = 0;
		
		double res = -1;
		
		try {
			res = divide (a,b);
		} catch (DivideWithZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(res);
		
	}//fin MAIN

	private static double divide(double a, double b) throws DivideWithZeroException {

		if (b == 0) {
			throw new DivideWithZeroException();
		}
		
		return a / b;
	}//fin DIVIDE
	
}//fin CLASS
