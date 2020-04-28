package exver4;

import java.util.Scanner;

public class PhoneBookManager {
	
	//배열생성
	PhoneInfor[]books;
	
	int numOfInfor;
	
	Scanner sc;
	
	
	//초기화
	public PhoneBookManager(int num) {
		
		//배열초기화
		books = new PhoneInfor [num];
		//Infor초기화
		numOfInfor =0;
		//Scanner초기화
		sc = new Scanner(System.in);
		
	}
	
	void createInfor() {
		
		System.out.println("친구의 종류(번호)를 선택하세요.");
		System.out.println("1.일반 2.대학 3.회사 4.동호회");
		
		String choice = sc.nextLine();
		
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		
		System.out.println("번호을 입력해주세요.");
		String phoneNum = sc.nextLine();
		
		System.out.println("주소를 입력해주세요.");
		String addr = sc.nextLine();
		
		System.out.println("이메일을 입력해주세요.");
		String email = sc.nextLine();
		
		PhoneInfor infor =null;
		
		switch (choice) {
		case "1":
			
			break;
		case "2":

			break;
		case "3":

			break;
		case "4":

			break;

		default:
			break;
		}
		
		
		
		
		
		
	}
	
	void inputInfor(PhoneInfor infor) {
		
		books[numOfInfor] = infor;
		numOfInfor++;
		
		
	}
	
	void searchInfor() {
		
	}
	
	void deleteInfor() {
		
	}
	void editInfor() {
		
	}
	

}
