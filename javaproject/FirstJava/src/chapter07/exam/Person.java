package chapter07.exam;

import java.time.LocalDate;
import java.util.Calendar;

public class Person {

	String name;
	String personNumber;

	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}

	// 나이를 반환하는 메소드, 주민번호는 멤버변수인 personNumber 값을 이용해서 처리
	int getAge() {

		int result = 0;

		// 나이를 계산해서 반환하는 연산
		String tempYear = personNumber.substring(0, 2);
		String tempGender = personNumber.substring(7, 8);

		// int currYear = Calendar.getInstance().get(Calendar.YEAR);
		// Date -> LocalDate, LocalDatetime, LocalTime

		int currYear = LocalDate.now().getYear();

		int birthYear = Integer.parseInt(tempYear);
		int genderVal = Integer.parseInt(tempGender);

		if (genderVal == 1 || genderVal == 2) {
			result = currYear - (birthYear + 1900) + 1;
		} else if (genderVal == 3 || genderVal == 4) {
			result = currYear - (birthYear + 2000) + 1;
		}

		return result;

	}

	void printInfo() {
		System.out.printf("안녕하세요, 저는 %s 입니다. %d살 입니다.", this.name, getAge());
	}



}
