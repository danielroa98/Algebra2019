package org.danielRoa;

import java.util.ArrayList;
import java.util.List;

public class PassByValueAndReference {

	public static void main(String[] args) {
		
		int i = 1;
		
		passByValue(i);
		
		System.out.println("Main (int): " + i);
		
		List<String> list = new ArrayList<>();
		
		passByReference(list);
		
		System.out.println("Main (list): "+list.size());
		
	}

	private static void passByReference(List<String> list) {

		list.add("Daniel");
		
		System.out.println("Method passByReference: "+ list.size());
		
	}

	private static void passByValue(int i) {

		i++;
		
		System.out.println("Method passByValue: "+i);
	
	}
	
}
