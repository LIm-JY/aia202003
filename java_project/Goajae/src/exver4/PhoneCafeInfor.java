package exver4;

public class PhoneCafeInfor extends PhoneInfor {

	String cafeName;
	String nickName;
	public PhoneCafeInfor(String name, String phoneNum, String addr, String email, String cafeName, String nickName) {
		super(name, phoneNum, addr, email);
		this.cafeName=cafeName;
		this.nickName=nickName;
	}
	@Override
	void showAllInfo() {

		super.showBasicInfo();
		System.out.println("카페명: "+cafeName);
		System.out.println("닉네임: "+nickName);
	}
		
}
