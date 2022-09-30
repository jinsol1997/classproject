package exam.chapter10;

public class BadIdInputException extends Exception {

	String id;
	int birthYear;
	
	public BadIdInputException(String id) {
		super("ID는 정상적인 영문자와 숫자로만 이루어져야 합니다.");
	}
	
	
	
	
	
}
