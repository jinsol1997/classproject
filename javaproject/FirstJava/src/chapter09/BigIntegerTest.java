package chapter09;

import java.math.BigInteger;

public class BigIntegerTest {

	public static void main(String[] args) {
		
		BigInteger bi1 = new BigInteger("1000000000000000000000000000");
		BigInteger b12 = new BigInteger("100000000000000000000000000");
		
		System.out.println(bi1.add(b12));
		System.out.println(bi1.subtract(b12));
		System.out.println(bi1.multiply(b12));
		System.out.println(bi1.divide(b12));
		
	}
}
