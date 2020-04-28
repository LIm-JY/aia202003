package ver5;

public class PhoneBookMain implements MenuInterface {

	public static void main(String[] args) {
		
		PhoneBookManager manager = PhoneBookManager.getInstance();
		
		
		
		
		while(true) {
			System.out.println();
			
			Menu.showMenu();
			
			int select = manager.sc.nextInt();
			manager.sc.nextLine();
			
			
			switch(select) {
			case MAKE_FRIEND:
				
				manager.createInfo();
				break;
			case SEARCH_FRIEND:
				manager.showInfo();
				break;
			case DELETE_FRIEND:
				manager.deleteInfo();
				break;
			case EDIT_FRIEND:
				manager.editInfo();
				break;
			case PRINT_ALL:
				manager.showAllInfo();
				break;
			case EXIT:
				 System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

}
