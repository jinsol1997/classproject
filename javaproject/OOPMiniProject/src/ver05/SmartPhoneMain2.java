package ver05;

public class SmartPhoneMain2 {

	public static void main(String[] args) {

		SmartPhone2 sp = SmartPhone2.getInstance();

		while (true) {

			sp.printMenu();

			int select = Integer.parseInt(sp.sc.nextLine());

			switch (select) {
			case 1:
				sp.insertContact();
				break;
			case 2:
				sp.searchInfoPrint();
				break;
			case 3:
				sp.editContact();
				break;
			case 4:
				sp.deleteContact();
				break;
			case 5:
				sp.printAllData();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

}
