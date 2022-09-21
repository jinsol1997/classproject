package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {

		// 배열 : 많은 수의 변수를 다루어야 할 때 사용
		// 일괄 처리
		// 변수 여러개를 순차적으로 만든 것과 같은 효과
		// 메모리를 옆에 붙여서 생성
		// 배열 변수 => 타입[] 변수이름 << 이걸 주로 사용
		// 타입 변수이름[]
		// 배열 생성 : 메모리 공간 생성, 변수들을 생성
		// new 타입[개수] => []안에 입력한 숫자 만큼의 메모리 공간을 생성

		// 10명의 국어점수를 저장하는 배열을 선언하고 생성

		int[] korScore = new int[10];

		// 배열의 사이즈를 가지고 있는 length
		System.out.println("배열의 요소 개수 : " + korScore.length);

		// 배열의 참조 방법 : 변수이름[index]
		// index 0부터 배열 요소 개수 - 1
		// index => 0~9

		for (int i = 0; i < korScore.length; i++) {

			int temp = korScore[i];
			// System.out.println(i + " : " + temp);

		}

		// 배열 요소의 초기화
		korScore[0] = 93;
		korScore[1] = 70;
		korScore[2] = 92;
		korScore[3] = 60;
		korScore[4] = 70;
		korScore[5] = 30;
		korScore[6] = 98;
		korScore[7] = 100;
		korScore[8] = 51;
		korScore[9] = 70;

		System.out.println();
		sum(korScore);

	}

	public static void sum(int arr[]) {

		// arr => korScores 의 배열 인스턴스 주소
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("총점 : " + sum);
		System.out.println("반 평균 : " + (float) sum / arr.length);
	}
}
