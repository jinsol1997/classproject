package chapter08;

public class NewClass extends AbstractClass{

	// 추상클래스를 상속하고 추상메소드를 구현하지 않으면
	// 새로운 클래스도 추상 클래스가 된다
	// NewClass도 인스턴스 생성이 불가
	// 인스턴스 생성을 목적으로 한다면 추상메소드를 오버라이딩해서 완성시켜야한다
	
	String nichName;
	
	
	
	// 추상메소드를 오버라이딩을 통해 완성시킨다
	@Override
	void abstractMethod() {
		System.out.println("추상메소드를 오버라이딩해서 완성시킨 메소드");
	}
	
	
	
	
}
