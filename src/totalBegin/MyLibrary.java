// Data Feb 2017
/*
 * Author Khiem291
 */


package src.totalBegin;

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
	public boolean checkOut(Book b1, Person p){
		if (b1.getPerson() == null) {
			b1.setPerson(p);
			return true;
		}
		else {
			return false;
		}
			
	}
	
	public ArrayList<Book> getBookForPerson(Person p1){
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book aBook: this.getBook()) {
			//do something;
			return;
		}
	}
	
	public static void main(String[]  args){
		MyLibrary libTest = new MyLibrary("abc");
		Book b1 = new Book("Book 1");
		Book b2 = new Book("Book 2");
		
		System.out.println("Created book 1, 2")
	} 
}
