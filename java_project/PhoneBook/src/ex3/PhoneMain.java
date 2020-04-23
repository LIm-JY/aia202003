package ex3;

public class PhoneMain {

	public static void main(String[] args) {
		

		
		PhoneBookManager manager = new PhoneBookManager();
		
		PhoneInforEx info = null;
		
		while(true) {
			info = manager.createInstance();
			info.showInfor();
		}
		
		
		
	}

}
