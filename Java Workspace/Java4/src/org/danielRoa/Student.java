package org.danielRoa;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int indexNumber;
	private String name;
	private String surname;
	private List<String> exams = new ArrayList<>();

	private static int cont = 0;
	
	public Student() {
		Student.cont++;
	}

	public static int getCont() {
		return cont;
	}

	public Student(int indexNumber, String name, String surname) {
		this(); //Esta llamando al constructor vac�o, el que contiene el cont++
		this.indexNumber = indexNumber;
		this.name = name;
		this.surname = surname;
	}
	
	public int getIndexNumber() {
		return indexNumber;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setIndexNumber(int indexNumber) {
		this.indexNumber = indexNumber;
	}

	public void takeExam(String exam) {
		
		exams.add(exam);
		
	}
	
	public void printData(){
		System.out.println("*-------------------------------------------------------------------------------------------------*");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(getIndexNumber()).append("\n");
		
		sb.append(getName()).append(" ").append(getSurname());
		
		sb.append("\n").append(exams);
		
		System.out.println(sb);
	}
	
	/*public static void main(String[] args) {
		
		
		int indexNumber = 1;
		String name = "Daniel";
		String surname = "Roa";
		
		
		Student s1 = new Student;
		
		s1.indexNumber(1);
		s1.name("Daniel");
		s1.surname("Roa");
		s1.takeExam("Java");
		s1
		
		//Student s1 = new Student(indexNumber, name, surname, exams);
		
		s1.printData();
		
		
	}*/
}
