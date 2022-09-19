package exam.chapter05;

public class Main {

	public static void main(String[] args) {
			
		Member student1 = new Member("손흥민", "010-1111-1111", "축구", 3, "heungmin@gmail.com", "1월1일", "xx시 xx동");
		Member student2 = new Member("학생2", "010-2222-2222", "컴공", 1, "user2@gmail.com");
		
		student1.printData();
		student2.printData();
	}
}
