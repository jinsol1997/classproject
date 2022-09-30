package ver06;

public class BadMenuInputException extends Exception {

	public BadMenuInputException() {
		super("1~6 사이의 값을 입력해주세요.");
	}
}
