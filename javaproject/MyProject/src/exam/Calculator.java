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

public class Calculator {

	public static void main(String[] args) {
		
		add(3, 5);
		minus(5,1);
		multiplication(10, 5);
		division(100,50);
		
	}
	
	
	public static void add(int sum1, int sum2) {
		int result = sum1 + sum2;
		System.out.println(result);
	}

	
	public static void minus(int sum1, int sum2) {
		int result = sum1 - sum2;
		System.out.println(result);
	}

	
	public static void multiplication(int sum1, int sum2) {
		int result = sum1 * sum2;
		System.out.println(result);
	}

	
	public static void division(int sum1, int sum2) {
		int result = sum1 / sum2;
		System.out.println(result);
	}
	
}





