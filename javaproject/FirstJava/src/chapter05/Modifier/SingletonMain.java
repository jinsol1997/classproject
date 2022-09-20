package chapter05.Modifier;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton s = null;
		
		//s = new Singleton();
		s = Singleton.getInstance();
	}
}
