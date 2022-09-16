package chapter04;

public class WhileLoop {

	public static void main(String[] args) {
		
		// 5번 "JAVA"를 출력하는 코드 작성
		
		int cnt = 0;
		while(true) {
			System.out.println("JAVA");
			
			if(cnt++>=4) {
				break;
			}
		}
		
		
		// 짝수이면서 : num%2 == 0
		// 7의 배수인 수 : num/7 == 0
		
		int num = 1;
		while(true) {
			if(num%2==0 && num%7==0) {
				System.out.println("짝수 이면서 7의 배수인 0과 가장 가까운 수 : " + num);
				break;
			} else {
				num++;
			}
		}
		
		
	}
}
