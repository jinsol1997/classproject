package ver07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartPhone2 {

	private List<Contact> contacts;

	Scanner sc;

	private SmartPhone2() {
		contacts = new ArrayList<Contact>();

		sc = new Scanner(System.in);
	}


	private static SmartPhone2 sp = new SmartPhone2();

	public static SmartPhone2 getInstance() {
		if (sp == null) {
			sp = new SmartPhone2();
		}
		return sp;
	}

	void editContact() {
		System.out.println("데이터 수정이 진행됩니다.");
		System.out.print("수정하고자 하는 이름을 입력해주세요 >");
		String name = getString();

		if (getIndex(name) == -1) {
			System.out.println("찾으시는 데이터가 존재하지 않습니다.");
			return;
		}

		Contact contact = contacts.get(getIndex(name));

		System.out.println("데이터 수정을 진행합니다.");

		System.out.println("변경하고자 하는 이름을 입력해주세요.(현재값:" + contact.getName() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newName;

		while (true) {

			newName = sc.nextLine();

			try {
				if (getIndex(newName) != -1) {
					throw new BadMenuInputException("중복된 이름입니다.");
				}
				if (checkName(newName) == false) {
					throw new BadMenuInputException("한글, 영문 대소문자만 입력 가능합니다.");
				}
			} catch (BadMenuInputException e) {
				e.printStackTrace();
				continue;
			}

			break;
		}

		System.out.println("변경하고자 하는 전화번호를 입력해주세요.(현재값:" + contact.getPhoneNumber() + ")\n" + "변경하지 않으려면 엔터를 눌러주세요. >");

		String newPhoneNumber;

		while (true) {

			newPhoneNumber = sc.nextLine();

			try {
				if (getPhoneNumberIndex(newPhoneNumber) != -1) {
					throw new BadMenuInputException("중복된 번호입니다.");
				}
				if ((newPhoneNumber != "") && (checkPhoneNumber(newPhoneNumber) == false)) {
					throw new BadMenuInputException("정상적인 번호를 입력해주세요.");
				}
			} catch (BadMenuInputException e) {
				e.printStackTrace();
				continue;
			}

			break;
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

			if (checkString(newName)) {
				companyContact.setName(newName);
			}

			if (checkString(newPhoneNumber)) {
				companyContact.setPhoneNumber(newPhoneNumber);
			}

			if (checkString(newEmail)) {
				companyContact.setEmail(newEmail);
			}

			if (checkString(newAddress)) {
				companyContact.setAddress(newAddress);
			}

			if (checkString(newBirthday)) {
				companyContact.setBirthday(newBirthday);
			}

			if (checkString(newGroup)) {
				companyContact.setGroup(newGroup);
			}

			if (checkString(company)) {
				companyContact.setCompany(company);
			}

			if (checkString(division)) {
				companyContact.setDivision(division);
			}

			if (checkString(manager)) {
				companyContact.setManager(manager);
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

			if (checkString(newName)) {
				customerContact.setName(newName);
			}

			if (checkString(newPhoneNumber)) {
				customerContact.setPhoneNumber(newPhoneNumber);
			}

			if (checkString(newEmail)) {
				customerContact.setEmail(newEmail);
			}

			if (checkString(newAddress)) {
				customerContact.setAddress(newAddress);
			}

			if (checkString(newBirthday)) {
				customerContact.setBirthday(newBirthday);
			}

			if (checkString(newGroup)) {
				customerContact.setGroup(newGroup);
			}

			if (checkString(company)) {
				customerContact.setCompany(company);
			}

			if (checkString(product)) {
				customerContact.setProduct(product);
			}

			if (checkString(manager)) {
				customerContact.setManager(manager);
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

		if (searchIndex == -1) {
			System.out.println("삭제하고자하는 이름의 데이터가 존재하지 않습니다.");
			return;
		}

		for (int i = searchIndex; i < numOfContact - 1; i++) {
			contacts.get(i) = contacts.get(i+1);

		}
		numOfContact--;
		System.out.println("데이터가 삭제되었습니다.");

	}

	void searchInfoPrint() {

		System.out.println("검색을 시작합니다.");
		System.out.print("검색할 이름을 입력하세요. >");
		String name = getString();

		int searchIndex = getIndex(name);

		if (searchIndex == -1) {
			System.out.println("검색한 이름 " + name + " 의 정보가 없습니다.");
		} else {
			System.out.println("검색의 결과 ===========");
			contacts.get(searchIndex).showInfo();
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
			contacts.get(i).showInfo();
			System.out.println();
		}
	}

	void insertContact() {

	
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

		while (true) {

			name = getString();

			try {
				if (getIndex(name) != -1) {
					throw new BadMenuInputException("중복된 이름입니다.");
				}
				if (checkName(name) == false) {
					throw new BadMenuInputException("한글, 영문 대소문자만 입력 가능합니다.");
				}

			} catch (BadMenuInputException e) {
				e.printStackTrace();
				continue;
			}
			
			break;
		}

		System.out.print("전화번호 > ");

		while (true) {

			phoneNumber = getString();

			try {
				if (getPhoneNumberIndex(phoneNumber) != -1) {
					throw new BadMenuInputException("중복된 번호입니다.");
				}
				if (checkPhoneNumber(phoneNumber) == false) {
					throw new BadMenuInputException("정상적인 번호를 입력해주세요.");
				}
			} catch (BadMenuInputException e) {
				e.printStackTrace();
				continue;
			}

			break;
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

		if (select == 1) {
	
			System.out.println("회사 이름 >> ");
			String company = getString();
			System.out.println("부서 이름 >> ");
			String division = getString();
			System.out.println("직급 >> ");
			String manager = getString();

			contact = new CompanyContact(name, phoneNumber, email, address, birthday, group, company, division,
					manager);

		} else {

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

			if (contacts.get(i).getName().equals(name)) {
				searchIndex = i;
				break;
			}
		}

		return searchIndex;

	}

	private int getPhoneNumberIndex(String phoneNumber) {
		int searchIndex = -1;

		for (int i = 0; i < numOfContact; i++) {

			if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {
				searchIndex = i;
				break;
			}
		}

		return searchIndex;

	}

	private boolean checkString(String str) {
		boolean result = false;

		if (str != null && str.trim().length() > 0) {
			result = true;
		} else {
			System.out.println("공백은 입력 불가");
		}

		return result;
	}

	private boolean checkName(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) >= '가' && str.charAt(i) <= '힣') && !(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					&& !(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				System.out.println("한글, 영문 대소문자만 입력 가능합니다.");
				return false;
			}
		}

		return true;
	}

	private boolean checkPhoneNumber(String str) {

		try {
			Long.parseLong(str.replace("-", ""));

		} catch (Exception e) {
			return false;
		}

		return true;

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
