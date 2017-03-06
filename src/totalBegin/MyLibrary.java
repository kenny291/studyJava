package totalBegin;

import java.util.ArrayList;

public class MyLibrary {

	// no modify
	public ArrayList<Book> book;
	public String name;
	public ArrayList<Person> people;
	
	public MyLibrary(String name) {
		this.name = name;
		
		// tell compiler a local variable.
		//ArrayList<Book> book = new ArrayList<Book>();
		book = new ArrayList<Book>();
		people = new ArrayList<Person>();
	}

	public ArrayList<Book> getBook() {
		return book;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void addBook(Book b1) {
		this.book.add(b1);
		
	}

	public void removeBook(Book b2) {
		this.book.remove(b2);
		
	}

}
