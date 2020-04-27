package ver4;

//PhoneInfor 클래스를 상속해서 새로운 클래스를 정의
public class PhoneUnviInfor extends PhoneInfor {
	
	String major;
	String grade;
	
	
	public PhoneUnviInfor(String name, String phoneNum, String addr, String email, String major, String grade) {
		super(name, phoneNum, addr, email);
		this.major = major;
		this.grade = grade;
	}


	@Override
	void showAllInfo() {
		super.showAllInfo();
		System.out.println("전공: "+major);
		System.out.println("학년: "+grade);
		
	}

	

}
