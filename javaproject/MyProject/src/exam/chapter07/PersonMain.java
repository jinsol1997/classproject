package exam.chapter07;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = userInput.nextLine();
		System.out.println("주민등록번호를 입력해주세요.");
		String residentNumber = userInput.nextLine();

		Person p = new Person(name, residentNumber);

		if (p.getGender() == 1 || p.getGender() == 3) {
			Male male = new Male(p.name, p.residentNumber);
			male.introduce();
		} else {
			Female female = new Female(p.name, p.residentNumber);
			female.introduce();
		}

	}
}
