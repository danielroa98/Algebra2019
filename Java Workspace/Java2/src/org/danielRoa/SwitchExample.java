package org.danielRoa;

/*
 * Daniel Roa
 * July 9th, 2019
 */

public class SwitchExample {
	public static void main(String[] args) {
		
		int grade = 4;
		
		switch (grade) {
		case 1:
			System.out.println("Failed");
			break;

		case 2:
			System.out.println("Not so good");
			break;
			
		case 3:
			System.out.println("Good");
			break;
		
		case 4:
			System.out.println("Very good");
			break;
			
		case 5:
			System.out.println("Excellent");
			break;
			
		default:
			System.out.println("Please insert a valid grade.");
			break;
		}
		
	}
}
