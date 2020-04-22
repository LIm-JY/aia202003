package ver03;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
	
		PhoneBookManager manager = new PhoneBookManager();
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			
			Menu.showMenu();
			
		
			
			int selectNum = sc.nextInt();
			
			sc.nextLine();
			
			switch(selectNum) {
			
			case 1:
				//정보의 배열을 저장
				manager.addInfo();
				break;
			case 2:
				//친구의 이름검색
				manager.searchInfo();
				break;
			case 3:
				//친구정보 삭제
				manager.deleteInfo();
				break;
			case 4:
				//전체 친구 정보 
				manager.showAllData();
				break;
			case 5:
				//return;
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 입력입니다!");
				continue;
				
			}
			
			
			
			

//			//사용자의 입력 데이터를 인스턴스 생성
//			info = manager.createInstance();
//			//정보의 배열을 저장
//			manager.addInfor(info);
//			//전체리스트 출력
//			manager.showAllData();
//			//이름으로 검색
//			manager.searchInfo();
//			//이름으로 검색 후 삭제
//			manager.deleteInfo();
//			manager.showAllData();
			
			
		}		
	}

}
