package ver02;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		SmartPhone smartPhone = SmartPhone.getInstance();
		
		// 입력
		smartPhone.insertContact();
		
		// 전체 출력
		smartPhone.printAllData();
		
		// 이름 검색 후 결과 출력
		smartPhone.searchInfoPrint();
		
		// 이름 검색 후 정보 수정
		smartPhone.editContact();
		System.out.println();
		smartPhone.searchInfoPrint();
		System.out.println();
		smartPhone.searchInfoPrint();
		System.out.println();
		smartPhone.printAllData();
		
		
		// 이름 검색 후 삭제
		smartPhone.deleteContact();
		
		smartPhone.searchInfoPrint();
		
		smartPhone.printAllData();
		
		// 이름 검색 후 삭제
		smartPhone.deleteContact();
				
		smartPhone.searchInfoPrint();
				
		smartPhone.printAllData();
	}
}
