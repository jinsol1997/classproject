package exam;
/*
Calculator 클래스를 정의해봅시다. 
① 정수 두 개를 매개변수의 인자로 전달받아 더하기연산 후 출력하는 메소드를 정의
② 정수 두 개를 매개변수의 인자로 전달받아 빼기연산 후 출력하는 메소드를 정의
③ 정수 두 개를 매개변수의 인자로 전달받아 곱하기연산 후 출력하는 메소드를 정의
④ 정수 두 개를 매개변수의 인자로 전달받아 나누기연산 후 출력하는 메소드를 정의
⑤ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드를 정의
⑥ 실수 반지름 하나를 매개변수의 인자로 전달받아 원의 넓이를 구해 반환하는 메소드를 반환하는 메소드를 정의
원의 둘레 : 2 x π x r , 월의 넓이 : π x r x r
⑦ main() 메소드를 정의하고 각각의 메소드를 호출해서 결과를 콘솔에 출력해봅시다.
⑧ 콘솔에서 사용자에게 데이터를 받아 메소드를 호출할 때 사용자에게 받은 데이터를 메소드의 매개변수의 인자로 전달하는 코드를 main() 메소드
에 추가해봅시다.
*/
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("첫 번째 정수를 입력해주세요.");
		int num1 = in.nextInt();
		System.out.println("두 번째 정수를 입력해주세요.");
		int num2 = in.nextInt();
		
		add(num1, num2);
		minus(num1,num2);
		multiplication(num1, num2);
		division(num1,num2);
		
		System.out.println("원의 반지름을 입력해주세요.");
		float num3 = in.nextFloat();
		System.out.printf("%f을(를) 반지름으로 갖는 원의 둘레는 %f 입니다.\t", num3, circumFerence(num3));
		System.out.printf("%f을(를) 반지름으로 갖는 원의 넓이는 %f 입니다.\t", num3, circleArea(num3));
		
		
	}
	
	
	public static void add(int sum1, int sum2) {
		System.out.println("두 수의 합 : " + (sum1 + sum2));
	}

	
	public static void minus(int sum1, int sum2) {
		System.out.println("두 수를 뺀 값 : " + (sum1 - sum2));
	}

	
	public static void multiplication(int sum1, int sum2) {
		System.out.println("두 수를 곱한 값 : " + (sum1 * sum2));
	}

	
	public static void division(int sum1, int sum2) {
		System.out.println("두 수를 나눈 값 : " + (sum1 / sum2));
	}
	
	public static float circumFerence(float sum1) {
		return (float)(2*sum1*3.14);
	}
	
	public static float circleArea(float sum1) {
		return (float)(sum1*sum1*3.14);
	}
	
	
	
}





