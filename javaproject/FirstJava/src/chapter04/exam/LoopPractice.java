package chapter04.exam;

/*
문제 1.
for 문을 이용하여 1부터 10까지를 곱해서 그 결과를 출력하는 프로그램을 작성

문제 2.
자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 
그리고 그 합이 언제 (몇을 더했을 때) 1000이 넘어서는지, 그리고 1000이 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성.
프로그램 내부에 while문을 무한 루프로 구성하여 작성.

문제 3.
구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.
단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력

문제 4.
다음 식을 만족하는 조합을 찾는 프로그램 작성. 
A B
B A
------
9 9

문제 5.
n=1 일 때  “현재 인원은 1명 입니다.”
n=2 일 때  “현재 인원은 2명 입니다.”
n=3 일 때  “현재 인원은 3명 입니다.”
n>3 일 때  “현재 많은 사람들이 있습니다.”
위의 내용이 출력 되는 프로그램을 작성. 각각 If 문과 switch 문 사용

문제 6.
1 부터 99까지의 합을 구하는 프로그램 작성
while문, for문, do while 문을 각각 사용
*/

public class LoopPractice {

	public static void main(String[] args) {
		
		multiflyOnetoTen();
		
	}

	
	
	public static void multiflyOnetoTen(){
		int sum = 1;
		for(int i=1; i<=10; i++) {
			sum *= i;
		}
		System.out.println("1부터 10까지 곱한 값 : " + sum);
	}
	
	
}