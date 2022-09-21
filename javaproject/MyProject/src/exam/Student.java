package exam;
/*
1. 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다. 

2. Student 클래스를 정의해봅시다. 
① 학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
② 변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
③ 총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
*/

public class Student {

	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;
	
	

	public Student(String name, int korScore, int engScore, int mathScore) {
		
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public int sum() {
		return korScore + engScore + mathScore;
	}
	
	public double average() {
		int result = (int)(sum()/3.0*100);
		return result/100.0;
	}

	@Override
	public String toString() {
		return this.name + "\t" + 
				this.korScore + "\t" + 
				this.engScore + "\t" + 
				this.mathScore + "\t" +
				sum() + "\t" +
				average() + "\n";
	}
	
	
	

}
