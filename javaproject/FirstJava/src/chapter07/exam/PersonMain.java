package chapter07.exam;

public class PersonMain {

	public static void main(String[] args) {

		Male m = new Male("SON", "971122-1111111", "sonny");
		Female f = new Female("King", "001222-4444444", "체육", 3);

		m.printInfo();
		m.hi();

		System.out.println();

		f.printInfo();

		System.out.println();
		System.out.println();
		f.printSchoolInfo();

		Person p1 = m;
		Person p2 = f;
		
		System.out.println();
		System.out.println("----------------");
		p2.printInfo();
	}

}
