package ver5;

import java.util.InputMismatchException;
import java.util.Scanner;

import ver5.exception.BadNumExcption;


//PhoneInfor타입의 배열로 친구들의 정보를
//저장, 수정, 삭제, 검색, 출력
public class PhoneBookManager {
		//	200428
	//	1. manager 클래스의 싱글톤 패턴 처리
	//
	//	1. 생성자에 접근제어지시자: private
	//	  -인스턴스 생성을 막는다.
	//	2. 공동으로 사용할 인스턴스 생성: static private
	//	3. 참조변수 반환 메서드: static public
	
	
	
	
	
	
//1. 배열 선언
private PhoneInfor[]books;
//배열에 저장된 요소의 개수
private int numOfInfo;

Scanner sc;
//생성자를 통해서 배열 생성, 요소의 개수 초기화
private PhoneBookManager(int num){
	//배열의 생성
	books = new PhoneInfor[num];
	//요소 개수의 초기화
	numOfInfo = 0;
	//Scanner 초기화
	sc = new Scanner(System.in);
		
	}
	private static PhoneBookManager manager = new PhoneBookManager(100);
	
	public static PhoneBookManager getInstance() {
		return manager;
	}
	
	//2.  배열에 정보저장
	//2.1 배열에 추가
	//2.2 사용자로 부터 받은 데이터로 인스턴스 생성
	
	//2.1 배열에 추가
	void addInfo(PhoneInfor info) {
		//배열에 numOfInfor 숫자-> index로 참조값을 저장
		books[numOfInfo] = info;
		//입력된 정보에 개수를 +1 증가 시킨다.
		numOfInfo++;
	}
	//2.2 사용자로 부터 받은 데이터로 인스턴스 생성
	void createInfo() {
		
		PhoneInfor info =null;
		String name = null; String phoneNum =null; String addr =null; String email = null;
		
	//		int select = sc.nextInt();
	//		sc.nextLine();
		
		int select=0;
	
			while(true) {
				System.out.println("1.대학 2.회사 3.동호회");
				System.out.println("입력하고자하는 번호를 입력해주세요");
			try {
				
			select = Integer.parseInt(sc.nextLine());
			
			//정상범위 1~3
			if(!(select >=1&&select<=3)) {
				BadNumExcption e = new BadNumExcption("잘못된 입력입니다");
				
					//강제적인 예외발생
					throw e;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("잘못 입력 되었습니다.\n 다시 입력해주시기 바랍니다.");
				//manager.sc.nextLine();
				continue;
			}
			catch (BadNumExcption e) {
				System.out.println("메뉴범위를 벗어난 숫자 입력입니다.\n다시 확인 후 입력해주세요");
			}
			catch (Exception e) {
				System.out.println("잘못 입력 되었습니다.\n 다시 입력해주시기 바랍니다.");
				continue;
				
			}
			//강제적으로 실행
	//		finally {
	//			manager.sc.nextLine();
	//		}
			break;
		}
			
			while(true){
	
		
	//		if(!(select>0 && select<5)) {
	//			
	//		}
		
		
		//2.2.1 기본정보 수집: 이름, 번호, 주소, 이메일
		
		System.out.println("이름을 입력해주세요.");
		name = sc.nextLine();
		
		System.out.println("번호을 입력해주세요.");
		phoneNum = sc.nextLine();
		
		System.out.println("주소를 입력해주세요.");
		addr = sc.nextLine();
		
		System.out.println("이메일을 입력해주세요.");
		email = sc.nextLine();
		
		
		try {
		
		if(name.trim().isEmpty()||phoneNum.trim().isEmpty()
		||addr.trim().isEmpty()||email.trim().isEmpty()) {
			
			StringEmptyException e = new StringEmptyException();
			throw e;
			
		}
		}catch (StringEmptyException e) {
			System.out.println("기본정보는 공백없이 모두 입력해 주셔야 합니다.");
			System.out.println("다시 입력해주세요.\n");
			continue;
		}
		
		break;
	}
		
		switch(select) {
	//		case 1:
	//			//2.2.2 기본 클래스로 인스턴스생성
	//			info = new PhoneInfor(name, phoneNum, addr, email);
	//			break;
		case MenuInterface.UNIV:
			System.out.println("전공(학과)를 입력해주세요");
			String major = sc.nextLine();
			System.out.println("학년 정보를 입력해주세요");
			String grade = sc.nextLine();
			
			
			
			//2.2.3 대학 클래스로 인스턴스생성
			info = new PhoneUnviInfor(name, phoneNum, addr, email, major, grade);
			break;
		case MenuInterface.COMPANY:
			System.out.println("회사의 이름을 입력해주세요");
			String company = sc.nextLine();
			System.out.println("부서의 이름을 입력해주세요");
			String dept = sc.nextLine();
			System.out.println("직무(직급)정보를 입력해주세요");
			String job = sc.nextLine();
			
			
			//2.2.4 회사 클래스로 인스턴스생성
			info = new PhoneCompanyInfor(name, phoneNum, addr, email, company, dept, job);
			break;
		case MenuInterface.CAFE:
			System.out.println("동호회 이름을 입력해주세요");
			String cafeName = sc.nextLine();
			System.out.println("닉네임을 입력해주세요");
			String nickName = sc.nextLine();
			
			
			//2.2.5 동호회 클래스로 인스턴스생성
			info = new PhoneCafeInfor(name, phoneNum, addr, email, cafeName, nickName);
			break;
			
		}
	
				
		//2.3 생성된 인스턴스를 배열에 저장
		addInfo(info);
	
	}
	//3. 배열의 데이터 출력
	void showAllInfo() {
		
		//for each 반복문 : 현재 프로그램에서는 사용 불가
		
		//for 반복문	: 반복의 홧수 지정이 가능 NumOfInfo
		
		System.out.println("전체 정보를 출력합니다.===========");
		for(int i=0; i<numOfInfo; i++) {
			books[i].showAllInfo();
			System.out.println("-----------------------");
	
		}
		
		
	}
	//배열의 index 검색: 인스턴스의 name기준
	
	int searchIndex(String name) {
		
		int searchIndex = -1; //정상적인 index 값은 0이상의 값이 나온다, 찾지 못했을 때 구분 값으로 -1을 사용
		
		
		//배열의 반복으로 name값을 비교해서 index값을 찾는다
		for(int i=0; i<numOfInfo; i++) {
			if(books[i].name.equals(name)) {
				searchIndex =i;
				break;
			}
			
		}
		
		return searchIndex;
	}
	
		
	
	//4. 배열의 정보 검색: 이름 기준
	void showInfo() {
		
		System.out.println("검색하실 이름을 선택해주세요.");
		String name = sc.nextLine();
		
		int index = searchIndex(name);
				
		if(index<0) {
			System.out.println("검색하신 이름의 정보가 없습니다.");
			
		} else{
			System.out.println("-----------------");
			books[index].showBasicInfo();
			System.out.println("-----------------");
		}
	}
	
	
	//5. 배열의 정보 삭제: 이름 기준
	void deleteInfo() {
		System.out.println("삭제하고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("삭제하고자 하는 이름의 정보가 존재하지 않습니다.");
		}else { 
			
			//삭제 위치에서 왼쪽으로 시프트
			for(int i=index; i<numOfInfo-1;i--) {
				books[i]=books[i+1];
			}
	//			삭제가 되었으므로 요소의 개수도 -1
			numOfInfo--;
		}
			
	}
	
	
	//6. 배열의 정보 수정: 이름 기준
	void editInfo() {
		
		System.out.println("변경하고자 하는 이름을 입력해주세요");
		String name = sc.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("수정하고자 하는 이름이 정보가 존재하지 않습니다.");
		}else {
			
			String editName = books[index].name;
			
			System.out.println("수정 데이터 입력을 시작합니다.");
			System.out.println("이름은: "+ editName +"입니다.");
			System.out.println("전화번호를 입력해주세요.");
			String phoneNum = sc.nextLine();
			System.out.println("주소를 입력해주세요.");
			String addr = sc.nextLine();
			System.out.println("이메일을 입력해주세요.");
			String email = sc.nextLine();
			
			PhoneInfor info = null;
			
			//저장된 인스턴스가: 기본, 대학, 회사, 동호회
			if(books[index] instanceof PhoneCafeInfor) {
				System.out.println("동호회명을 입력해주세요.");
				String cafeName = sc.nextLine();
				System.out.println("닉네임을 입력해주세요");
				String nickName = sc.nextLine();
				
				
				info = new PhoneCafeInfor(editName, phoneNum, addr, email, cafeName, nickName);		
			
			}else if(books[index] instanceof PhoneUnviInfor) {
				System.out.println("전공을 입력해주세요.");
				String major = sc.nextLine();
				System.out.println("학년을 입력해주세요.");
				String grade = sc.nextLine();
				
				
				info = new PhoneUnviInfor(editName, phoneNum, addr, email, major, grade);
			
			}else if(books[index] instanceof PhoneCompanyInfor) {
				
				System.out.println("회사명을 입력해주세요.");
				String company = sc.nextLine();
				System.out.println("부서명을 입력해주세요.");
				String dept = sc.nextLine();
				System.out.println("직급을 입력해주세요");
				String job = sc.nextLine();
				
				
				info = new PhoneCompanyInfor(editName, phoneNum, addr, email, company, dept, job);
				
			}//else if(books[index] instanceof PhoneInfor) {
	//			
	//				
	//				info = new PhoneInfor(editName, phoneNum, addr, email);
	//					
	//			}
			//배열에 새로운 인스턴스를 저장
				books[index] = info;
				
			}
		}
		
	}
