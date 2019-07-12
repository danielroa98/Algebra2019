package org.danielRoa;

public class StringConcatenation {

	public static void main(String[] args) {
		
//		String s = "";
//		
//		for (int i = 0; i < 1000; i++) {
//			s += i;
//			
//			System.out.println(s);
//		}

	StringBuilder sb = new StringBuilder();
	
	for (int i = 0; i < 1000; i++) {
		sb.append(i);
		
	}

	System.out.println(sb);
	
	}
}
