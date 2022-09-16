package chapter04;

public class ForLoopTest2 {

	public static void main(String[] args) {
		
		// 2단
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ....
		// 2 x 9 = 18
		
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단");
			System.out.println("-----------");
			for(int j=1; j<=9; j++) {	
			System.out.println(i + " x " + j + " = " + j*i);
			}
			System.out.println("-----------");
		}
	}
}
