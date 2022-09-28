package exam.chapter09;

public class Person {

	String name;
	String personNumber;

	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	@Override
	public boolean equals(Object obj) {

		boolean result = false;

		if (obj != null && obj instanceof Person) {
			result = this.personNumber.equals(((Person) obj).personNumber);
		}
		
	return result;	
	}
	
	
	
	

}
