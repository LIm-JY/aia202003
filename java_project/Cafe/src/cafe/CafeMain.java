package cafe;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		CafeManager manager = new CafeManager();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Menu.boardMenu();
			
			String selNum = sc.nextLine();
			
			switch(selNum) {
			
			case "1":
				manager.showMenuInfo();
					break;
			case "2":
				manager.showMenuInfo2();
					break;
			case "3":
				manager.showMenuInfo3();
					break;
			case "4":
				manager.showMenuInfo4();
				break;
			case "5":
					System.exit(0);
			default:
				continue;
				
			}
		}
	}
}

