package org.danielRoa;

import java.util.*;

public class IfElseIfExample {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);
		
		int grade;
		
		System.out.println("Please insert a grade.");
		grade = lectura.nextInt();
		
	
		if (grade == 5) {
			System.out.println("Excellent");
		}
		
		else if (grade == 4) {
			System.out.println("Very good!");
		}
		
		else if (grade == 3) {
			System.out.println("Good");
		}
		
		else if (grade == 2) {
			System.out.println("Satisfactory");
		}
		
		else if (grade == 1) {
			System.out.println("Fail");
		}
		
		else {
			System.out.println("Please insert a valid grade.");
		}

		
	}

}