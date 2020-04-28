package exver4;

public class PhoneUnivInfor extends PhoneInfor {

	String major;
	String year;
	
	


	
	
	PhoneUnivInfor(String name, String phoneNum, String addr, String email, String major, String year) {
		super(name, phoneNum, addr, email);
		// TODO Auto-generated constructor stub
		this.major=major;
		this.year=year;
	}






	void showAllInfo() {
		super.showBasicInfo();
		System.out.println("전공: "+major);
		System.out.println("학년: "+year);
		
		
	}
	
	
	

}
