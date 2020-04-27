package ver4;


//상속을 위한 기본 클래스 구성
//인스턴스 생성의 목적이 없다
public class PhoneInfor {
	
	String name;	//친구의 이름
	String phoneNum;//친구의 전화번호
	String addr;	//친구의 주소
	String email;	//친구의 이메일
	
	//인스턴스 변수 초기화
	PhoneInfor(String name, String phoneNum, String addr, String email) {

		this.name = name;				
		this.phoneNum = phoneNum;		
		this.addr = addr;				
		this.email = email;				
	}
	
	//기본정보출력 메서드
	void showBasicInfo() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+phoneNum);
		System.out.println("주소: "+addr);
		System.out.println("이메일: "+email);
		
	}
	
	//전체정보출력
	void showAllInfo() {
		// 상속 후 오버라이딩을 통해 재구성
		
	}
	
	

}
