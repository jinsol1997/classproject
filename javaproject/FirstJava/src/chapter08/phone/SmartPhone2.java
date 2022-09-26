package chapter08.phone;

public class SmartPhone2 extends Computer implements Phone, Application {

	boolean power;

	public SmartPhone2(String acount) {
		super(acount);
		this.power = false;
	}

	@Override
	public void call() {
		// 119에 전화를 합니다
		// 상수를 이용해서 번호를 만들고 출력

		String number1 = String.valueOf(Phone.PHONE_NUM_1);
		String number9 = String.valueOf(Phone.PHONE_NUM_9);

		System.out.println(number1 + number1 + number9 + "에 전화를 합니다.");

		// System.out.println("" + Phone.Phone_NUM_1 + Phone.Phone_NUM_1 +
		// Phone.PHONE_NUM_9);
	}

	@Override
	public void turnOn() {

		if (!power) {
			power = true;
		}
	}

	@Override
	public void turnOff() {

		if (power) {
			power = false;
		}
	}

	public static void main(String[] args) {
		SmartPhone2 phone = new SmartPhone2("cool@gmail.com");

		phone.call();
		phone.calculator();
	}

	@Override
	public void appRun(String appName) {

		System.out.println(appName + " 앱을 실행합니다.");
	}

	@Override
	public void appStop(String appName) {

		System.out.println(appName + " 앱을 종료합니다.");
	}

}
