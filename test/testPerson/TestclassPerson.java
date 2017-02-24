package testPerson;

import static org.junit.Assert.*;

import org.junit.Test;

import totalBegin.Person;

public class TestclassPerson {

	@Test
	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown", p1.getName());;
	}

	@Test
	public void testGetName() {
		Person p2 = new Person();
		p2.setName("abc");
		assertEquals("abc", p2.getName());
	}

	@Test
	public void testSetMaxiBook() {
		fail("Not yet implemented");
	}
	
	// use TDD
	@Test
	public void testToString() {
		Person p3 = new Person();
		p3.setName("Lan");
		p3.setMaxiBook(8);
		String test = "Lan has 8 books";
		assertEquals(test, p3.toString());				
	}

}
