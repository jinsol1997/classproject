package ver07;

public class SmartPhoneMain2 {

	public static void main(String[] args) {

		SmartPhone2 sp = SmartPhone2.getInstance();

		while (true) {

			sp.printMenu();
			try {
				int select = Integer.parseInt(sp.sc.nextLine());
				if (select < 1 || select > 6) {
					throw new BadMenuInputException("1~6 사이의 값을 입력해주세요.");
				}
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
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
