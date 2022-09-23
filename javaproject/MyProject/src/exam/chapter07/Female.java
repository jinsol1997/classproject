package exam.chapter07;

public class Female extends Person {

	public Female(String name, String residentNumber) {
		super(name, residentNumber);
	}

	@Override
	public void introduce() {
		System.out.println("안녕하세요. 저는 " + name + "입니다. " + getAge() + "살 입니다. 여자입니다.");
	}

}
