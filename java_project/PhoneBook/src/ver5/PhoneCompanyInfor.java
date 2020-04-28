package ver5;

public class PhoneCompanyInfor extends PhoneInfor{
	
	String company;	//회사명
	String dept;	//부서명
	String job;		//직급
	
	
	public PhoneCompanyInfor(String name, String phoneNum, String addr, String email, String company, String dept,
			String job) {
		super(name, phoneNum, addr, email);
		this.company = company;
		this.dept = dept;
		this.job = job;
	}



	@Override
	public void showAllInfo() {
		// TODO Auto-generated method stub
		super.showAllInfo();
		System.out.println("회사: "+company);
		System.out.println("부서: "+dept);
		System.out.println("직급: "+job);
	}

	
	
	
	
}
