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

}
