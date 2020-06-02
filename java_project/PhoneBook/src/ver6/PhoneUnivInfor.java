package ver6;

//PhoneInfor 클래스를 상속해서 새로운 클래스를 정의
public class PhoneUnivInfor extends PhoneInfor {
	
	String major;
	String grade;
	
	
	public PhoneUnivInfor(String name, String phoneNum, String addr, String email, String major, String grade) {
		super(name, phoneNum, addr, email);
		this.major = major;
		this.grade = grade;
	}


	@Override
	public void showAllInfo() {
		showBasicInfo();
		System.out.println("전공: "+major);
		System.out.println("학년: "+grade);
		
	}

	

}
