package org.danielRoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookUser {

	public static void main(String[] args) {
		
		List<Book> list = new ArrayList<Book>();
		
		list.add(new Book(2, "Camila", "Fobia"));
		list.add(new Book(1, "Marciano", "Molotov"));
		list.add(new Book(2, "Por atrás", "CDKF"));
		
//		Collections.sort(list);
		
		Collections.sort(list, new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.getAuthor().compareTo(o2.getAuthor());
			}
		});
		
		for (Book book : list) {
			System.out.println(book);
		}
		
	}
}
