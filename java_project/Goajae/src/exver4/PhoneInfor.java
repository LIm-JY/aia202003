package exver4;

public class PhoneInfor {
	
	String name;	//이름
	String phoneNum;//번호
	String addr;	//주소
	String email;	//이메일
	
	
	//초기화
	PhoneInfor(String name, String phoneNum, String addr, String email){
		this.name=name;
		this.phoneNum = phoneNum;
		this.addr=addr;
		this.email=email;
		
	}
	
	//기본정보
	void showBasicInfo(){
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phoneNum);
		System.out.println("주소: "+addr);
		System.out.println("이메일: "+email);
		
	}
	//전체정보 담을곳
	void showAllInfo() {
		//상속을 통해 오버라이딩
	}

}
