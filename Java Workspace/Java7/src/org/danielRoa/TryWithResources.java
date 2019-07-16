package org.danielRoa;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResources {

	public static void main(String[] args) {

		File file = new File("C:/Users/Korisnik/Desktop/Test/Input.txt");

		try (Reader r = new FileReader(file);){
		 
		 int num;

		 while ((num = r.read()) != -1) {
		  System.out.print((char) num);
		 }

		} catch (IOException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		}		 
	
	}

}
