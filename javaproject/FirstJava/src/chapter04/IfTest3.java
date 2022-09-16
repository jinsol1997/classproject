package chapter04;

public class IfTest3 {

	public static void main(String[] args) {
		
		// 점수에 따라서 학점 표기를 합시다
		// 100 ~ 97 : A+
		// 94 ~ 96 : A
		// 90 ~ 93 : A-
		// 80점 대는 B, B+, B-
		// 70점 대는 C, C+, C-
		
		int score = 100;
		String result = "F";
		
		if(score>=90) {
			// A, A+, A-
			result = "A";
		} else if(score>=80) {
			// B, B+, B-
			result = "B";
		} else if(score>=70) {
			// C, C+, C-
			result = "C";
		}
		
		if(score==100) {
			result += "+";
		} else if(score>=70&&score%10>=7) {
			result += "+";
		} else if(score>=70&&score%10<=3) {
			result += "-";
		}
		
		System.out.println("학점 : " + result);
		
		
		
	}
}
