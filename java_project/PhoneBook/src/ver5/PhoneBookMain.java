package ver5;

import java.util.InputMismatchException;

import ver5.exception.BadNumExcption;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		
		
		
		while(true) {
			Menu.showMenu();
			
			
			
			int select=0;
			try {
				
				select = manager.sc.nextInt();
				//정상 범위는 1~6까지
				//MenuInterFace.MAKE_FRIEND: ~ MenuInterface.EXIT:
				if(!(select >= MenuInterface.MAKE_FRIEND&& select<=MenuInterface.EXIT)) {
					BadNumExcption e = new BadNumExcption("메뉴의 범위를 벗어나는 범위 입니다. \n 다시확인해주세요");
				
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
				System.out.println("메뉴범위를 벗어난 숫자 입력입니다.\n다시 확인 후 입력해주세요");// TODO: handle exception
			}
			catch (Exception e) {
				System.out.println("잘못 입력 되었습니다.\n 다시 입력해주시기 바랍니다.");
				continue;
				
			}
			finally {
				manager.sc.nextLine();
			}
			
			//manager.sc.nextLine();
			
			
			switch(select) {
			case MenuInterface.MAKE_FRIEND:
				manager.createInfo();
				break;
			case MenuInterface.SEARCH_FRIEND:
				manager.showInfo();
				break;
			case MenuInterface.DELETE_FRIEND:
				manager.deleteInfo();
				break;
			case MenuInterface.EDIT_FRIEND:
				manager.editInfo();
				break;
			case MenuInterface.PRINT_ALL:
				manager.showAllInfo();
				break;
			case MenuInterface.EXIT:
				 System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

}
