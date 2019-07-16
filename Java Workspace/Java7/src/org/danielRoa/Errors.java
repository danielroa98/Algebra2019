package org.danielRoa;

import java.util.ArrayList;
import java.util.List;

public class Errors {

	public static void main(String[] args) {
		
	
	try {
		List<String> list = new ArrayList<>();
		
		while(true) {
			list.add("Test");
		}
	} catch (OutOfMemoryError e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  catch (Error e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	catch (Throwable e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
