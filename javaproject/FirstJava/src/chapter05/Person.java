package chapter05;

public class Person {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		// 참조변수는 주소값을 저장하고 있다
		System.out.println(p);	// 주소값 출력이 아닌 경로@해시태그를 출력, toString을 오버라이딩해서 형식 바꿔 출력 가능
	}
	
}
