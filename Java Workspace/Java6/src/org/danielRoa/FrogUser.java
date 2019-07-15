package org.danielRoa;

public class FrogUser {

	public static void main(String[] args) {
		
		Frog f1 = new Frog(4, "Red");
		
		Frog f2 = new Frog(4, "Red");
		
		System.out.println(f1);
	
		//f1 = f2; //points to the same memory address #f1f1 = #f1f1
		
		System.out.println(f1 == f2);
		
		System.out.println(f1.equals(f2));
		
	}
	
}
