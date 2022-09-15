package chapter03;

public class RelationalOperator3 {

	public static void main(String[] args) {
		
		// 관계연산자 (비교연산자)
		// > < >= <= == !=
	
		// 관계연산도 자료형을 일치시켜놓고 연산이 이루어진다.
		
		char c = 'A';
		int num = 10;
		
		int codeNum = c + num; // 65 + 10
		System.out.println(codeNum);
		
		System.out.println(c > num);
		System.out.println('1' > '0'); // 유니코드값
		System.out.println(num == 10f); // int num이 float으로 자동 형변환
		
	}
}
