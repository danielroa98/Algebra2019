package org.danielRoa;

public class RuntimeExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int i = Integer.parseInt("milica");
			
			System.out.println(i);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
