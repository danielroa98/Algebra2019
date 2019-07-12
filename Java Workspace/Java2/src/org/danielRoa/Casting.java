/*
 * Daniel Roa
 * July 9th, 2019
 */

package org.danielRoa;

public class Casting {

	/*
	 * Prueba de casting de variables
	 */
	
	public static void main(String[] args) {
		
		int i = 32000000;
		
//		Implicit cast, when you change a variable to a larger declarable variable
		long l = i;
		
		System.out.println(l);

		
//		explicit casting, when you convert a variable so it fits into another variable 
		short s = (short)i;
		System.out.println(s);
		
		double d = 2.5;
		
		i = (int)d;
		
		l = 20000000000l; // or it could also be l = 20000000000L;
		
		float f = 2.5f;
	}

}
