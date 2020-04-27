package ver4;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager(100);
		
		while(true) {
			System.out.println();
			
			Menu.showMenu();
			
			int select = manager.sc.nextInt();
			manager.sc.nextLine();
			
			
			switch(select) {
			case 1:
				manager.createInfo();
				break;
			case 2:
				manager.showInfo();
				break;
			case 3:
				manager.deleteInfo();
				break;
			case 4:
				manager.editInfo();
				break;
			case 5:
				manager.showAllInfo();
				break;
			case 6:
				 System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}

}
