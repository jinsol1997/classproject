package chapter03;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int age = 25; // 회원의 나이
		boolean chk = false; // 성인 판별
		
		// chk = 상태값(논리값: 조건식) ? true : false;
		chk = age > 19 ? true : false;
		
		System.out.println("성인 판별값: " + chk);
		
		String msg = age > 19 ? "성인 입니다" : "미성년 입니다.";
		System.out.println(msg);
		
		int num1 = 2;
		int num2 = 5;
		
		//큰수 : 같은 수는 없다!
		int maxNum = num1 > num2 ? num1 : num2;
		System.out.println("큰수 : " + maxNum);
		
		int minNum = num1 > num2 ? num2 : num1; 
		System.out.println("작은 수 " + minNum);
		
		// 홀수 짝수 판별 : 나머지 값으로 비교
		// 홀수 : 나머지 값 = 1
		// 짝수 : 나머지 값 = 0
		
		String result = num2 % 2 == 1 ? "홀수 입니다." : "짝수 입니다.";
		System.out.println("num2의 값은 " + result);
		
		int num3 = -566;
		
		// 양수 음수 0 을 판단해서 결과 메시지를 출력하는 코드를 작성해보자
		// 먼저 양수를 판단
		String msg1 = num3>0 ? "양수 입니다." : num3 == 0 ? "0입니다." : "음수 입니다." ;	// "0입니다.", "양수 입니다.", "음수 입니다."
		// 삼항연산자 중첩
		
		System.out.println("변수 num3은 " + msg1);
		
		// 절대값
		int resultNum = num3>0 ? num3 : num3==0 ? 0 : -num3;
		System.out.println("num3의 절대값은 " + resultNum);
		
		
	}
}
