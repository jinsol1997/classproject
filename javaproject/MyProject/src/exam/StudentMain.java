package exam;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		
		System.out.println("학생 수 설정 : ");
		Scanner userInput = new Scanner(System.in);
		int count = userInput.nextInt();
		
		System.out.println("===============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===============================================");
		
		Student[] students = new Student[count]; 
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		for(int i=0;i<students.length;i++) {
			students[i] = new Student();
			
			students[i].setName("학생"+(i+1));
			students[i].setKorScore((int)(Math.random()*100));
			students[i].setEngScore((int)(Math.random()*100));
			students[i].setMathScore((int)(Math.random()*100));
			
			korTotal += students[i].getKorScore();
			engTotal += students[i].getEngScore();
			mathTotal += students[i].getMathScore();
			
			System.out.println(students[i]);
		}
		
		System.out.println("===============================================");
		System.out.printf("과목총점\t%d \t%d \t%d\n", korTotal, engTotal, mathTotal);
		System.out.printf("과목평균\t%.2f \t%.2f \t%.2f\n", korTotal/(float)count, engTotal/(float)count, mathTotal/(float)count);
		System.out.println("===============================================");
		
		
	}
}
