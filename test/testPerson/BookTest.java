package testPerson;

import static org.junit.Assert.*;

import org.junit.Test;

import totalBegin.Book;
import totalBegin.Person;

public class BookTest {

	@Test
	public void testTest() {
		Book b1 = new Book("Excited book");
		assertEquals("Excited book", b1.title);
		assertEquals("Jack", b1.author);
	}
	
	@Test
	public void loanTest(){
		Book b2 = new Book("Bigdata");
		Person p2 = new Person();
		p2.setName("Alice");
		
		// say a person loaned the book;
		b2.setPerson(p2);
		
		// get name person who has the book;
		Person testPerson = b2.getPerson();
		String namePerson = testPerson.getName();
		
		assertEquals("Alice", namePerson);
	}

}
