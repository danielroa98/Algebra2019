package org.danielRoa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CheckedExceptions {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		File file = new File("C:/Users/Korisnik/Desktop/Test/Input.txt");
		
		Reader r = null;
		
		try {
			r = new FileReader(file);
		
			int num; 
			
			while((num = r.read()) != -1) {
			System.out.print((char)num);	
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			
			
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}

}
