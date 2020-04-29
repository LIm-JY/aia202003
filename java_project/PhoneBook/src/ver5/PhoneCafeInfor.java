package ver5;

public class PhoneCafeInfor extends PhoneInfor{
	
	String cafeName;	//동호회명
	String nickName;	//닉네임
	
	
	public PhoneCafeInfor(String name, String phoneNum, String addr, String email, String cafeName, String nickName) {
		super(name, phoneNum, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}


	@Override
	public void showAllInfo() {
		// TODO Auto-generated method stub
		showBasicInfo();
		System.out.println("동호회 명: "+cafeName);
		System.out.println("닉네임: "+nickName);
	}
	

}
