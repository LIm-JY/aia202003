package friend;

import java.util.InputMismatchException;

public class FriendMain {

	public static void main(String[] args) {
		
//		FriendInfoHandler handler = new FriendInfoHandler(10);
		FriendInfoHandler handler = FriendInfoHandler.getInstance();
		
		
		
		while(true) {
			System.out.println("====메뉴를 선택해주세요====");
			System.out.println(" "+Menu.INSERT_HIGH+". 고교 친구 저장");
			System.out.println(" "+Menu.INSERT_UNIV+". 대학 친구 저장");
			System.out.println(" "+Menu.PRINT_BASIC+".기본 정보 출력");
			System.out.println(" "+Menu.PRINT_ALL+".전체 정보 출력");
			System.out.println(" "+Menu.EXIT+".종료 ");
			System.out.println("======================");
			
			int choice=0;

			try {
				choice = handler.sc.nextInt();
				//InputMismatchException 인스턴스전달
			} catch (InputMismatchException e) {	//InputMismatchException
				System.out.println("정상적인 메뉴의 번호가 입력되지 않았습니다\n메뉴를 다시입력해주세요");
				handler.sc.nextLine();
				continue;
			}
			
			
			choice = handler.sc.nextInt();
			
			handler.sc.nextLine();	//앞의 버퍼 클리어
			
			switch(choice) {
				
			case Menu.INSERT_HIGH: case Menu.INSERT_UNIV:
				handler.addFreind(choice);
				break;
			
			case Menu.PRINT_BASIC:
				handler.ShowAllSimpleData();
				break;
			case Menu.PRINT_ALL:
				handler.ShowAllData();
				break;
			case Menu.EXIT:
				System.out.println("프로그램을 종료합니다.");
				return;
			
			}
			
			
			
		}

	}

}
