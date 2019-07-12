package org.danielRoa;

import java.util.*;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Thelma", "Donald", "Jack", "Frank", "Luise"};
	
		//String[] names = new String[5];
		
		Arrays.sort(names);
		
		//Arrays.fill(names, "Collins");
		
		/*for (String name : names) {
			System.out.println(name);
		}*/
		
		
		for (int i = (names.length-1); i >= 0; i--) {
			System.out.println(names[i]);
		}
	
		
		
	}

}
