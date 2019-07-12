package org.danielRoa;

public class StringExample {

	public static void main(String[] args) {

		String[] names = {"Peter", "Philip", "Michael", "Daniel"};
		
		for (String n : names) {
			
			n = n.toLowerCase();
			
			if (n.toLowerCase().startsWith("p")) {
				
				System.out.println(n);
				
			}
		
		}
		
		System.out.println("");
		
		
		for (String name : names) {
			
			if (name.trim().toLowerCase().endsWith("l")) {
				System.out.println(name);
			}
			
		}
		
		
		System.out.println("");
		
		String date = "30.05.1975";
		
		int index = date.indexOf(".");
		
		int lastIndex = date.lastIndexOf(".");
		
		System.out.println(date.substring(index + 1, lastIndex));
	

	}

}
