package chapter04;

public class ifTest {

	public static void main(String[] args) {
		
		int score = 70;
		
		
		
		if(score>=60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		// 90점 이상이면 A 출력, 80점 이상 B, 70점 이상 C, 나머지 FAIL
		
		if(score>=90) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("FAIL");
		}
	}
}
