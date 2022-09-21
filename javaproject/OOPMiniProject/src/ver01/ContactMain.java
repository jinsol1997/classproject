package ver01;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		Contact user = new Contact("손흥민", "010-1111-1111", "son@gmail.com", "서울", "1월 1일", "축구단");

		System.out.println("이름 : " + user.getName());
		System.out.println("전화번호 : " + user.getPhoneNumber());
		System.out.println("이메일 : " + user.getEmail());
		System.out.println("주소 : " + user.getAddress());
		System.out.println("생일 : " + user.getBirthday());
		System.out.println("그룹 : " + user.getGroup());

		user.showInfo();

		while (true) {
			System.out.println("1. 입력 시작 | 0. 종료");
			String select = userInput.nextLine();

			// 사용자 요청에 따라 프로그램 종료/진행 => 분기
			if (select.equals("0")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!select.equals("1")) {
				System.out.println("올바른 요청이아닙니다.");
				continue;
			}
			
			System.out.println("데이터 입력을 시작합니다.");
			System.out.println();
			
			System.out.println("이름을 입력하세요");
			user.setName(userInput.nextLine());
			
			System.out.println("전화번호를 입력하세요");
			user.setPhoneNumber(userInput.nextLine());
			
			System.out.println("이메일을 입력하세요");
			user.setEmail(userInput.nextLine());
			
			System.out.println("주소를 입력하세요");
			user.setAddress(userInput.nextLine());
			
			System.out.println("생일을 입력하세요");
			user.setBirthday(userInput.nextLine());
			
			System.out.println("그룹을 입력하세요");
			user.setGroup(userInput.nextLine());

			System.out.println();

			user.showInfo();

			
		}

	}
}
