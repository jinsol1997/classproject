package chapter02;

public class ValiableTest {
	
	//클래스의 시작
	public static void main(String[] args) {
		
		// 자료형 변수이름 = 데이터;
		int num = 1000;
		// 숫자 1000을 저장하기 위한 메모리 공간 생성, 저장 공간을 찾아갈 수 있는 주소 가지는 이름 num
		//변수 선언 과 초기화
		
		// 숫자
		//	- 정수 : byte, short, int, long
		//	- 실수 : float, double
		// 문자 : char
		// 논리값 : boolean
		// 문자열( 참조형 ) : String
		
		int num1 = 100; // 자료형의 기본값
		byte num2 = 100; // 바이너리 코드 사용할 때 사용
		short num3 = 100; // 안씀. c언어랑 연동하는 라이브러리 사용할 때만 씀
		long num4 = 100;
		
		float num5 = 0.5f; // 0.5 -> 리터럴
		double num6 = 0.5;
		
		boolean check = false; // true, false
		
		String str = null;
		str = "String";
	}

}
