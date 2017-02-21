package totalBegin;

public class Person {
	//fields
	private String name;
	private int maxiBook;
	
	//constructors
	public Person() {
		name = "unknown";
		maxiBook = 3;
	}
	public String getName() {
		return name;
	}
	public void setName(String anyName) {
		name = anyName;
	}
	// can use source/generate get & set
	public int getMaxiBook() {
		return maxiBook;
	}
	public void setMaxiBook(int maxiBook) {
		this.maxiBook = maxiBook;
	}
	

}
