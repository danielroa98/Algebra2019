package org.danielRoa;

import first.api.Calculator;

public class CalculatorUser {
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator(1.2, 2.4);
		
		System.out.println(cal.add());
		System.out.println("\n"+cal.sub());
		System.out.println("\n"+cal.div());
		System.out.println("\n"+cal.mul());
		
	}
	
}
