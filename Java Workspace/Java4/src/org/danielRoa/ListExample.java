package org.danielRoa;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.remove(list.size()-1);
		
		list.set(0, 15);
		
		for (Integer n : list) {
			System.out.println(n);
		}
		
		System.out.println("");
		
		for (int cont = list.size() - 1; cont >= 0; cont--) {
			System.out.println(list.get(cont));
		}
	
		
		
	}
	
}
