package ver02;

import java.util.Scanner;

public class SmartPhone2 {

	private Contact[] contacts;
	private int numOfContact;
	Scanner sc;

	private SmartPhone2(int size) {
		contacts = new Contact[size];
		numOfContact = 0;
		sc = new Scanner(System.in);
	}

	private static final int maxSize = 10;

	private static SmartPhone2 sp = new SmartPhone2(maxSize);

	public static SmartPhone2 getInstance() {
		if (sp == null) {
			sp = new SmartPhone2(maxSize);
		}
		return sp;
	}

	void editContact() {
		System.out.println("데이터 수정이 진행됩니다.");
		System.out.print("수정하고자 하는 이름을 입력해주세요 >");
		String name = sc.nextLine();

		if (findNameIndex(name) < 0 || findNameIndex(name) >= maxSize) {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
			return;
		}

		Contact contact = contacts[findNameIndex(name)];

		System.out.println("데이터 수정을 진행합니다.");

		System.out.println("변경하고자 하는 이름을 입력해주세요.(현재값:" + contact.getName() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newName = sc.nextLine();

		System.out.println("변경하고자 하는 전화번호를 입력해주세요.(현재값:" + contact.getPhoneNumber() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newPhoneNumber = sc.nextLine();

		System.out.println("변경하고자 하는 이메일을 입력해주세요.(현재값:" + contact.getEmail() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newEmail = sc.nextLine();

		System.out.println("변경하고자 하는 주소를 입력해주세요.(현재값:" + contact.getAddress() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newAddress = sc.nextLine();

		System.out.println("변경하고자 하는 생일을 입력해주세요.(현재값:" + contact.getBirthday() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newBirthday = sc.nextLine();

		System.out.println("변경하고자 하는 그룹을 입력해주세요.(현재값:" + contact.getGroup() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newGroup = sc.nextLine();
		if (checkString(newName) && checkString(newPhoneNumber) && checkString(newEmail) && checkString(newAddress)
				&& checkString(newBirthday) && checkString(newGroup)) {
			contact.setName(newName);
			contact.setPhoneNumber(newPhoneNumber);
			contact.setEmail(newEmail);
			contact.setAddress(newAddress);
			contact.setBirthday(newBirthday);
			contact.setGroup(newGroup);
		} else {
			System.out.println("유효한 값이 아닙니다.");
		}

		System.out.println("정보가 수정되었습니다.");
		System.out.println();

	}

	void deleteContact() {

		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.print("삭제하고자 하는 이름을 입력해주세요 >");
		String name = sc.nextLine();

		int searchIndex = findNameIndex(name);

		if (searchIndex < 0 || searchIndex >= maxSize) {
			System.out.println("삭제하고자하는 이름의 데이터가 존재하지 않습니다.");
			return;
		}

		for (int i = searchIndex; i < numOfContact - 1; i++) {
			contacts[i] = contacts[i + 1];

		}
		numOfContact--;
		System.out.println("데이터가 삭제되었습니다.");

	}

	void searchInfoPrint() {

		System.out.println("검색을 시작합니다.");
		System.out.print("검색할 이름을 입력하세요. >");
		String name = sc.nextLine();

		int searchIndex = findNameIndex(name);

		if (searchIndex < 0 || searchIndex >= maxSize) {
			System.out.println("검색한 이름 " + name + " 의 정보가 없습니다.");
		} else {
			System.out.println("검색의 결과 ===========");
			contacts[searchIndex].showInfo();
		}

	}

	void printAllData() {

		System.out.println("전체 데이터를 출력합니다. ============");

		if (numOfContact == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}

		for (int i = 0; i < numOfContact; i++) {
			contacts[i].showInfo();
		}
	}

	void insertContact() {

		if (numOfContact == contacts.length) {
			System.out.println("최대 저장 개수는 " + contacts.length + "개 입니다.");
			return;
		}

		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthday = null;
		String group = null;

		System.out.println("입력을 시작합니다.");

		System.out.print("이름 > ");
		name = sc.nextLine();

		System.out.print("전화번호 > ");
		phoneNumber = sc.nextLine();

		System.out.print("이메일 > ");
		email = sc.nextLine();

		System.out.print("주소 > ");
		address = sc.nextLine();

		System.out.print("생일 > ");
		birthday = sc.nextLine();

		System.out.print("그룹 > ");
		group = sc.nextLine();

		if (checkString(name) && checkString(phoneNumber) && checkString(email) && checkString(address)
				&& checkString(birthday) && checkString(group)) {
			Contact contact = new Contact(name, phoneNumber, email, address, birthday, group);
			contacts[numOfContact++] = contact;

		}
	}

	int findNameIndex(String name) {
		int searchIndex = -1;

		for (int i = 0; i < numOfContact; i++) {

			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}

		return searchIndex;

	}

	boolean checkString(String str) {
		if (str != null && str.trim().length() > 0) {
			return true;
		} else {
			System.out.println("유효한 문자열이 아닙니다.");
			return false;
		}
	}
}
