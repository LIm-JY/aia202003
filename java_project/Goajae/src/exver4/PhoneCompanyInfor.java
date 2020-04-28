package exver4;

public class PhoneCompanyInfor extends PhoneInfor {
	
	String company;
	String rank;
	
	
	
	PhoneCompanyInfor(String name, String phoneNum, String addr, String email, String company, String rank) {
		super(name, phoneNum, addr, email);
		this.company=company;
		this.rank=rank;
		
	}
	@Override
	void showAllInfo() {
		// TODO Auto-generated method stub
		super.showBasicInfo();
		System.out.println("회사명: "+ company);
		System.out.println("직급: "+ rank);
	}
	
	

}
