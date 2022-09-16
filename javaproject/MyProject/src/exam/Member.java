package exam;
import java.util.Scanner;
import java.util.Calendar;

public class Member {

	public static void main(String[] args) {
		
		/*
		앞서 생성 했던 Member 클래스에 main() 메소드 안에 아래 조건의 변수를 정의해봅시다. 
		① String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
		② int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
		③ double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
		④ boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
		⑤ 이름과 나이, 키, 책의 보유 여부를 출력해봅시다.
		*/
		
		

		/*
		System.out.println("명진솔");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("이름입력");
		String name = userInput.nextLine();
		System.out.println("나이입력");
		int age = userInput.nextInt();
		System.out.println("키입력");
		double height = userInput.nextDouble();
		System.out.println("책보유여부 true false");
		boolean hasBook = userInput.nextBoolean();
		
		System.out.printf("이름 : %s\n나이 : %d\n키 : %f\n책 보유 여부 : %s", name, age, height, hasBook);
		System.out.println();
		*/
		
		
		
		/*
		앞에서 만든 Member 클래스에는 아래 요구사항에 맞는 메소드를 정의하고, main()메소드에 해당 메소드를 호출해서 결과를 확인해보세
		요. 메소드의 이름도 JAVA의 규칙에 맞게 정의해 봅시다. 
		① 독감예방 접종이 가능한지 여부를 확인하는 메소드를 정의합니다.
		- 매개변수로 태어난 해(년도)를 전달받습니다.
		- 15세 미만의 경우와 65세 이상의 경우 “무료예방접종이 가능합니다.” 메시지가 콘솔에 출력하도록 합니다.
		- 위에서 정의한 조건의 범위가 아닌 나머지의 경우 “무료접종 대상이 아닙니다.”라고 출력하도록 합니다.
		② 건강검진 대상 여부를 판별하고 어떤 검진이 가능한지 확인하는 메소드를 정의합니다.
		- 매개변수로 태어난 해(년도)를 전달받습니다.
		- 대한민국 성인( 20세 )의 경우 무료로 2년마다 건강검진을 받을 수 있습니다.
		- 짝수 해에 태어난 사람은 올해가 짝수년이라면 검사 대상이 됩니다.
		- 40 이상의 경우는 암 검사도 무료로 검사를 할 수 있습니다.
		*/
		
	
		Scanner userInput = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("출생년도를 입력해주세요. 종료는 (0) >>> ");
			
			int birth = userInput.nextInt();
			if(birth == 0) {
				System.out.println("프로그램을 종료합니다.");
				return; // 메소드의 종료, 반환
				// main 메소드의 종료는 프로그램의 종료
			}
			
			System.out.println("조회 결과");
			System.out.println("----------");
			checkVaccine(birth);
			checkUp(birth);
			System.out.println("----------");
			System.out.println();
		}
		
	}
	
	public static void checkVaccine(int birthYear) {
		
		// 올해 년도
		int currYear = Calendar.getInstance().get(Calendar.YEAR);
		
		int age = currYear - birthYear + 1;
		
		System.out.println("나이 : " + age);
		
		if(age<15 || age>=65) {
			System.out.println("무료 예방접종이 가능합니다.");
		} else {
			System.out.println("무료 접종 대상이 아닙니다.");
		}
		
	}
	
	public static void checkUp(int birthYear) {
		
		int currYear = Calendar.getInstance().get(Calendar.YEAR);
		int age = currYear - birthYear + 1;
	
		
		if(age >= 20 && (currYear % 2 == birthYear % 2)) {
			System.out.println("무료 건강검진 대상자 입니다.");
			if(age>=40) {
				System.out.println("암 검사도 무료로 할 수 있습니다.");
			}
		} else {
			System.out.println("무료 건강검진 대상자가 아닙니다.");
		}
	}
}

