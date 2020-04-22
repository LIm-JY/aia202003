package ver01;

public class PhoneBookMain {

	public static void main(String[] args) {
	
		PhoneInfor info = new PhoneInfor("손흥민", "000-8888-9999" , "2000.11.11");
		
		info.showinfor();
		
		info = new PhoneInfor("박지성","000-7777-5678");
		
		info.showinfor();

	}

}
