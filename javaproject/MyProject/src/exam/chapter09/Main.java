package exam.chapter09;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Person p1 = new Person("King", "111111-1111111");
		Person p2 = new Person("Queen", "222222-2222222");
		Person p3 = new Person("Son", "111111-1111111");

		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));

		Date now1 = new Date();

		int sum = 0;

		long beforeSum = now1.getTime();
		for (int i = 0; i <= 100000000; i++) {
			sum += i;
		}
		Date now2= new Date();
		long afterSum = now2.getTime();

		System.out.println("연산에 걸린 시간 : " + (afterSum - beforeSum) + "밀리초");
		
		

	}
}
