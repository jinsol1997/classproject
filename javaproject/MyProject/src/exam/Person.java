package exam;
/*
Person 클래스를 만들어 보고, 아래의 회원 정보를 저장하는 변수들을 선언해봅시다. 
변수이름을 작성하는 규칙에 맞게 직접 변수 이름을 정의해 보세요. 
① 회원이름을 저장하는 변수
② 회원 전화번호 ( 000-0000-0000 )를 저장하는 변수
③ 회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수
*/
import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String userName = userInput.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String userCallNumber = userInput.nextLine();
		System.out.println("주민등록번호를 입력해주세요.");
		String userNumber = userInput.nextLine();
	
		System.out.println("이름 : " + userName);
		System.out.println("전화번호 : " + userCallNumber);
		System.out.println("주민등록번호 : " + userNumber);
	}

}
