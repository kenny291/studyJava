package testPerson;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import totalBegin.Book;
import totalBegin.MyLibrary;
import totalBegin.Person;

public class MyLibraryTest {

	private Book b1;
	private Book b2;
	private Person p1;
	private Person p2;
	private MyLibrary ml;
	@Test
	public void test() {
		MyLibrary lib1 = new MyLibrary("Test");
		
		assertEquals("Test", lib1.name);
		assertTrue(lib1.book instanceof ArrayList);
		assertTrue(lib1.people instanceof ArrayList);
	}
	public void setup(){
		b1 = new Book("Book 1");
		b2 = new Book("Book 1");
		
		p1 = new Person();
		p1.setName("Person1");
		p2 = new Person();
		p2.setName("Person2");
		
		ml = new MyLibrary("Test");
	}
	
	@Test
	public void testAddBook(){
		setup();
		assertEquals(0, ml.getBook().size());
		ml.addBook(b1);
		ml.addBook(b2);
		
		assertEquals(2, ml.getBook().size());
		assertEquals(0, ml.getBook().indexOf(b1));
	
		ml.removeBook(b2);
		assertEquals(1, ml.getBook().size());
		assertEquals(0, ml.getBook().indexOf(b1));
	}
}
