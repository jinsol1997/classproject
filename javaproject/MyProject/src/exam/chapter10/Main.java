package exam.chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
1. 콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다. 
① 사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
② 예외 클래스 이름은 BadIdInputException이라고 정의합시다.
2. Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.
*/

public class Main {

	public static void main(String[] args) throws BadIdInputException {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("아이디를 입력해주세요.");

			String id = sc.nextLine();

			try {
				for (int i = 0; i < id.length(); i++) {
					if (!(id.charAt(i) >= 'a' && id.charAt(i) <= 'z' || id.charAt(i) >= 'A' && id.charAt(i) <= 'Z'
							|| id.charAt(i) >= 0 && id.charAt(i) <= 9)) {
						throw new BadIdInputException(id);
					}
				}

				System.out.println("정상적인 ID 입니다.");

			} catch (BadIdInputException e) {
				System.out.println(e.getMessage());
			}

			System.out.println();
			System.out.println("태어난 년도를 입력해주세요.");

			try {
				int birthYear = sc.nextInt();
				System.out.println("정상적인 년도입니다.");
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요.");
			}
		}

	}
}
