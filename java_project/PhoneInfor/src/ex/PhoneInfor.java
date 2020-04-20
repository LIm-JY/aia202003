package ex;


public class PhoneInfor {	
	
	String name; //이름
	String phoneNumber; //전화번호
	String birthday; //생년월일
	
	public PhoneInfor(String name, String phoneNumber, String birthday) {
		
		this.name =name;
		
		this.phoneNumber = phoneNumber;
		
		this.birthday = birthday;
		
		}
	public PhoneInfor(String name, String phoneNumber) {
		
		this.name = name;
		
		this.phoneNumber = phoneNumber;
		
		this.birthday = null;
			
		
	}
	public void showInfor(String name, String phoneNumber, String birthday) {
		
		System.out.println(name+"\n"+phoneNumber);
		if(birthday!=null)
			  System.out.println(birthday);
			 
			  System.out.println();
	}
	
	
		
	
}
