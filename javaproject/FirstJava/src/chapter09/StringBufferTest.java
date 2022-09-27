package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {

		// StringBuffer, StringBuilder
		// Buffer는 동기화, Builder는 미동기화
		// 멀티스레드=Buffer사용, 단일스레드=Builder 사용
		
		StringBuffer sb = new StringBuffer("Hello");	// 5+16


		System.out.println(sb);
		
		// 문자열 붙이기
		sb.append('~');
		
		System.out.println(sb);
		sb.append(false);
		
		System.out.println(sb);
		
		// 특정 문자열 삭제
		System.out.println(sb.delete(0, 1));
		
		// 특정위치에 문자열 삽입
		System.out.println(sb.insert(6, "~"));
		System.out.println(sb.insert(sb.length(), true));
		
		System.out.println(sb.reverse());
	}
}
