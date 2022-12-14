package ver05;

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
		String name = getString();

		if (getIndex(name) < 0 || getIndex(name) >= maxSize) {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
			return;
		}

		Contact contact = contacts[getIndex(name)];

		System.out.println("데이터 수정을 진행합니다.");

		System.out.println("변경하고자 하는 이름을 입력해주세요.(현재값:" + contact.getName() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newName = sc.nextLine();

		if (getIndex(newName) != -1) {
			System.out.println("중복된 이름입니다.");
			return;
		}

		System.out.println("변경하고자 하는 전화번호를 입력해주세요.(현재값:" + contact.getPhoneNumber() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newPhoneNumber = sc.nextLine();

		if (getPhoneNumberIndex(newPhoneNumber) != -1) {
			System.out.println("중복된 전화번호입니다.");
			return;
		}

		System.out.println("변경하고자 하는 이메일을 입력해주세요.(현재값:" + contact.getEmail() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newEmail = sc.nextLine();
		;

		System.out.println("변경하고자 하는 주소를 입력해주세요.(현재값:" + contact.getAddress() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newAddress = sc.nextLine();

		System.out.println("변경하고자 하는 생일을 입력해주세요.(현재값:" + contact.getBirthday() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newBirthday = sc.nextLine();

		System.out.println("변경하고자 하는 그룹을 입력해주세요.(현재값:" + contact.getGroup() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newGroup = sc.nextLine();

		if (contact instanceof CompanyContact) {

			CompanyContact companyContact = (CompanyContact) contact;
			System.out.println(
					"변경하고자하는 회사이름을 입력해주세요.(현재값: " + companyContact.getCompany() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String company = sc.nextLine();

			System.out.println(
					"변경하고자하는 부서이름을 입력해주세요.(현재값: " + companyContact.getDivision() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String division = sc.nextLine();

			System.out
					.println("변경하고자하는 직급을 입력해주세요.(현재값: " + companyContact.getManager() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String manager = sc.nextLine();

			if (checkString(newName) && checkString(newPhoneNumber) && checkString(newEmail) && checkString(newAddress)
					&& checkString(newBirthday) && checkString(newGroup) && checkString(company)
					&& checkString(division) && checkString(manager)) {
				companyContact.setName(newName);
				companyContact.setPhoneNumber(newPhoneNumber);
				companyContact.setEmail(newEmail);
				companyContact.setAddress(newAddress);
				companyContact.setBirthday(newBirthday);
				companyContact.setGroup(newGroup);
				companyContact.setCompany(company);
				companyContact.setDivision(division);
				companyContact.setManager(manager);
			} else {
				System.out.println("유효한 문자열이 아닙니다. 정보를 저장하지 않습니다.");
				System.out.println();
				return;
			}

		} else if (contact instanceof CustomerContact) {

			CustomerContact customerContact = (CustomerContact) contact;

			System.out.println(
					"변경하고자하는 거래처 이름을 입력해주세요.(현재값: " + customerContact.getCompany() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String company = sc.nextLine();

			System.out.println(
					"변경하고자하는 거래품목을 입력해주세요.(현재값: " + customerContact.getProduct() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String product = sc.nextLine();

			System.out.println(
					"변경하고자하는 담당자 이름을 입력해주세요.(현재값: " + customerContact.getManager() + ")\n" + "변경하지않으려면 엔터를 치세요 >");
			String manager = sc.nextLine();

			if (checkString(newName) && checkString(newPhoneNumber) && checkString(newEmail) && checkString(newAddress)
					&& checkString(newBirthday) && checkString(newGroup) && checkString(company) && checkString(product)
					&& checkString(manager)) {
				customerContact.setName(newName);
				customerContact.setPhoneNumber(newPhoneNumber);
				customerContact.setEmail(newEmail);
				customerContact.setAddress(newAddress);
				customerContact.setBirthday(newBirthday);
				customerContact.setGroup(newGroup);
				customerContact.setCompany(company);
				customerContact.setProduct(product);
				customerContact.setManager(manager);
			} else {
				System.out.println("유효한 문자열이 아닙니다. 정보를 저장하지 않습니다.");
				System.out.println();
				return;
			}
		}

		System.out.println("정보가 수정되었습니다.");
		System.out.println();

	}

	void deleteContact() {

		System.out.println("데이터 삭제가 진행됩니다.");
		System.out.print("삭제하고자 하는 이름을 입력해주세요 >");
		String name = getString();

		int searchIndex = getIndex(name);

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
		String name = getString();

		int searchIndex = getIndex(name);

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
			System.out.println();
			contacts[i].showInfo();
			System.out.println();
		}
	}

	void insertContact() {

		if (numOfContact == contacts.length) {
			System.out.println("최대 저장 개수는 " + contacts.length + "개 입니다.");
			return;
		}

		System.out.println("입력하고자하는 연락처 유형을 선택해주세요.");
		System.out.println("1. 회사 동료 \t 2. 거래처");
		int select = Integer.parseInt(getString());

		String name = null;
		String phoneNumber = null;
		String email = null;
		String address = null;
		String birthday = null;
		String group = null;

		System.out.println("입력을 시작합니다.");

		System.out.print("이름 > ");
		name = getString();

		if (getIndex(name) != -1) {
			System.out.println("중복된 이름입니다.");
			return;
		}

		System.out.print("전화번호 > ");
		phoneNumber = getString();

		if (getPhoneNumberIndex(phoneNumber) != -1) {
			System.out.println("중복된 전화번호입니다.");
			return;
		}

		System.out.print("이메일 > ");
		email = getString();

		System.out.print("주소 > ");
		address = getString();

		System.out.print("생일 > ");
		birthday = getString();

		System.out.print("그룹 > ");
		group = getString();

		Contact contact = null;

		// 분기 1. 회사 2. 거래처
		if (select == 1) {
			// CompanyContact 인스턴스 생성
			System.out.println("회사 이름 >> ");
			String company = getString();
			System.out.println("부서 이름 >> ");
			String division = getString();
			System.out.println("직급 >> ");
			String manager = getString();

			contact = new CompanyContact(name, phoneNumber, email, address, birthday, group, company, division,
					manager);

		} else {
			// CustomerContact 인스턴스 생성

			System.out.println("거래처 이름 >> ");
			String company = getString();
			System.out.println("거래 품목 >> ");
			String product = getString();
			System.out.println("담당자 >> ");
			String manager = getString();

			contact = new CustomerContact(name, phoneNumber, email, address, birthday, group, company, product,
					manager);
		}

		contacts[numOfContact++] = contact;
	}

	// Scanner 를 통해서 사용자에게 문자열을 받아서 반환하는 메소드
	// 입력 문자가 공백일 경우 다시 입력하도록 하는 기능
	private String getString() {
		String str = null;

		while (true) {
			str = sc.nextLine();
			if (str != null && str.trim().length() != 0) {
				break;
			} else {
				System.out.println("공백은 허용하지 않습니다. 정상적인 문자를 입력하세요");
			}
		}

		return str;
	}

	private int getIndex(String name) {
		int searchIndex = -1;

		for (int i = 0; i < numOfContact; i++) {

			if (contacts[i].getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}

		return searchIndex;

	}
	
	private int getPhoneNumberIndex(String phoneNumber) {
		int searchIndex = -1;

		for (int i = 0; i < numOfContact; i++) {

			if (contacts[i].getPhoneNumber().equals(phoneNumber)) {
				searchIndex = i;
				break;
			}
		}

		return searchIndex;

	}
	

	/*
	 * private String getName() { String name = null;
	 * 
	 * while (true) { name = sc.nextLine(); if (name != null && name.trim().length()
	 * != 0) { boolean check = false; for (int i = 0; i < numOfContact; i++) { if
	 * (name.equals(contacts[i].getName())) { check = true; break; } }
	 * 
	 * if (check) { System.out.println("같은 이름의 데이터가 존재합니다. \n다시입력하세요."); //
	 * continue; } else { break; } }
	 * 
	 * }
	 * 
	 * return name; }
	 */

	/*
	 * private String getPhoneNumber() { String phoneNumber = null;
	 * 
	 * while (true) { phoneNumber = sc.nextLine(); if (name != null &&
	 * phoneNumber.trim().length() != 0) { boolean check = false; for (int i = 0; i
	 * < numOfContact; i++) { if (phoneNumber.equals(contacts[i].getphoneNumber()))
	 * { check = true; break; } }
	 * 
	 * if (check) { System.out.println("같은 전화번호의 데이터가 존재합니다. \n다시입력하세요."); //
	 * continue; } else { break; } }
	 * 
	 * }
	 * 
	 * return name; }
	 */

	boolean checkString(String str) {
		if (str != null && str.trim().length() > 0) {
			return true;
		} else {

			return false;
		}
	}

	void printMenu() {
		System.out.println("======================");
		System.out.println("# 전화번호부");
		System.out.println("1. 연락처 저장");
		System.out.println("2. 연락처 검색");
		System.out.println("3. 연락처 수정");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.println("======================");

	}

}
