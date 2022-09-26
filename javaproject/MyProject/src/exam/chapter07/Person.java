package exam.chapter07;

import java.time.LocalDate;

public class Person {

	String name;
	String residentNumber;

	public Person(String name, String residentNumber) {
		this.name = name;
		this.residentNumber = residentNumber.replace("-", "");
	}

	int getAge() {

		int age = 0;

		String tempYear = residentNumber.substring(0, 2);

		int currYear = LocalDate.now().getYear();

		int birthYear = Integer.parseInt(tempYear);

		if (getGender() == 1 || getGender() == 2) {
			age = currYear - (birthYear + 1900) + 1;
		} else if (getGender() == 3 || getGender() == 4) {
			age = currYear - (birthYear + 2000) + 1;
		} else {
			System.out.println("잘못된 주민등록번호 입니다.");
		}

		return age;

	}

	int getGender() {
		return Integer.parseInt(residentNumber.substring(7, 8));
	}

	public void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "입니다. " + getAge() + "살 입니다.");
	}

}
