package ex;

public class AbstractInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PersonalNumberStorage storage =
				PersonalNumber storage = new PersonalNumberStorageImpl(100);
		
		storage.addPersnalInfo("202020-1111115", "손흥민");
		storage.addPersnalInfo("111111-5555555", "박지성");
		
		System.out.println(storage.searchName("202020-1111115"));
		System.out.println(storage.searchName("111111-5555555"));

	}

}
