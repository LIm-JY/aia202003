package ver03;

/*Version 0.1
전화번호 관리 프로그램.
PhoneInfor 라는 이름의 클래스를 정의해 보자.
클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며, 
저장된 데이터의 적절한 출력이 가능하도록 메소드 정의
• 이름 name String 
• 전화번호 phoneNumber String 
• 생년월일 birthday String
단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.

Project : ver 0.20
"프로그램 사용자로부터 데이터 입력"
프로그램 사용자로부터 데이터를 입력 받아 클래스의 인스턴스를 생성하는 것이
핵심.
단 반복문을 이용해서 프로그램의 흐름을 계속 유지하도록 한다.
프로그램 종료를 하지 않으면, 다음과 같은 과정이 반복적으로 이루어짐.

키보드로부터 데이터 입력 
↓
입력 받은 데이터로 인스턴스 생성
↓
생성된 인스턴스의 메소드 호출

*/

public class PhoneInfor {	//데이터 저장 클래스
	
	//private: 변수의 직접참조를 막는다, 정보은닉
	private String name; 		//사용자이름
	private String phoneNumber; //전화번호
	private String birthday;	//생일

	//초기화를 위한 생성자
	PhoneInfor(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	PhoneInfor(String name, String phoneNumber){
//		this.name = name;
//		this.phoneNumber = phoneNumber;
		this(name, phoneNumber, "생일이 입력되지 않았습니다.");
		
		
	}
	
	
	void showinfor () {
		System.out.println("이름: "+this.name);
		System.out.println("전화번호: "+this.phoneNumber);
		System.out.println("생일: "+this.birthday);
//		if(this.birthday==null) {
//			System.out.println("생일이 입력되지 않았습니다.");
//		}else {
//		System.out.println("생일: "+this.birthday);
//		}
		
	}	
	
	
	//name 속상값과 전달받은 문자열을 비교해서 결과반환
	boolean checkName(String name) {
		return this.name.equals(name);
	}
}
