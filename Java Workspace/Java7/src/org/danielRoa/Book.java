package org.danielRoa;

public class Book implements Comparable<Book>{

	private int id;
	private String name;
	private String author;
	
	public String getAuthor() {
		return author;
	}

	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if (this.id > o.id) {
			return -1;
		}else if (this.id < o.id) {
			return 1;
		}
		
		return 0;
	}
	
	
	
	
	
}
