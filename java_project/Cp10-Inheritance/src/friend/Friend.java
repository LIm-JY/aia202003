package friend;


/*	친구의 정보를 저장하기 위한 클래스
	 상속을 목적으로 기본클래스 정의
	 기본속성과 기능을 구성
*/

public class Friend {
	
	String name;		//친구의 이름
	String phoneNum;	//친구의 전화
	String addr;		//친구의 주소
	
	//생성자
	Friend(String name, String phoneNum, String addr){
		this.name=name;
		this.phoneNum=phoneNum;
		this.addr=addr;
	}
	void showBasicInfo() {
		System.out.println("이름: "+this.name);
		System.out.println("전화: "+this.phoneNum);
		System.out.println("주소: "+this.addr);
	
	}
	//상속의 목적 오버라이딩 할 메서드
	//기본데이터와 하위클래스의 데이터를 출력하도록 오버라이딩 한다
	void showData() {
		
	}
	
	
	
	

}
