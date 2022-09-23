package exam.chapter07;

import java.util.Calendar;

public class Person {

	String name;
	String residentNumber;

	public Person(String name, String residentNumber) {
		this.name = name;
		this.residentNumber = residentNumber;
	}

	public int getAge() {

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		long birth = stringToLong() / 100000000000L + 1900L;
		System.out.println("birth 값 : " + birth);
		if(birth<1922) {
			birth+=100;
		}
		return year - (int) birth + 1;
	}

	public void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "입니다. " + getAge() + "살 입니다.");
	}

	public long stringToLong() {
		String result = this.residentNumber.replace("-", "");
		System.out.println("stringTolong 리턴값 : " + Long.parseLong(result));
		return Long.parseLong(result);
	}

}
