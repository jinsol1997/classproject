package chapter08;

public class OuterClass1 {

	OuterClass1(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	static class NestedClass{
		public void simpleMethod() {
			System.out.println("Nested Class instance Method One");
		}
	}
	
	public static void main(String[] args) {
		
		OuterClass1 one = new OuterClass1();
		OuterClass1.NestedClass nst1 = new OuterClass1.NestedClass();
		nst1.simpleMethod();
		
	}
	
}
