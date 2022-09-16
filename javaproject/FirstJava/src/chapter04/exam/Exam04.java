package chapter04.exam;

public class Exam04 {

	public static void main(String[] args) {
		
	/*문제 4.
		다음 식을 만족하는 조합을 찾는 프로그램 작성. 
		A B
		B A
		------
		9 9
	*/
	// 10A+B || 10B+A = 99 => A + B = 9
		
		for(int A=0; A<10;A++) {
			for(int B=0; B<10; B++) {
				if(A+B==9) {
					System.out.println("A : " + A + " 일때, B : " + B);
				}
			}
		}
		
		
	}
}
