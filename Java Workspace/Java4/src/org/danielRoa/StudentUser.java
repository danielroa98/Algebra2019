package org.danielRoa;

import java.util.*;

public class StudentUser {

	public static void main(String[] args) {
	
//		Student s1 = new Student();
//		
//		s1.setIndexNumber(1);
//		s1.setName("Daniel");
//		s1.setSurname("Roa");
		
		Student s1 = new Student(1, "Daniel", "Roa");
		
		s1.takeExam("Java");
		s1.takeExam("Android");
		
		
		s1.printData();
		
		Student s2 = new Student();
		
		s2.printData();
		
		System.out.println("\nTotal number of student: "+Student.getCont());
	}
}
