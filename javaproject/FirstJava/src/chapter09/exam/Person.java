package chapter09.exam;

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
		
		// 매개변수로 전달받은 객체와 비교 : 주민번호
		if(obj != null && obj instanceof Person) {
			/// Object -> Person
			Person person = (Person)obj;
			result = this.personNumber.equals(person.personNumber);
		}
		
		
		
		return result;
		
	}

	public static void main(String[] args) {
	
		Person p1 = new Person("SON", "000000-1111111");
		Person p2 = new Person("PARK", "000000-1111111");
		Person p3 = new Person("SON", "111111-7777777");
		
		System.out.println("p1과 p2는 같은 사람인가? => " + p1.equals(p2));
		System.out.println("p1과 p3는 같은 사람인가? => " + p1.equals(p3));

		
	}
	
}
